class TwoSumInSortedArray
{
public static void main(String args[])
{
int arr[] = {1,2,3,4,6,8};
int target = 13;
int left = 0;
int right = arr.length-1;
boolean flag = false;
while(left<right)
{
if((arr[left]+arr[right])>target)
{
right--;
}
else if( (arr[left]+arr[right]) < target)
{
left++;
}
else
{
System.out.println("TargetFound --> "+arr[left]+ " + " +arr[right]+" = "+ target);
flag = true;
}
}
if(!flag)
System.out.println("Target Not Found");
}
}
