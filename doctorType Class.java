doctorType Class


class doctorType : public personType
{

private:
	char specialisation[100];

public:
	doctorType(){
		strcpy(specialisation, "physician");
	}

	void manipulate(void);
	void print(void);

};

void doctorType::manipulate(){
	cout << "\nEnter Name :";
	cin.ignore();
	getName();
	cout << "\nEnter the specialisation :";
	gets(specialisation);

}


void doctorType::print(){
	cout << "\nName : ";
	//print();
	cout << "You are specialised in ";
	puts(specialisation);
}
