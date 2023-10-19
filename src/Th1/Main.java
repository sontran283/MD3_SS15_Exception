package Th1;

public class Main {
    // sử dụng khối finally để bắt exception trong Java
    public static void main(String[] args) {
        new Main().doTheWork();
    }

    private void doTheWork() {
        Object obj = null;
        for (int i = 0; i < 5; i++) {
            try {
                obj = makeObject(i);
            } catch (IllegalArgumentException e) {
                System.out.println("error: " + e.getMessage());
                return;
            } finally {
                System.out.println("all");
                if (obj == null) {
                    System.exit(0);
                }
            }
            System.out.println(obj);
        }
    }

    private Object makeObject(int type) throws IllegalArgumentException {
        if (type == 1) {
            throw new IllegalArgumentException("ko giong voi  " + type);
        }
        return new Object();
    }
}
