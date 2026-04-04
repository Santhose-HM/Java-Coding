package arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {6,7,1,2,4,3,9,8,11,5};
        System.out.println("The missing number is "+findMissingNumber(arr));
    }
    public  static int findMissingNumber(int[] nums) {
        int n = nums.length+1;

        for(int i =1;i<=n;i++){
            boolean found = false;
            for(int j = 0;j<n-1;j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
