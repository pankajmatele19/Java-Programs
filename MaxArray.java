public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {1,44,20,5,8};
        System.out.println(maxrange(arr,1,2));
    }

    static int maxrange(int[] arr,int start,int end) {
        int maxval = arr[start];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }

        return maxval;
    }

    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
