#ifndef SHAPE_H
#define SHAPE_H
//abstract class
class Shape{
   private:
	   int id;
	   char color[10];
           static int generateId(){
	      count++;
	      return count;
	   }	   
   public:
	   static int count;
	   Shape();
	   Shape(const char* cl);
	   //add all getter and setter function
	   int getId();
	   virtual void  display();
	   virtual float area()=0; //pure virtual function
	   virtual float perimeter()=0;
	   virtual ~Shape();

};

#endif
