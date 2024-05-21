
class Student{
    //name of student
    public void name_of_student(String name){
        System.out.println(String.format("Student name is : %s", name));
    }
    //Grade of the student
    public void grade(double grade){
        System.out.println(String.format("Student grade is : %.2f", grade));
    }
    //static method
    public static void className(String name){
        System.out.println(String.format("Object name is : %s", name));
    }
}



public class InstanceMethod {
    public static void main(String args[]){
        //Create student1 object
        Student student1=new Student();
        student1.name_of_student("Stacy");
        student1.grade(3.25);
        Student.className("student1");

        Student student2=new Student();
        student2.name_of_student("Kevin");
        student2.grade(3.75);
        Student.className("student2");

        Student student3=new Student();
        student3.name_of_student("Raj");
        student3.grade(3.10);
        Student.className("student3");
    }

}
