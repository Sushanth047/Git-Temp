import java.util.Arrays;

public class arrayop1 {
    public static void main(String[] args){
        int a[]=new int[5];
        a[0]=1;
        a[1]=3;
        a[2]=4;
        a[3]=5;
        int pos=1;
        int val=2;
        for (int i=(a.length-2);i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        a[pos]=val;
        System.out.println(Arrays.toString(a));

        int pos1=2;
        for (int i=pos1;i<(a.length-1);i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=0;
        System.out.print(Arrays.toString(a));
}
}
