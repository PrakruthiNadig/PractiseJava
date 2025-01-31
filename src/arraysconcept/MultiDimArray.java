package arraysconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimArray {

    public static void main(String[] args) {

        int[][] mat;  //init
        mat= new int[3][3]; // declaration with size


//declaration and init together
        int[][] matrix = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}};

        //accessing first element
        int firstElement = matrix[0][0];

        //assigning value 10 to the center element
       matrix[1][1] = 10;

//printing multidim matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
//
//        int[] array = new int[]{1, 4, 5, 3, 9};
//
//



//accessing first ele in matrix
        int firstEle = matrix[0][0];

        //assigning centre element with value 10;
        matrix[1][1]=10;


        for(int i=0;i<matrix.length;i++)
        {
           for( int j=0;j<matrix[i].length;j++)
            {

                System.out.println(matrix[i][j] +" ");
            }
            System.out.println(" ");
        }


//arraylist

        ArrayList<Integer> all = new ArrayList<>();

        all.add(2);
        all.add(3);

        //list to array

        List<Integer> ll = Arrays.asList();

    }
}
