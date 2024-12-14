public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 10;
        try {
            while (--i >= 0) {
                System.out.println(i); 
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}