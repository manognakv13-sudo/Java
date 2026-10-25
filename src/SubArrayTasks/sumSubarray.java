package SubArrayTasks;

public class sumSubarray {
    public static void main(String[] args) {
        int[] arr = {2,4,6};

        for(int i =0;  i< arr.length; i++){
            for(int j = i; j < arr.length ; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}
