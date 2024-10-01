package Week01;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[100000];

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    // 중복을 검사하는 메서드
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}