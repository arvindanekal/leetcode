public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i< nums1.length;i++){
            if(!list.contains(nums1[i]))
                list.add(nums1[i]);
        }

        for(int i = 0;i<nums2.length;i++){
            if(list.contains(nums2[i]) && !result.contains(nums2[i]))
                result.add(nums2[i]);
        }

        int[] ret = new int[result.size()];
        for(int i =0;i<result.size();i++)
            ret[i] = result.get(i);
        return ret;
    }
}
