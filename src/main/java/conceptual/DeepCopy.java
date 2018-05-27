package conceptual;


class Course1 implements Cloneable{


    String sub1;
    String sub2;
    String sub3;




    public Course1(String subject1,String subject2,String subject3){
        this.sub1 = subject1;
        this.sub2 = subject2;
        this.sub3 = subject3;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
class Student1  implements Cloneable  {
    int studentId;
    String studentName;
    Course1 course;

    public Student1(int id , String sName, Course1 course){

        this.studentId = id;
        this.studentName = sName;
        this.course = course;

    }

    protected Object clone() throws CloneNotSupportedException{

        Student1 student = (Student1)super.clone();
        student.course = (Course1) course.clone();

        return student;


    }
}
public class DeepCopy {

    public static void main(String[] args) {

        Course1 course = new Course1("Physics", "Maths", "Computer");
        Student1 student1 = new Student1(11, "Preetesh", course);

        Student1 student2 = null;

        try {
            student2 = (Student1) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student1.course.sub1 + "           subject 1 of first student");
        System.out.println(student2.course.sub1 + "           subject 1 of second student");

        System.out.println("After modification");

        student2.course.sub1 = "Biology";

        System.out.println(student1.course.sub1 + "           subject 1 of first student");
        System.out.println(student2.course.sub1 + "           subject 1 of second student");


    }
}
