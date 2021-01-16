*patientType Class
*
***************************************************************************************/

class patientType : public personType{

private:
	int patientId;
	int age;

	dateType dob;
	dateType admissionDate;
	dateType dischargeDate;
	doctorType attendingPhysician;
public:
	patientType(){
		static int Id;
		patientId = ++Id;
		age = 0;
	}

	void manipulate(void);
	void print(void);

};

void patientType::manipulate(){
	cout << "\nEnter Age :";
	cin >> age;
	cout << "\nEnter Attending Physician details \n";
	attendingPhysician.manipulate(); // assumed that in personType the manipulate2() function will take the details holds the name
	cout << "\nEnter date of birth:";
	dob.manipulate();
	cout << "\nEnter Admission Date";
	admissionDate.manipulate();
	cout << "\nEnter Discharge Date";
	dischargeDate.manipulate();

}

void patientType::print(){
	cout << "PATIENT ID:";
	cout << patientId;
	cout << "\nAge :";
	cout << age;
	cout << "\n Attending Physician\n";
	attendingPhysician.print(); // assumed that in personType the print2() will print name of doctor
	cout << "\nDate of birth:";
	dob.print();
	cout << "\nAdmission Date:";
	admissionDate.print();
	cout << "\nDischarge Date:";
	dischargeDate.print();

}
