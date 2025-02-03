public class UncommonBugSolution {
    public static void main(String[] args) {
        long x = Integer.MAX_VALUE;
        long y = 1;
        long z = x + y; // No overflow with long
        System.out.println(z); // Prints the correct positive value
    }
}