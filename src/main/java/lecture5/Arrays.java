/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture5;

/**
 *
 * @author fcarella
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int SIZE_OF_ARRAY=10;
        //
        // declare an array of int's
        int[] integerArray=new int[SIZE_OF_ARRAY];

        // declare and initialize array of int's
        int[] integerArray2={1,2,3,4};

        // get the length of an array
        int size=integerArray2.length;

        // create an object array.  Note this will store references to Strings
        String names[]=new String[2];

        // put values into an array
        for(int i=0;i<SIZE_OF_ARRAY;i++){
            integerArray[i]=i;
        }
        // get values from an array
        for(int i=0;i<SIZE_OF_ARRAY;i++){
            System.out.println("integerArray["+i+"]="+integerArray[i]);
        }

        // put values in an object array
        for(int i=0;i<names.length;i++){
            names[i]=new String("firstname of person "+i+" lastname of person "+i);
        }
        
        // get values from an object array
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //
        // use for each to access elements of an object array
        System.out.println("\nUse for each to access elements of an object array");
        for(String name:names){
            System.out.println(name);
        }

        //
        // 2 dimensional arrays
        // 2d arrays can be thought of as an array of arrays.
        //
        int ROWS=2;
        int COLUMNS=3;
        double matrix[][]=new double[ROWS][COLUMNS];

        double matrix2[][]={
            {1.1,1.2,1.3},
            {2.1,2.2,2.3}
        };

        System.out.println("\nPrint out a 2 dimensional array");
        int numRows=matrix2.length;
        int numCols=matrix2[0].length;
        for(int row=0;row<numRows;row++){
            for(int col=0;col<numCols;col++){
                System.out.print(matrix2[row][col]+" ");
            }
            System.out.println();
        }
        // a 3d array.
        // Think of a 3d array as a stack of 2d arrays
        // Think of a 4d array as a stack of 3d arrays, etc...
        double matrix3[][][]={
            // the first 2d array matrix3[0][][]
            {
                {1.11,1.21,1.31,1.41},
                {2.11,2.21,2.31,2.41}
            },
            // the second 2d array matrix3[1][][]
            {
                {1.12,1.22,1.32,1.42},
                {2.12,2.22,2.32,2.42}
            }
        };
        System.out.println("\nPrint out a 3 dimensional array");
        int num2dArrays=matrix3.length;
        int numRowsIn2dArray=matrix3[0].length;
        int numColsIn2dArray=matrix3[0][0].length;
        for(int numArrays=0;numArrays<num2dArrays;numArrays++)
            for(int row=0;row<numRowsIn2dArray;row++){
                for(int col=0;col<numColsIn2dArray;col++){
                    System.out.print(matrix3[numArrays][row][col]+" ");
                }
                System.out.println();
            }

    }

}
