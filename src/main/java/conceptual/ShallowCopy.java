package conceptual;


class Course{


     String subject1;
    String subject2;
    String subject3;

    public Course(String subject1,String subject2,String subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

}
class Student  implements Cloneable  {
    int studentId;
    String studentName;
    Course course;

    public Student(int id , String sName, Course course){

        this.studentId = id;
        this.studentName = sName;
        this.course = course;

    }

    protected Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
}
public class ShallowCopy {

    public static void main(String []args){

        Course course = new Course("Physics","Maths","Computer");
        Student student1 = new Student(11,"Preetesh",course);

        Student student2 = null;

        try{
            student2 = (Student)student1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println(student1.course.subject1 + "           subject 1 of first student");
        System.out.println(student2.course.subject1 + "           subject 1 of first student");

System.out.println("After modification");

student1.course.subject1 = "Biology";

        System.out.println(student1.course.subject1 + "           subject 1 of first student");
        System.out.println(student2.course.subject1 + "           subject 1 of first student");




    }








}
