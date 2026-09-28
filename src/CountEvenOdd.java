public class CountEvenOdd {
    public static void main(String[] args){

        int[] arr = {20,35,45,67,80,88,90,87,76,33,44,55,66,77,86,99};

        int evenCount = 0;
        int oddCount= 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Number ="+evenCount);
        System.out.println("Odd Numbers ="+oddCount);
    }
}
