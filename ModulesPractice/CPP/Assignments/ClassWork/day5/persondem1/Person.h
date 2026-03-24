class Person{
  private:
	  int pid;
	  char pname[100];
	  int age;
	  char addr[100];
  public:
	  Person();
	  Person(int id,const char* nm,int a,const char* address);
	  //void setPid(int id);
	  //void setPname(const char* nm);
	  //void setAge(int a);
	  //void setAddr(const char* address);
	  //int getPid();
	  //char * getPname();
	  //char * getAddr();
	  //int getAge();
	  void display();
};
