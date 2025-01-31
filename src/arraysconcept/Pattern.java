package arraysconcept;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;

//    for(int i=0;i<rows;i++) //rows
//    {
//        for(int j=0;j<=i;j++)
//        {
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }
        //  *
        //**
        //***
        //****
        //*****

//    for(int i=0;i<rows;i++)
//    {
//        for(int j=i;j<rows;j++)
//        {
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }

// o/p
//*****
//****
//***
//**
//*


        for (int i = 0; i < rows; i++) //rows
        {
            for (int j = i; j <rows; j--) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

//          *
//         **
//        ***
//       ****
//      *****


}