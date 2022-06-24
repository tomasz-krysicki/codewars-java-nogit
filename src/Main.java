public class Main {
    public static void main(String[] args) {

        for (double i = 1; i < 13; i++) {
            System.out.println((int) Math.ceil(i/3));
        }

        System.out.println(quarterOf(1));
        System.out.println(quarterOf(2));
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(4));
        System.out.println(quarterOf(5));
        System.out.println(quarterOf(6));
        System.out.println(quarterOf(7));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(9));
        System.out.println(quarterOf(10));
        System.out.println(quarterOf(11));
        System.out.println(quarterOf(12));

    }

    public static int quarterOf(int month) {
        return (int) Math.ceil((double)month / 3);
    }


}
