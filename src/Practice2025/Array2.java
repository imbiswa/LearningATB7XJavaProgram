package Practice2025;

public class Array2 {

    public static void main(String[] args) {
//sorting
        int [] sort = {4,7,1,3,0,1};
        int temp;

        for (int i = 0; i <sort.length ; i++) {

            for (int j = i+1; j < sort.length; j++) {

                if(sort[i]>sort[j])
                {
                    temp=sort[i];
                    sort[i]=sort[j];
                    sort[j]=temp;
                }
            }

        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]+" ,");

        }

    }
}
