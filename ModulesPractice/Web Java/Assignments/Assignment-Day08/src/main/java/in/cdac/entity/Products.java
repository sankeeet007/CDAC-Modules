package in.cdac.entity;

public class Products {

    private int    categoryId;
    private int    productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productImageUrl;        // ✅ added

    public Products() {
    }

    public Products(int categoryId, int productId, String productName,
                    String productDescription, double productPrice, String productImageUrl) {
        this.categoryId        = categoryId;
        this.productId         = productId;
        this.productName       = productName;
        this.productDescription = productDescription;
        this.productPrice      = productPrice;
        this.productImageUrl   = productImageUrl;   // ✅ added
    }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

    public double getProductPrice() { return productPrice; }
    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }

   // ✅ added
}