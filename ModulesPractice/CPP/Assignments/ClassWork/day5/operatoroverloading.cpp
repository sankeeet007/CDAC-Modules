#include <iostream>
using namespace std;

class Complex{
	private:
		int real,imag;
	public:
		//default and parametrized constructor
		Complex(int a = 0, int b = 0):real(a),imag(b){}
		
		void display(){
			cout<<"The number: "<< real <<" + "<< imag<<"i"<<endl;
		}
                Complex(Complex &c);		
		Complex operator+(const Complex c);
		Complex operator-(const Complex c);
                Complex operator++(); //prefix
		Complex operator++(int);  //postfix
                friend ostream& operator<<(ostream& out, Complex &c);
		friend istream& operator>>(istream& in,Complex& c);
		~Complex(){}
				
};
/*
Complex::Complex(){
   real=0;
   imag=0;
}

Complex::Complex(int r,int i){
     real=r;
     imag=i;
}*/

Complex::Complex(Complex &c){
    this->real=c.real;
    imag=c.imag;
}

Complex Complex::operator+(const Complex c){
	cout<<"operator+complex"<<endl;
	Complex temp;
	temp.real = real+c.real;
	temp.imag = imag+c.imag;
	return temp;
}


Complex Complex::operator-(const Complex c){
	cout<<"operator- complex"<<endl;
	Complex temp;
	temp.real = real-c.real;
	temp.imag = imag-c.imag;
	return temp;
}
Complex Complex::operator++(){  
	cout<<"prefix operator++"<<endl;
	Complex temp;
	temp.real = ++this->real;
	temp.imag = ++this->imag;
	return temp;
}




Complex Complex::operator++(int){
	cout<<"postfix operator++"<<endl;
	Complex temp;
	temp.real = this->real++;
	temp.imag = this->imag++;
	return temp;
}

ostream& operator<<(ostream& out, Complex &c){
	//
	out<<"The number : "<<c.real<<"+"<<c.imag<<"i"<<endl;
	return out;
}

istream& operator>>(istream& in, Complex &c){
	cout<<"enetr real and imaginary part"<<endl;
	in>>c.real;
	in>>c.imag;
	return in;
}


int main(){
   Complex ob1(10,20),ob2(5,7);
   Complex ob3;
   ob3=ob1+ob2;   //ob1.operator+(ob2)
   ob1.display();
   ob2.display();
   cout<<"addition"<<endl;
   ob3.display();
   ob3=ob1-ob2;
   cout<<"Subtraction"<<endl;
   ob3.display();
   cout<<"Postfix"<<endl;
   ob3=ob1++;
   ob1.display();
   ob3.display();
   cout<<"prefix"<<endl;
   ob3=++ob2;
   ob2.display();
   ob3.display();

   //using << and >> overloaded function
   cout<<"overloaded << and >> function"<<endl;
   cout<<ob3;
   Complex ob4;
   cin>>ob4;
   cout<<ob4;
   return 0;
}
