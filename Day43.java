class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder s=new StringBuilder("");
        s.append(num);
        int n=s.length();
        int ans=0;
        for(int i=0;i<=n-k;i++){
            String t=s.substring(i,i+k);
            int x=Integer.parseInt(t);
            if(x!=0 && num%x==0) 
            ans++;
        }
        return ans;
    }
}