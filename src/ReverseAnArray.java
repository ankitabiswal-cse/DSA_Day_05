public class ReverseAnArray {
    public static void main(String[] args){
        int[] arr = {45,89,78,67,56,45,67};

        int left = 0;
        int right = arr.length - 1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
         }
        for(int i = 0;i<arr.length;i++){
          System.out.println(arr[i]+" ");
       }
   }
}



























