package Bt2;

import java.sql.SQLOutput;

public class Main {
    // Bài tập tìm số lớn nhất trong mảng số nguyên
    // Mục tiêu: sử dụng throw để ném ngoại lệ
    // Đề bài: Viết một chương trình Java để tìm số lớn nhất trong một mảng số nguyên.
    // Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.
    // Hướng dẫn: đặt 1 khối if(), kiểm tra length của mảng == 0 thì ném ngoại lệ với tin nhắn: “mảng rỗng”

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 7, 8};
        try {
            int max = checkMax(numbers);
            System.out.println("so lon nhat la: " + max);
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }

    private static int checkMax(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("mang rong");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
