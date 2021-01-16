*billType Class


class billType{

private:

	int patientId;
	int pharmacyCharge;
	int doctorFee;
	int roomCharge;

public:

	billType(int x){
		patientId = x;
		pharmacyCharge = 0;
		doctorFee = 0;
		roomCharge = 0;
	}
	void manipulate(void);
	void print(void);
};

void billType::manipulate(){
	cout << "\nEnter Hospital Charges \n";
	cout << "1) Enter Pharmacy Charge :";
	cin >> pharmacyCharge;
	cout << "\n 2) Doctor Fee : ";
	cin >> doctorFee;
	cout << "\n3) Room Charges : ";
	cin >> roomCharge;
}

void billType::print(){
	cout << "PATIENT :";
	cout << patientId;
	cout << "\n Hospital Charges \n";
	cout << "1) Pharmacy Charge :";
	cout << pharmacyCharge;
	cout << "\n2) Doctor Fee : ";
	cout << doctorFee;
	cout << "\n3) Room Charges : ";
	cout << roomCharge;
}
