#include "Shape.h"

class Triangle:public Shape{
	private:
		int s1,s2,base,ht;
	public:
		Triangle();
		Triangle(const char* c,int s1,int s2,int b,int h);
		float area();
		float perimeter();
		//add setter methods
		//add getter methods
		void display();
		~Triangle();

};
