package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13){
            System.out.println("It is right");
        }
        else{
            System.out.println("It is wrong");
        }
    }
}
