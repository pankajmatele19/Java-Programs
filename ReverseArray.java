import java.util.Arrays;

public class ReverseArray {

    public static void main(String []args){

        int arr[] = {1,2,3,4,5,6};
        int[] result = reverse(arr,0,5);
        System.out.println(Arrays.toString(result));

    }

    static int[] reverse(int[] arr, int start, int end){

        int temp;

        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

}
