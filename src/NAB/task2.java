package NAB;

import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.remove;

public class task2 {
  public static int case1()
    {
        int a[] ={4,7,1,5,3};
        int oddcnt=0;
        ArrayList <Integer> arr=  new ArrayList<>();

        for (int i = 0; i <a.length; i++) {

            if(a[i]%2!=0)
            {
                oddcnt++;
                arr.add(a[i]);
            }
        }
        System.out.println(oddcnt);
        System.out.println(arr);
        int temp=0;

        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j <=arr.size()-1; j++) {
                if (arr.get(i)>arr.get(j))
                {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }

        }
        System.out.println(arr);
        return oddcnt;
    }


    public static int case2()
    {
        int arr [] ={12 ,12 ,12 ,15 ,10};
        int count=0;
        ArrayList<Integer> arl = new ArrayList<Integer>();

        for (int i = 0; i <arr.length; i++) {

            if(!arl.contains(arr[i]))
                    {
                   arl.add(arr[i]);
                   count++;
                    }
        }
        System.out.println(arl);
        return count;


    }
    public static void main(String[] args) {

        case1();
        case2();

    }
}
