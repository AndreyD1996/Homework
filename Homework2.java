import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        //Задание №1
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("#1 before " + Arrays.toString(myArray));

        change(myArray);
        System.out.println("#1 after " + Arrays.toString(myArray));

        //Задание №2
        int[] Array2 = new int[8];

        fillIn(Array2);
        System.out.println("#2 = " + Arrays.toString(Array2));

        //Задание №3
        int[] Array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        doubling(Array);
        System.out.println("#3  = " + Arrays.toString(Array));


        //Задание №4


        System.out.println("#4 Max = " + findMax(Array));
        System.out.println("#4 Min  = " + findMin(Array));
    }






    public static void change(int[] myArray) {
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {

                myArray[i] = 0;

            }
    }


    public static void fillIn(int[] Array2) {
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = i * 3 + 1;

        }

    }

    public static void doubling(int[] Array) {
        for (int i = 0; i < Array.length; i++)
            if (Array[i] < 6) {
                Array[i] *= 2;
            }
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }



    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] < min)
               min = array[i];
        }
        return min;
    }
}












