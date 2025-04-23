package Practice2025;

public class Array4 {
    public static void main(String[] args) {
//missing number
        int[] arr ={0,1,3,4};
         int n= arr.length;
         int expectedsum = n*(n+1)/2;
         int actualsum=0;
         for(int num: arr)
         {
             actualsum= actualsum+num;
         }

         int missingnumber = expectedsum-actualsum;
        System.out.println(missingnumber);
    }
}
