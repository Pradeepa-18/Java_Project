class FindSumOfMaximumSubarrayOfK
{
public static void main(String args[])
{
int arr[] ={2,3,4,1,5};
int n = arr.length;
int k = 2;
int max=Integer.MIN_VALUE;
for(int i = 0;i<=n-k;i++)
{
int sum = 0;
for(int j = i;j<i+k;j++)
{
sum+=arr[j];
}
max = Math.max(sum,max);
System.out.println(max);
}
}
