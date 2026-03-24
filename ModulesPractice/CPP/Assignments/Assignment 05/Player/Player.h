class Player{
    private:
        char* name;
        int age;
        char* country;
    public:
        Player();
        Player(const char* nm, int ag, const char* cntry);
        void sortArray(Player** p, int size);
        void acceptData(Player** p, int size);
        void displayData(Player** p, int size);
};