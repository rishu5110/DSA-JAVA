class Solution {
    public String sortVowels(String s) 
    {
        int length=s.length();
        StringBuilder v=new StringBuilder();
        char[]arr= s.toCharArray();

        for(int i=0;i<length;i++)
        {
            if(isVowel(arr[i]))
            {
                v.append(arr[i]);
                arr[i]='#';
            }
        }

        char []vowels=v.toString().toCharArray();
        Arrays.sort(vowels);
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='#')
            {
                arr[i]=vowels[k++];
            }
        }

        return new String(arr);

    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}