package Array;

public class thirdlargest {
    public static void main(String[] args) {
//find 3rd largest number if length is > 3//company zeta
        int arr []={5,1,7,2,4,6};
        int temp;

        if (arr.length>3)
        {



            for (int i = 0; i <arr.length ; i++) {

                for (int j = i+1; j < arr.length ; j++) {

                    if(arr[i]<arr[j])
                    {
                        temp =arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }

                }
            }
            System.out.println("descending print");
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);

            }

            System.out.println("3rd largest number "+arr[3-1]);







    }}
}
