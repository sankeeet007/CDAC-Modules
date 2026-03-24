class Date{
    private:
        int dd;
        int mm;
        int yyyy;
    public:
        Date();
        Date(int d, int m, int y);
        void acceptDate();
        void displayDate();
        void operator==(Date d);
        void operator!=(Date d);
        Date operator+(Date d);
        Date operator-(Date d);
        ~Date();
};