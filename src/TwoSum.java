import java.util.*;

public class TwoSum {

    // Two sum using HashMap
    // Leetcode problem number 1 easy

    public static int[] twoSum(int[] arr, int t){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(t-arr[i])){
                return new int[]{hm.get(t-arr[i])+1,i+1};
            }else{
                hm.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr = {2,7,11,15};
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
