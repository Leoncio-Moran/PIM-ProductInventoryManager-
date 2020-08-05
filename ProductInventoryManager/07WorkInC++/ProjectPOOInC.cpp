#include <iostream>
#include <stdlib.h>
using namespace std;

class Person{
	private:
		string name;
		int age;
	public:
		Person(string,int);
		virtual void show();
};

class Teacher : public Person{
	private:
		string subject;
	public:
	Teacher(string,int,string);
	void show();
};

class Student : public Person{
	private:
		string studentCode;
		float finalGrade;
	public:
		Student(string,int,string,float);
		void show();	
};

Person::Person(string _name,int _age){
	name = _name;
	age = _age;
}

Student::Student(string _name,int _age,string _studentCode,float _finalGrade) : Person(_name, _age){
	studentCode = _studentCode;
	finalGrade = _finalGrade;
}

Teacher::Teacher(string _name,int _age,string _subject) : Person(_name,_age){
	subject = _subject;
}

void Person::show(){
	cout<<"Name: "<<name<<endl;
	cout<<"Age: "<<age<<endl;
}

void Teacher::show(){
	 Person::show();
	 cout<<"Subject: "<<subject<<endl;
}

void Student::show(){
	Person::show();
	cout<<"Student Code: "<<studentCode<<endl;
	cout<<"Final Grade: "<<finalGrade<<endl;
}

int main(){
	Person *person[3];
	cout<<"Group 3 -> C++ Example"<<endl;
	person[0] = new Student("Alexandra",20,"1753086659",14.41);
	person[1] = new Student("Josue",20,"1739583033",16.00);
	person[2] = new Teacher("Edison",49,"POO");
	
	cout<<"\n";
	person[0]->show();
	cout<<"\n";
	person[1]->show();
	cout<<"\n";
	person[2]->show();
	
}
