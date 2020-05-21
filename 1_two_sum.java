class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int firstNumber = nums[i];
            for(int j = 1; j < nums.length; j++){
                int secondNumber = nums[j];
                
                if(firstNumber + secondNumber == target){
                    if(!(i == j)){
                        result[0] = i;
                        result[1] = j;
                    
                    return result;
                    }
                    
                }
            }
        }
        
        return null;
    }
}