class Solution {
    public int firstUniqChar(String s) {
     //approach2 : build an array of 26 characters
        int[] count = new int[26];
        int n = s.length();
        //bucket : <charIndex, count?
        for(int i = 0;i<n;i++){
            int index = s.charAt(i)-'a';
            count[index]++;
        }
        
        //fidn the index
        for(int i = 0;i < n;i++){
            int index = s.charAt(i) - 'a';
            if(count[index] == 1)
                return i;
        }
        return -1;
    }
}
