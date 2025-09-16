public class linsearch {
    public static void main(String[] args)
    {
        int a[]={2,3,5,7,8,9};
        int ser=7;
        int ans=linser(a, ser);
        System.out.println("Element found at: "+(ans+1));
    }

    public static int linser(int[] a, int val)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
}
