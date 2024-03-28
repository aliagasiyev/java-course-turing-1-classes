package az.edu.turing.module02.Lab02;

public class TestApp {
    public static void main(String[] args) {
        Test test=new Test();
        String input= test.inputString();
        int result= test.computeSequence(input);
        System.out.println("Result:"+result);
    }
}
