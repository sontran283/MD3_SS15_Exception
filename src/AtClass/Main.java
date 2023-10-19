package AtClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao 2 so: ");

            System.out.println("nhap vao so a: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("nhap vao so b: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("a / b = " + a / b);

        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("ko the chia cho 0");
            } else {
                System.out.println("du lieu nhap vao ko phai la so");
            }
        } finally {
            System.out.println("ket thuc chuog trinh");
        }
    }
}
