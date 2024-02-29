class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
       int freeIx = 1;
       boolean twice = false;
       for(int i=1; i<nums.length; i++){
           if(nums[i] == nums[i-1] && twice){
               freeIx--;
               k--;
           }
           else if(nums[i] == nums[i-1]){
               nums[freeIx] = nums[i];
               twice = true;
           }
           else{
               nums[freeIx] = nums[i];
               twice = false;
           }
           freeIx++;
       }
       return k;
    }
}