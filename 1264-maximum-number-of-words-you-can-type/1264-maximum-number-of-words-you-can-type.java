class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String []arr=text.split(" ");
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            for(int j=0;j<brokenLetters.length();j++)
            {
                if(s.contains(String.valueOf(brokenLetters.charAt(j))))
                {
                    count++;
                    break;
                }
            }

            
        }
        return arr.length-count;
    }
}