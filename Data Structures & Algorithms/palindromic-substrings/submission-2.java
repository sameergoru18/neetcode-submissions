class Solution {
    public int count(int n,String s){
        int result=0;
        int left=0,right=0;
        for(int i=0;i<n;i++){
            left=i;
            right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                result++;
                left--;
                right++;
            }
        }
        left=0;
        right=1;
        for(int i=0;i<n;i++){
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                result++;
                left--;
                right++;

            }
            
        }
        return result;

    }
    public int countSubstrings(String s) {
        int n = s.length();
        return count(n,s);
        
    }
}
