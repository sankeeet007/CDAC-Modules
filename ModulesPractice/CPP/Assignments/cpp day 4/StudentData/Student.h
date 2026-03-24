class Student{
	private:
		int id;
		char name[100];
		char address[100];
		int age;
	public:
		Student();
		Student(int sid,const char* nm,const char* adrs, int a);
		
		void display();
};


