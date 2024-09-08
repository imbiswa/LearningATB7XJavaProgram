package StringProg;

public class Longestword {
    public static void main(String[] args) {
        String str = "Today is the gretest word in my life";
        String [] arr= str.split(" ");
        String temp = " ";

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i].length()>arr[j].length())
                {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                //System.out.println(arr[i]);

            }


        }
        System.out.print(arr[arr.length-1] +" is the longest word with charachter count "+arr.length) ;

    }
}
