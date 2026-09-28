public class LargestSmallestDifference {
    public static void main(String[] args){
        int[] arr = {34,56,78,90,45,67,98,780,789,56,999,1000,10};

        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        int difference = largest - smallest;

        System.out.println("Largest ="+largest);
        System.out.println("Smallest ="+smallest);
        System.out.println("Difference ="+difference);
    }
}
