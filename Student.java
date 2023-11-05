public class Student
{
String name;
int rollno;
int age;
void info()
{
System.out.println("Name: "+name);
System.out.println("Roll Number: "+rollno);
System.out.println("Age: "+age);
}
public static void main(String[] args) {
Student student = new Student();
// Accessing and property value
student.name = "Bill Gates";
student.rollno = 16;
student.age = 58;
// Calling method
student.info();
}
}