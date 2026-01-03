class Solution {
    public int numOfWays(int n) 
    {
        long MOD = 1_000_000_007;

        long two=6;
        long three=6;

        n--;
        while(n>0)
        {
            long next_two=(3*two + 2*three)%MOD;
            three=(2*two + 2*three)%MOD;
            two=next_two;
            n--;
        }

        return (int)((two+three)%MOD);
    }
}