#include "Shape.h"

class Circle:public Shape{
    private:
	    int radius;
    public:
	    Circle();
	    Circle(const char* c,int r);
	    void display();
	    float area();
	    float perimeter();
	    //add setter and getter functions
	    ~Circle();
};
