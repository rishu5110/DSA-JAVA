class Solution {

    public int findDivisor(int num)
    {
        int sum=0;
        int count=0;
        for(int i=1;i*i<=num;i++)
        {
           if(num%i==0)
           {
            int other=num/i;
            if(i!=other)
            {
                sum=sum+i+other;
                count+=2;
            }
            else
            {
                sum+=i;
                count++;
            }
           }
        }
        if(count==4)return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        // Stores final sum of all valid numbers

        int result=0;
        for(int num:nums)
        {
            result+=findDivisor(num);
        }
        return result;
        
    }
}
