public class SumOfEvenElement {
    public static void main(String[] args){
        int[] arr = {23,34,32,30,66,65,64,57,89,88};

        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]  % 2 == 0){
                sum = sum+arr[i];
            }
        }
        System.out.println("Sum Of Even Elements ="+sum);
    }
}
