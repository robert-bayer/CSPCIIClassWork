import java.util.ArrayList;

public class ArrayTesting {


    public static ArrayList<Integer> reverseContents(int[] contents){
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = contents.length - 1; i >= 0; i--){
            myArray.add(contents[i]);
        }
        return myArray;
    }

    public static void main(String[] arg){
        int[] myList = new int[4];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        System.out.println(reverseContents(myList));
    }
}
