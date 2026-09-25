public class TestFactorial {

    public static void main(String[] args) {

        if (Factorial.factorial(0) != 1) {
            throw new AssertionError("Test failed for 0");
        }

        if (Factorial.factorial(1) != 1) {
            throw new AssertionError("Test failed for 1");
        }

        if (Factorial.factorial(5) != 120) {
            throw new AssertionError("Test failed for 5");
        }

        if (Factorial.factorial(10) != 3628800) {
            throw new AssertionError("Test failed for 10");
        }

        System.out.println("All tests passed!");
    }
}
