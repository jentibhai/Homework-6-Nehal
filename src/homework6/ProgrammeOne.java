package homework6;

public class ProgrammeOne {
    int a = 10;
    int b = 20;


    public static void main(String[] args) {
        ProgrammeOne obj = new ProgrammeOne();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.myMethod();
    }

    public void myMethod(){
        System.out.println(a);
        System.out.println(b);


}
}
