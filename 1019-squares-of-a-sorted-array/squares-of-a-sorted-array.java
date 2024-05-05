class Solution {
    public int[] sortedSquares(int[] nums) {

        // creating new array that will be returned as ans
        int [] ans = new int[nums.length];

        // creating 3 pointers
        int start = 0 ;
        int end = nums.length-1;
        int ptr = ans.length-1;

        //loop
        while(start<=end){
            int ss = nums[start]*nums[start];
            int es = nums[end]*nums[end];

            if(ss>es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans ;
    }
}