package collections.matrices;

/**
 * Created by User on 9/10/2019.
 */
public class TestSubMatrix {

    public static void main(String args[]){

        int A[][] = null;

        int B[][] = null;


        A = new int[3][];
        A[0] = new int[]{1,2,3};
        A[1] = new int[]{4,4,5};
        A[2] = new int[]{7,7,8};

        B = new int[2][];
        B[0] = new int[]{4,5};
        B[1] = new int[]{7,8};

        System.out.println(checkSubMatrix(A,B));

    }





    private static boolean checkSubMatrix(int[][] A, int[][] B){



        int rowcountA = A.length;
        int rowcountB = B.length;
        int colcountA = A[0].length;
        int colcountB = B[0].length;
        int firstelemB = B[0][0];



        //Assuming A is going to be the reference matrix

        for(int i=0;i<rowcountA-rowcountB+1;i++){
            for(int j=0;j<colcountA-colcountB+1;j++){
                //Identify pivot element
                if(A[i][j] == firstelemB){
                    if(checkPresenceOfBinA(A,B,i,j,rowcountB,colcountB)){
                        return true;
                    }
                }
            }
        }
        return false;
    }



    private static boolean checkPresenceOfBinA(int[][] A, int[][] B,int pivotrow, int pivotcol, int rowlenB, int collenB){

        for(int i=0;i<rowlenB;i++){
            for(int j=0;j<collenB;j++){
                if(B[i][j] != A[pivotrow+i][pivotcol+j]){
                    return false;
                }
            }
        }
       return true;
    }
}
