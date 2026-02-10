class ClosestTwoSum
{
public static void main(String args[])
{
int arr[] = {-8,5,2,-6};
int n = arr.length;
int left = 0;
int right = n-1;
int min = Integer.MAX_VALUE;
while(left<right)
{
int sum = arr[left]+arr[right];
if(Math.abs(sum) < Math.abs(min))
{
min = sum;
}
if(min <0)
left++;
else
right++;
}
System.out.println(min);
}
}
