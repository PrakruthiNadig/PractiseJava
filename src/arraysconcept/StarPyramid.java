package arraysconcept;

public class StarPyramid {


    public static void main(String[] args) {

        int n = 5; //rows

        for (int i = 1; i <= n; i++) //to track rows, start with first row
        {
            for (int j = i; j <= n; j++)   // to print spaces as per rows
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");   //printing star
            }


            System.out.println(" ");


        }


    }

//       *    // 4 space after 1 star
//      ***   //  3 space from beginning after 3 star
    //    *****  //  2 space after 5 stars
    //   *******    //1,7
    //  *********   //0,9
}
