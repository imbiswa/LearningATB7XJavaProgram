package Array;

public class LargestElementNoDuplicate {
    public static void main(String[] args) {

        int ar []={7,8,1,2,8};

        int temp;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = i+1; j < ar.length; j++) {

                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;

                }

            }

        }
        int count=0;
        for (int i = 0; i <ar.length ; i++) {
            if(ar[ar.length-1]==ar[i])
            {
                count++;
            }

        }
        System.out.println("The largest is "+ar[ar.length-1]+" and found "+ count + " times");
    }
}
