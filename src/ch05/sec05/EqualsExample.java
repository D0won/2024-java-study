package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVar1 and strVar2 are same.");
        } else
        {
            System.out.println("strVar1 and strVar2 are different");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1 and strVar2 are the same strings.");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4) {

            System.out.println("strVar3 and strVar4 are same.");
        }
        else
        {
            System.out.println("strVar3 and strVar4 are different");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3 and strVar4 are the same strings.");
        }
    }
}
