public class Test {
    public static final int i = 0;
    public static int j = 0;
    private int k;

    public Test(int k) {
        this.k = k;
    }

    public static void main(String[] args) {
        Test test = new Test(1000);
        System.out.println(test);
    }
}
