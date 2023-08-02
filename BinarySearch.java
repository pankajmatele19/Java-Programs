import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {12,15,17,19,33,55,74,77};
        int target = 15;
        System.out.println(BSearch(arr,target));
    }

    static int BSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
