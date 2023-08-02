import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

//        int[] arr = {1,2,6,3,10};
//        swap(arr,0,2);
//        System.out.println(Arrays.toString(arr));

        String name = "Pankaj";
        int count = countA(name);
        System.out.println(count);
    }

//    static void swap(int arr[], int num1, int num2) {
//        int temp = arr[num1];
//        arr[num1] = arr[num2];
//        arr[num2] = temp;
//    }


    public static int countA(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                count++;
            }
        }
        return count;

    }
}