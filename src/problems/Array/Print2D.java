package problems.Array;

public class Print2D {
    public static void main(String args[]) {
        int[][] givenArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(givenArray);
    }

    private static void print2DArray(int[][] givenArray) {
        for(int row=0;givenArray.length>row;row++){
            for(int col=0;givenArray[row].length>col;col++){
                System.out.print(givenArray[row][col]+" ");
            }
            System.out.println();
        }
    }

}
