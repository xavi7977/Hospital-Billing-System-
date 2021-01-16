dateType Class
*
***************************************************************************************/

class dateType{
private:
	int day;
	int month;
	int year;

public:
dateType(){
	day = 0;
	month = 0;
	year = 0;
}

void manipulate(){
	cout << "\nEnter day: ";
	cin >> day;
	cout << "\nEnter month: ";
	cin >> month;
	cout << "\nEnter year: ";
	cin >> year;
}

void print(){
	cout << day;
	cout << "/ ";
	cout << month;
	cout << "/ ";
	cout << year;
}

};
