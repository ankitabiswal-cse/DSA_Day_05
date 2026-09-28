public class FrequencyOfAnElement {
    public static void main(String[] args){

        int[] arr = {2,4,2,5,6,2,7,4,2,2,3,4,2};

        int target = 2;
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if (arr[i] == target){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times");
    }
}
