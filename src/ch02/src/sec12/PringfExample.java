package ch02.src.sec12;

public class PringfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("Merchandise's price:%d\n", value);
        System.out.printf("Merchandise's price:%6d\n", value);
        System.out.printf("Merchandise's price:%-6d\n", value);
        System.out.printf("Merchandise's price:%06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f \n", 10, area);

        String name = "James";
        String job = "theif";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
