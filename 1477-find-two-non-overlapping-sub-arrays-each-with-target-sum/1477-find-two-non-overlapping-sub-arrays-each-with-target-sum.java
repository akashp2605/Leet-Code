class Solution {
    public int minSumOfLengths(int[] arr,int target) {
        int n=arr.length;
        int INF=Integer.MAX_VALUE/2;
        int[] best=new int[n];

        int left=0;
        long sum=0;
        int minLength=INF;
        int answer=INF;

        for(int right=0;right<n;right++){
            sum+=arr[right];

            while(left<=right&&sum>target){
                sum-=arr[left++];
            }

            if(sum==target){
                int len=right-left+1;

                if(left>0&&best[left-1]!=INF){
                    answer=Math.min(answer,len+best[left-1]);
                }

                minLength=Math.min(minLength,len);
            }

            best[right]=minLength;
        }

        return answer==INF?-1:answer;
    }
}
