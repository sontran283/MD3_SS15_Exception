package ra.thrown;

public class CallThrow {
    public static void main(String[] args) {
        DemoThrow demoThrow = new DemoThrow();
        try {
            demoThrow.testThrow();
        } catch (CustomException e) {
            System.out.println("co ngoai le say ra");
        }
    }
}
