class Address{
    private: 
            int HouseNo;
            char* Colony; 
            char* Area; 
            char* City;
            int Pincode;
    public:
            Address();// • Default constructor
            Address(int hn,const char* col,const char* area,const char* city, int pin);// • Parameterized constructor
            void acceptData(Address** a, int size);// • Accept Function for data input
            void displayData(Address** a, int size);// • Display function for data display
            //bool isAddressSame(Address ad);// • Write function to find whether two addresses are same or different.
            void operator==(Address &ad);// • Overlaod == operator
           ~Address();
};