class Solution {


    public String devowel(String s)
    {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    sb.append('#');
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
    }
    public String[] spellchecker(String[] wordlist, String[] queries) 
    {

        HashSet<String>exactSet=new HashSet<>();
        HashMap<String,String> caseCheck=new HashMap<>();
        HashMap<String,String> vowelMap=new HashMap<>();

        for(String word:wordlist)
        {
            exactSet.add(word);
            String lower=word.toLowerCase();

            caseCheck.putIfAbsent(lower,word);

            String devowel = devowel(lower);
            vowelMap.putIfAbsent(devowel, word);

        }

        String []ans=new String[queries.length];

        for(int i=0;i<queries.length;i++)
        {
            String query=queries[i];
            if(exactSet.contains(query))
            {
                ans[i]=query;
            }
            else
            {
                String lower=query.toLowerCase();
                if(caseCheck.containsKey(lower))
                {
                    ans[i]=caseCheck.get(lower);
                }
                else
                {
                    
                    String devowel = devowel(lower);
                    if(vowelMap.containsKey(devowel))
                    {
                        ans[i]=vowelMap.get(devowel);

                    }
                    else
                    {
                        ans[i]="";
                    }
                }
            }
        }

        return ans;


     

    }
}