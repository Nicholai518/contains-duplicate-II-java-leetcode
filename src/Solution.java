import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // key = number
        // value = index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // store current number / element
            int current = nums[i];

            // check map to see if we have already encountered this number
            // check the requirements for k
            if (map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            }

            // we have not encountered number, add to map
            else {
                map.put(current, i);
            }
        }

        // if we iterate through the entire array
        // return false
        return false;
    }
}
