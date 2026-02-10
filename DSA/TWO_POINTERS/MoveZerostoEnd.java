class MoveZerostoEnd
{
public static void main(String args[])
{
int arr[]={0,1,0,3,12};
int left = 0;
int right =0;
while(right<arr.length)
{
if(arr[left]==0 && arr[right]!=0)
{
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left++;
}
else if(arr[left]!=0)
{
left++;
}
right++;
}
for(int a:arr)
System.out.println(a);
}
}
