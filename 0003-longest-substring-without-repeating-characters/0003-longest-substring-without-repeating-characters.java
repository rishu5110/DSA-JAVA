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


    int l=0;    //Time complexity: O(n)
    int r=0;
    int n=s.length();
    int hash[]= new int[256];
    Arrays.fill(hash,-1);
    int maxLength=0;
    
        while(r<n)
        {
            if(hash[s.charAt(r)]>=l)
            {
                l=Math.max(hash[s.charAt(r)]+1,l);

            }
            int len=r-l+1;
             maxLength=Math.max(len,maxLength);
            hash[s.charAt(r)]=r;
            r++;
        }

        return maxLength;


    

    
    // int maxLen=0;    //Time Complexity:O(N*N)
    // for(int i=0;i<s.length();i++)
    // {
    //     int[] hash = new int[256];
    //     for(int j=i;j<s.length();j++)
    //     {
            
    //         if(hash[s.charAt(j)]==1) break;
    //         int len=j-i+1;
    //         maxLen=Math.max(len,maxLen);
    //         hash[s.charAt(j)]=1;

    //     }
    // }
    // return maxLen;


    }
}