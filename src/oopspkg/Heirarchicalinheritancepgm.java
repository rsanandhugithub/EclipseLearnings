package oopspkg;

class Member
{
String name;
int age;
String phonenumber;
String address;
int salary;
public void printdetails()
{

      System.out.println("Name="+name);
      System.out.println("Age="+age);
      System.out.println("Phonenumber="+phonenumber);
      System.out.println("Address="+address);
      System.out.println("Salary="+salary);

   }
}

class Employee extends Member
{
	String specialization;
	
}

class Manager extends Member
{
String department;
}

public class Heirarchicalinheritancepgm {

	public static void main(String[] args) {
		
		Employee ob= new Employee();
		 ob.name="arun";
		 ob.age=24;
		 ob.phonenumber="876543279";
		 ob.address="abcd";
		 ob.salary=40000;
		 ob.printdetails();
		 System.out.println(ob.specialization);


		
		}
		
		
		
		
	}


