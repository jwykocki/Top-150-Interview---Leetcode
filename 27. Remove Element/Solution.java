class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int freeIx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                freeIx--;
            }
            else{
                nums[freeIx] = nums[i];  
                k++; 
            }
            freeIx++;
        }
        return k;
    }
}