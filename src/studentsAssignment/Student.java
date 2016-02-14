package studentsAssignment;

import java.util.ArrayList;

class Student{
    
String name;
String address;
int age;
ArrayList<Boolean> subjects; 
//= new ArrayList<Boolean>();


Student(String _name, String _address, int _age, ArrayList<Boolean> _subjects){
    name = _name;  
    address = _address;
    age = _age;
    subjects = _subjects;
    
    
}

public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("Student object: ");
	sb.append(name);
	sb.append(", ");
	sb.append(address);
	sb.append(", ");
	sb.append(age);
	sb.append(", ");
	for (int i = 0; i < subjects.size(); i++){
		sb.append(subjects.get(i));
		sb.append(" ");
	}
	String str = sb.toString();
	return(str);
}

}