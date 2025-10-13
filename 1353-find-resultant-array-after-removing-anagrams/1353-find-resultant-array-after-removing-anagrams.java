class Solution {
    public List<String> removeAnagrams(String[] words) 
    {
        List<String>ans=new ArrayList<>();
        String prev="";

        for(String word:words)
        {
            char[]ch=word.toCharArray();
            Arrays.sort(ch);
            String curr=new String(ch);
            if(!curr.equals(prev))
            {
                ans.add(word);
                prev=curr;
            }
        }

        return ans;
        
    }
}