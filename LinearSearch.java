import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,4,6,2,16,62};
//
//        int num = LSearch(arr,2);
//        System.out.println("Number found at index "+num);

//        String name = "Pankaj";
//        char target = 'P';
//        int index = LStrSearch(name,target);
//
//        System.out.println(Arrays.toString(name.toCharArray()));
//
//        if(index == -1){
//            System.out.println("Character Not Found");
//        }
//        else {
//            System.out.println("Character found at position " + index);
//        }
//        int min = MinArray(arr);
//        System.out.println(min);

        int max = MaxArray(arr);
        System.out.println(max);
    }

//    static int LStrSearch(String name,char value){
//
//        for(int i=0; i<name.length(); i++){
//
//            if(name.charAt(i) == value){
//                return i;
//            }
//        }
//        return -1;
//    }
//    static int LSearch(int[] arr,int value){
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == value){
//                return i;
//            }
//        }
//        return -1;
//    }

//    static int MinArray(int[] arr){
//        int ans = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < ans){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }

    static int MaxArray(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}