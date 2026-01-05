class Solution {
    public long maxMatrixSum(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int count_neg=0;
        long sum=0;
        int smallest_neg=Integer.MAX_VALUE;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<0)
                {
                    count_neg++;
                }
                sum=sum+Math.abs(matrix[i][j]);
                smallest_neg=Math.min(smallest_neg,Math.abs(matrix[i][j]));

            }
        }
        // int ab_sum=Math.abs(sum);
        if(count_neg%2==0)
        {
            return sum;
        }
        return sum - (2*smallest_neg);
    }
}