public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        System.out.println(mod(a, b));
        System.out.println(pow(a, b));
        System.out.println(tMin(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    private static int mod(int a, int b) {
        return a % b;
    }

    private static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    private static int tMin(int a, int b) {
        return Math.min(a, b);
    }

}