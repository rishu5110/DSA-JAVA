class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) 
    {
        int m=languages.length;
        Set<Integer>[]userLangs=new HashSet[m+1];
        for(int i=0;i<m;i++)
        {
            userLangs[i+1]=new HashSet<>();
            for(int l:languages[i])
            {            
                userLangs[i+1].add(l);
            }
        }

        Set<Integer>sadUsers=new HashSet<>();

        for(int f[]:friendships)
        {
            int u=f[0];
            int v=f[1];
            if(!canTalk(userLangs[u],userLangs[v]))
            {
                sadUsers.add(u);
                sadUsers.add(v);
            }
        }

        if(sadUsers.isEmpty()) return 0;

        Map<Integer,Integer>langCount=new HashMap<>();
        for(int u:sadUsers)
        {
            for(int lang:userLangs[u])
            {
                langCount.put(lang,langCount.getOrDefault(lang,0)+1);
            }
        }

          int maxLangKnown = 0;
        for (int count : langCount.values()) {
            maxLangKnown = Math.max(maxLangKnown, count);
        }

        // Step 5: Result = sadUsers.size() - maxLangKnown
        return sadUsers.size() - maxLangKnown;



    }

    private boolean canTalk(Set<Integer> langs1, Set<Integer> langs2) {
        for (int lang : langs1) {
            if (langs2.contains(lang)) return true;
        }
        return false;
    }
}