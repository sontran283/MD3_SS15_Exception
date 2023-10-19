package ra.thrown;

public class DemoThrow {
    public void testThrow() throws CustomException {
        // C1
        // throw new CustomException("test Throw exception");

        // C2
        CustomException customException = new CustomException("test Throw exception");
        throw customException;
    }
}
