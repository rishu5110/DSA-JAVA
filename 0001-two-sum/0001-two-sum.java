class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<arr.length;i++)
            {
                int left=target-arr[i];
                if(map.containsKey(left))
                {
                    return new int[]{map.get(left),i};
                }
                 map.put(arr[i], i);
            }
            return new int[]{0,0};

    }
}