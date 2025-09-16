public class binsearch {
    public static void main(String[] args)
    {
        int a[]={2,3,5,7,8,9,10,13};
        int ser=10;
        int ans=binser(a, ser);
        System.out.println("Element found at: "+(ans+1));
    }

    public static int binser(int[] a, int val)
    {
       int low=0;
       int high=a.length-1;
       while(low<=high){
       int mid=(low+high)/2;
        if(a[mid]==val)
        {
            return mid;
        }
        if(a[mid]<val)
        {
            low=mid+1;
        }
        else
        {
            low=mid+1;
        }
       }
        return -1;
    }
}
