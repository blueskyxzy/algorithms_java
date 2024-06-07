package com.xzy.nowcoder.huawei;

import java.util.*;

/**
 * @author: xzy
 * @create: 2024-05-29
 **/

// 注意类名必须为 Main, 不要有任何 package xxx 信息

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        List<Integer> nums = new ArrayList<>();
        String line = in.nextLine();
        String[] str = line.split(" ");
        for (String st: str){
            nums.add(Integer.valueOf(st));
        }
        res = getStuResult(nums);
        System.out.println(res);
    }

    private static Integer getStuResult(List<Integer> nums) {
        Map<Integer, Integer> stuMap = new HashMap(nums.size());
        for(Integer stu: nums){
            if (stuMap.containsKey(stu)){
                stuMap.put(stu, stuMap.get(stu) + 1);
            } else {
                stuMap.put(stu, 1);
            }
        }

        return getSum(stuMap);
    }

    private static Integer getSum(Map<Integer, Integer> stuMap) {
        int sum = 0;
        for(int x: stuMap.keySet()){
            int y = x + 1;
            int min = (int) (Math.ceil(stuMap.get(x) * 1.0/y) * y);
            sum += min;
        }
        return sum;
    }


}
