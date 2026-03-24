class myString{
    private:
            char* p;
            int size;
    public:
            myString();                           //default constructor
            myString(const char* p,int size);    //parameterised constructor
            myString(myString &ms1);              //copy constructor
            // void acceptString();
            void displayString();
            ~myString();                            //destructor
};