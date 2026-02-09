class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int sum=0;
        // if(k==cardPoints.length) 
        // {
        //     for(int i=0;i<k;i++)
        //     {
        //         sum=sum+cardPoints[i];
        //     }
        //     return sum;
        // }

        int lSum=0;
        int rSum=cardPoints.length-1;
     

       for(int i=0;i<k;i++)
       {
        lSum+=cardPoints[i];
       }
        int maxSum=lSum;

       for(int j=k-1;j>=0;j--)
       {
         lSum=lSum-cardPoints[j];
         lSum=lSum+cardPoints[rSum];
         maxSum=Math.max(maxSum,lSum);
          rSum--;
       }

       return maxSum;
    }
}