class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] jewels = new char[J.length()];
        int result = 0;
        for(int i = 0; i<J.length(); i++){
            jewels[i] = J.charAt(i);
        }
        for(int i = 0; i<S.length(); i++){
            for(int j = 0; j < jewels.length; j++){
                if(jewels[j] == S.charAt(i)){
                    result++;
                }
            }
        }
        return result;
    }
}