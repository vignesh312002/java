import java.util.*;
public class find_all_duplicates_inarray {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corrected=nums[i]-1;
            if(nums[i]!=nums[corrected]){ // check properly before applying 
                swapping(nums,i,corrected);
            }
            else{
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] !=  j + 1){ // nums[j]!= j-1(which will  print whole array )
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }

}
