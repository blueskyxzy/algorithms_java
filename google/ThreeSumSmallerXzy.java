// Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

// For example, given nums = [-2, 0, 1, 3], and target = 2.

// Return 2. Because there are two triplets which sums are less than 2:

// [-2, 0, 1]
// [-2, 0, 3]

// Follow up:
// Could you solve it in O(n2) runtime?

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumSmallerXzy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度n：");
        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i <= n-1; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字:");
            input[i] = scanner.nextInt();
        }
        System.out.println("请输入target：");
        int target = scanner.nextInt();
        int result = threeSumSmaller(input,target);
        System.out.println("一共有"+ result +"组满足条件");
    }

    private static int threeSumSmaller(int[] nums, int target) {
        int result = 0;
        int n = nums.length;
     /*   //o(n3)
        for (int i=0;i<=n-1;i++){
            int x = nums[i];
            for (int j=i+1;j<=n-1;j++){
                int y = nums[j];
                for (int k=j+1; k<=n-1;k++){
                    int z = nums[k];
                    if(x + y + z < target){
                        result++;
                    }
                }
            }
        }*/
        //o(n2)   先排序好 + 1遍历 + 2索引 + 统计 。 满足条件的最大值从最大减到第二大都满足条件。第二大从最小+1一直加到最大
        Arrays.sort(nums);
        for (int i=0;i<n-1;i++){
            int left = i+1;          //left pointer
            int right = n-1;         //right pointer

            while (left<right){
                if (nums[i]+nums[left]+nums[right] < target){
                    result +=right-left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }


}
