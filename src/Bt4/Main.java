package Bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Bài tập chuyển đổi chuỗi về số nguyên
    // Mục tiêu: luyện tập xử lý ngoại lệ
    // Đề bài: Viết một chương trình Java để chuyển đổi một chuỗi thành số nguyên.
    // Nếu chuỗi không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và trả về giá trị mặc định là 0.
    // B1: tạo 1 biến string, láy dữ liệu từ bàn phím.
    // B2: tạo 1 List số nguyên.
    // B3: duyệt chuỗi đó, trong vòng lặp ép kiểu từng phần tử về Interger, đặt trong khối try -catch,
    // nếu vào catch thì add số 0 vào list và thông báo có 1 ký tự không phải số nguyên đưuọc thay thế =0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao moi chuoi (vi du: 012345678) ");

        String inputString = scanner.nextLine();
        List<Integer> lits = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(inputString.charAt(i)));
                lits.add(number);
            } catch (Exception e) {
                System.out.println("loi: ki tu khong phai la so nguyen, gia tri mac dinh la 0");
                lits.add(0);
            }
        }
        System.out.println("chuoi da chuyen doi thanh so nguyen la: " + lits);
    }
}
