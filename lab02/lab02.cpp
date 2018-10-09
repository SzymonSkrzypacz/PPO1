#include <iostream>
#include <cstdlib>
#include <string>
#include <sstream>
#include <vector>
#include <time.h>
using namespace std;

#define STUDENTS_COUNT 10

class Student {
	public:
		string studentNo;
		string studentNazwisko;
		string studentImie;	
		int studentStatus;
		
		void setStudentNo(string studentNo) {
			this->studentNo = studentNo;
		}
		
		string getStudentNo() {
			return this->studentNo;
		}
		
		void setStudentNazwisko(string studentNazwisko) {
			this->studentNazwisko = studentNazwisko;
		}
		
		string getStudentNazwisko() {
			return this->studentNazwisko;
		}
		
		void setStudentImie(string studentImie) {
			this->studentImie = studentImie;
		}
		
		string getStudentImie() {
			return this->studentImie;
		}
			
		void setStudentStatus(int studentStatus) {
			this->studentStatus = studentStatus;
		}
		
		int getStudentStatus() {
			return this->studentStatus;
		}
};

string getRandomStudentNumber() {
	ostringstream ss;
	int randomNumber = rand() % 2000 + 37000;
	
	ss << randomNumber;
	
	return ss.str();
}

string getLosujNazwiska(){
	string tablicaNazwisk[10] = {"Baca","Kania","Bigos","Lewanbowski","Kwiatuszek","Palimak","Mazur","Zach","Delma","Last"};
	return tablicaNazwisk[rand()%10];
}

	string getLosujImiona(){
	string tablicaImion[10] = {"Andrzej","Ewelina","Tomasz","Anna","Zygmunt","Klaudia","Wojciech","Daria","Ryszard","Eugenia"};
	return tablicaImion[rand()%10];
	}
	
	int getLosujStatus(){
		 return (rand()%2);
	}
	
int main() {
	vector<Student> students;
	srand (time(NULL));
	for(int i = 0; i < STUDENTS_COUNT; i++) {
		Student student;
		student.setStudentNo(getRandomStudentNumber());
		student.setStudentNazwisko(getLosujNazwiska());
		student.setStudentImie(getLosujImiona());
		student.setStudentStatus(getLosujStatus());
		students.push_back(student);
	}
	
	cout  << "Students group have been filled." << endl << endl;
	
	for(int i = 0; i < students.size(); i++) {
		Student student = students.at(i);
		if(student.getStudentStatus()==1)
		cout << student.getStudentNazwisko() << " " << student.getStudentImie() << " " << "(" << student.getStudentNo() << ")" << endl;
	}
	
	return 0;
}
