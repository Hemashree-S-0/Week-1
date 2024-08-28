class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String r="";
        int maxl=Math.max(word1.length(),word2.length());
        for(int i=0;i<maxl;i++)
        {
            if (i < word1.length()) {
               r+= word1.charAt(i);
           }
           if (i < word2.length()) {
               r+= word2.charAt(i);
           }
       }
        return r;
    }
}
