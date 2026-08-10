package NeetCode_150.Arrays_Hashing;

import java.util.HashSet;

public class LC217ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {

            if (hash.contains(num)) {
                return true;
            } else {
                hash.add(num);
            }
        }
        return false;
    }
}
