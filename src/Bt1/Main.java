package Bt1;

import java.util.Scanner;

public class Main {
    // Mục tiêu: luyện tập ném và bắt ngoại lệ
    // Viết một chương trình Java để tính tổng của hai số nguyên nhập vào từ bàn phím.
    // Nếu người dùng nhập vào một giá trị không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
    // biểu thức gọi scanner để trong try, catch bắt exeption in ra thông báo và đệ quy lại hàm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.println("nhap so nguyen thu nhat: ");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.println("nhap so nguyen thu hai: ");
            num2 = Integer.parseInt(scanner.nextLine());

            int sum = num1 + num2;
            System.out.println("tong hai so nguyen la: " + sum);

        } catch (Exception e) {
            System.out.println("khong hop le, vui long nhap lai");
            scanner.nextLine();

            main(args);
        } finally {
            scanner.close();
        }
    }
}