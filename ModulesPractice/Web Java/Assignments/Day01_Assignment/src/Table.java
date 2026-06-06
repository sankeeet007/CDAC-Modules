import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {

    private static final String DB_URL = "jdbc:mysql://localhost:3000/your_database_name";
    private static final String USER = "root";
    private static final String PASS = "password";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            System.err.println("Database connection failed! Check your credentials.\nError: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Create Table");
            System.out.println("2. Display Columns of a Table");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleCreateTable();
                    break;
                case "2":
                    handleDisplayColumns();
                    break;
                case "3":
                    System.out.println("Exiting application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void handleCreateTable() {
        System.out.print("\nEnter Table Name: ");
        String tableName = scanner.nextLine().trim();
        if (tableName.isEmpty()) {
            System.out.println("Table name cannot be empty.");
            return;
        }

        List<ColumnData> columns = new ArrayList<>();
        String primaryKeyColumn = null;

        while (true) {
            System.out.println("\n--- Table Creation Menu (" + tableName + ") ---");
            System.out.println("a. Add Column");
            System.out.println("b. Set Primary Key");
            System.out.println("c. Save & Exit to Main Menu");
            System.out.print("Select an option: ");

            String option = scanner.nextLine().trim().toLowerCase();

            switch (option) {
                case "a":
                    // Add Column
                    System.out.print("Enter Column Name: ");
                    String colName = scanner.nextLine().trim();
                    if (colName.isEmpty()) {
                        System.out.println("Column name cannot be empty.");
                        break;
                    }

                    System.out.println("Select Data Type:");
                    System.out.println("1. VARCHAR(255)");
                    System.out.println("2. INT");
                    System.out.println("3. FLOAT");
                    System.out.print("Option: ");
                    String typeChoice = scanner.nextLine().trim();

                    String dataType;
                    if ("1".equals(typeChoice)) {
                        dataType = "VARCHAR(255)";
                    } else if ("2".equals(typeChoice)) {
                        dataType = "INT";
                    } else if ("3".equals(typeChoice)) {
                        dataType = "FLOAT";
                    } else {
                        System.out.println("Invalid data type selection. Column not added.");
                        break;
                    }

                    columns.add(new ColumnData(colName, dataType));
                    System.out.println("Column '" + colName + "' (" + dataType + ") added successfully.");
                    break;

                case "b":
                    // Set Primary Key
                    if (columns.isEmpty()) {
                        System.out.println("No columns created yet! Add a column first.");
                        break;
                    }

                    System.out.println("Select a column to act as Primary Key:");
                    for (int i = 0; i < columns.size(); i++) {
                        System.out.println((i + 1) + ". " + columns.get(i).name);
                    }
                    System.out.print("Option: ");
                    try {
                        int pkIndex = Integer.parseInt(scanner.nextLine().trim()) - 1;
                        if (pkIndex >= 0 && pkIndex < columns.size()) {
                            primaryKeyColumn = columns.get(pkIndex).name;
                            System.out.println("Primary key set to: " + primaryKeyColumn);
                        } else {
                            System.out.println("Invalid index selection.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "c":
                    // Save
                    if (columns.isEmpty()) {
                        System.out.println("Cannot save an empty table. Add at least one column.");
                        break;
                    }
                    saveTableToDatabase(tableName, columns, primaryKeyColumn);
                    return; // Return to main menu

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void saveTableToDatabase(String tableName, List<ColumnData> columns, String primaryKeyColumn) {
        // Build the dynamic SQL query string
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE ").append(tableName).append(" (");

        for (int i = 0; i < columns.size(); i++) {
            ColumnData col = columns.get(i);
            sqlBuilder.append(col.name).append(" ").append(col.dataType);
            if (i < columns.size() - 1 || primaryKeyColumn != null) {
                sqlBuilder.append(", ");
            }
        }

        if (primaryKeyColumn != null) {
            sqlBuilder.append("PRIMARY KEY (").append(primaryKeyColumn).append(")");
        }

        sqlBuilder.append(")");

        String finalSql = sqlBuilder.toString();
        System.out.println("\nGenerating DDL: " + finalSql);

        // Execute via JDBC
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(finalSql);
            System.out.println("Table '" + tableName + "' successfully created in the database.");

        } catch (SQLException e) {
            System.err.println("Error executing SQL: " + e.getMessage());
        }
    }

    private static void handleDisplayColumns() {
        System.out.print("\nEnter the Table Name to view its columns: ");
        String tableName = scanner.nextLine().trim();

        if (tableName.isEmpty()) {
            System.out.println("Table name cannot be empty.");
            return;
        }

        // We use PreparedStatement combined with DatabaseMetaData to securely inspect columns
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            DatabaseMetaData metaData = conn.getMetaData();

            // Fetch columns for the table. Arguments: catalog, schemaPattern, tableNamePattern, columnNamePattern
            try (ResultSet rs = metaData.getColumns(null, null, tableName, null)) {

                boolean hasColumns = false;
                System.out.println("\n--- Columns in table '" + tableName + "' ---");

                while (rs.next()) {
                    hasColumns = true;
                    // COLUMN_NAME is a standard field returned by getColumns()
                    String columnName = rs.getString("COLUMN_NAME");
                    System.out.println("- " + columnName);
                }

                if (!hasColumns) {
                    System.out.println("No columns found. Does the table exist? (Note: Table names might be case-sensitive in your DB).");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error reading table structure: " + e.getMessage());
        }
    }

    // Helper class to hold column details internally during the loop
    private static class ColumnData {
        String name;
        String dataType;

        ColumnData(String name, String dataType) {
            this.name = name;
            this.dataType = dataType;
        }
    }
}