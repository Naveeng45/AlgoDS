package problems.Array;

public class ShiftSpiralOrder {
    public static void main(String args[]){
        int[][] givenArray = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        shiftMatrix(givenArray);
    }
    private static void shiftMatrix(int givenArray[][]){
        int row = givenArray.length;
        int col = givenArray[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        int dir =1;
        int prev = givenArray[0][0];
        while(top<=bottom && left <= right){
            if(dir == 1){
                for(int i =left; i<=right;i++){
                    int temp = givenArray[top][i];
                    givenArray[top][i] = prev;
                    prev = temp;
                }
                top++;
                dir=2;
            }else if(dir == 2){
                for(int i= top;i<=bottom;i++){
                    int temp = givenArray[i][right];
                    givenArray[i][right] = prev;
                    prev = temp;
                }
                right--;
                dir = 3;
            }else if(dir ==3){
                for(int i=right;i>=left;i--){
                    int temp = givenArray[bottom][i];
                    givenArray[bottom][i] = prev;
                    prev = temp;
                }
                bottom--;
                dir=4;
            }else if(dir == 4){
                for(int i=bottom;i>=top;i--){
                    int temp = givenArray[i][left];
                    givenArray[i][left] = prev;
                    prev = temp;
                }
                left++;
                dir = 1;
            }
            givenArray[0][0] = prev;
        }
        for(int i = 0;i<givenArray.length;i++){
            for(int j = 0;j<givenArray[0].length;j++){
                System.out.print(givenArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
