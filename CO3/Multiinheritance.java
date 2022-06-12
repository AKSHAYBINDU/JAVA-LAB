import java.util.*;
class multiInheritance
{
public static void main(String args[])
{
int n,i;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employee");
n=sc1.nextInt();
Teacher t[]=new Teacher[n];
for(i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("--------------------");
System.out.println("--------------------");
System.out.println("details are");
System.out.println("--------------------");
for(i=0;i<n;i++)
{
t[i].display();
}
}
}
class Employee
{
int empid;
String name;
double salary;
String address;
Employee()
{
Scanner s=new Scanner(System.in);
System.out.println("enter employee id");
empid=s.nextInt();
System.out.println("enter employee name");
name=s.next();
System.out.println("enter employee salary");
salary=s.nextDouble();
System.out.println("enter employee address");
address=s.next();
}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter employee department");
department=sc3.next();
System.out.println("enter subject");
subject=sc3.next();
}
void display()
{
System.out.println("--------------------");
System.out.println("id:"+empid);
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("department:"+department);
System.out.println("subject:"+subject);
System.out.println("--------------------");
}
}