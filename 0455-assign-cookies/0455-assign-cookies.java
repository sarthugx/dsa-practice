class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int result = 0;

        int ptrG = 0;
        int ptrS = 0;


        while(ptrG < g.length && ptrS < s.length){
            if(g[ptrG] <= s[ptrS]){
                ptrG ++;
                ptrS ++;
                result ++;
            }else{
                ptrS ++;
            }
        }

        return result;
    }
}