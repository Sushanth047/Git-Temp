public class arrayop2 {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int ele=4;
        for(int x=0;x<a.length;x++)
        {
            if(a[x]==ele)
            {
                System.out.println("Element found at: " + (x+1));
            }

            if(a[x]==a.length-1)
                System.out.println("Element not found");
        }
        
    }
}