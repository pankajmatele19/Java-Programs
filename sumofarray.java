public class sumofarray {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 5 };
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }

}
