
class Solution {
    static class Pair
    {
        int r,c;
        Pair(int r,int c)
        {
            this.r=r;
            this.c=c;
        }
    }
    
    public int orangesRotting(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int fresh=0;

        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                    
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;
        int min=0;

        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
        int minutes=0;
        while(!q.isEmpty())
        {
           int size=q.size();
            boolean rot=false;
            for(int i=0;i<size;i++)
            {

Pair p=q.poll();
            for(int d=0;d<4;d++)
            {
                int nr=p.r +dr[d];
                int nc=p.c+dc[d];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) 
                {
                    grid[nr][nc]=2;
                    q.add(new Pair(nr,nc));
                    fresh--;
                    rot=true;

                }

            }
            }
            if(rot)minutes++;
        }
        return fresh==0?minutes:-1;



        
    }
}