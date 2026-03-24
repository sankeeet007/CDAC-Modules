#include<iostream>
using namespace std;


template <typename T>
T add(T a,T b){
   return a+b;

}

template<typename T>
T max(T a,T b){
   return a>b?a:b;
}

int main(){
        
	cout<<"integer:" <<add<int>(12,13);
	cout<<"float:"<<add<float>(12.5f,45.6f);
	cout<<"int max"<<max<int>(12,34);
	cout<<"double max"<<max<double>(23.5,34.6);
	cout<<"float max"<<max<float>(34.4f,23.6f);
        return 0;
}

