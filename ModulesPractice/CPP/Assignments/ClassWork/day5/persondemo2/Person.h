class Person{
   private:
	   int pid;
	   char *pname;
	   int age;
   public: 
	   Person();
	   Person(int pid,const char* nm,int a);
	   Person(Person &p);
	   void setPid(int id);
	   void setPname(const char* nm);
	   void setAge(int a);
	   int getPid();
	   char * getPname();
	   int getAge();
	   void display();
	   ~Person();
};
