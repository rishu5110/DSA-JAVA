class Solution {
    public int lengthOfLongestSubstring(String s) 
    {

    //  HashSet<Character>set=new HashSet<>();
    //  int left=0;
    //  int maxlen=0;
    //  for(int right=0;right<s.length();right++)
    //  {
    //     char c=s.charAt(right);
    //     while(set.contains(c))
    //     {
    //         set.remove(s.charAt(left));
    //         left++;
    //     }
    //     set.add(c);
    //     maxlen=Math.max(maxlen,right-left+1);

    //  }
    //  return maxlen;

    
    int maxLen=0;
    for(int i=0;i<s.length();i++)
    {
        int[] hash = new int[256];
        for(int j=i;j<s.length();j++)
        {
            
            if(hash[s.charAt(j)]==1) break;
            int len=j-i+1;
            maxLen=Math.max(len,maxLen);
            hash[s.charAt(j)]=1;

        }
    }
    return maxLen;


    }
}