package StringProg;

public class WordRevert {
    public static void main(String[] args) {


        String str = "Test the product";
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) //here taking the each string from the array then
                //from end of the array extracting one by char
            {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }


}
