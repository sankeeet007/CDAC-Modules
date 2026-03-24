class Payslip{
    private: 
        int EmpNo;
        char* EmpName;
        int DA;
        int HRA;
        int BasicSalary;
    public:
        Payslip();  //Default constructor
        Payslip(int empno, char* empnm, int da, int hra, int basicsal);   //Parameterized constructor
        void acceptData(Payslip** ps, int s);  //Accept Function for data input
        void displayData(Payslip** ps, int s);     //Display function for data display
        int calSalary(Payslip p);    //Function to calculate salary from DA, HRA and Basic Salary

};