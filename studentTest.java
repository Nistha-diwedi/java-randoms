abstract class student{
    abstract void takeexam();
}
class PhdStudent extends student{
    void takeexam(){
        System.out.println("The PhdStudent gives his final defense presentation");
    }
}
class GradStudent extends student{
    void takeexam(){
        System.out.println("The Graduate Student gives a writtenpaper");
    }
}
public class studentTest {
    public static void main(String[] args) {
        PhdStudent stu1 = new PhdStudent();
        GradStudent stu2 = new GradStudent();
        stu1.takeexam();
        stu2.takeexam();
    }
}
