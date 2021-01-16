#include <iostream>

using namespace std;

/**************************************************************************************
*personType Class
*
***************************************************************************************/
class personType{
private:
		char name[100];
public:
	
void getName(){
	gets(name);
}

void print(){
	cout << name;
}
};
