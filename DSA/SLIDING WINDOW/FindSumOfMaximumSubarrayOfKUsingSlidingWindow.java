class FindSumOfMaximumSubarrayOfKUsingSlidingWindow
{
public static void main(String args[])
{
int arr[]={2,1,5,1,3,2};
int k = 3;
int j = 0;
int maxSum = 0;
for(int i = 0;i<k;i++)
{
maxSum+=arr[i];
}
int windowSum = maxSum;
for(int i = 0;i<k;i++)
{
windowSum = windowSum-arr[i]+arr[k+i];
maxSum = Math.max(windowSum,maxSum);
}
System.out.println(maxSum);
}
}

