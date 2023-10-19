package Bt3;

public class Main {
    // Bài tập tính tổng 1 mảng số nguyên
    // Mục tiêu: luyện tập xử lý ngoại lệ
    // Đề bài: Viết một chương trình Java để tính tổng của một mảng số nguyên.
    // Nếu một phần tử trong mảng không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
    // Hướng dẫn: duyệt mảng cộng các phần tử bình thường, nhưng biểu thức tính cộng để trong khối try-catch.

    public static void main(String[] args) {
        String[] inputArray = {"1", "2", "3", "four", "5"};

        try {
            int[] numbers = convertToIntArray(inputArray);
            int sum = checkSum(numbers);
            System.out.println("Tổng của mảng là: " + sum);
        } catch (Exception e) {
            System.out.println("Lỗi: Phần tử không phải số nguyên. Phần tử bị bỏ qua.");
        }
    }

    public static int[] convertToIntArray(String[] arr) throws Exception {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }

    public static int checkSum(int[] arr) throws Exception {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
