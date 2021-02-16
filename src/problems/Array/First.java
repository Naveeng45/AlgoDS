package problems.Array;

public class First {
    public static void main(String args[]){
        int[] given = new int[5];
        for(int i=0;i<given.length;i++){
            given[i]=i+1;
        }
        printArray(given);
    }

    private static void printArray(int[] given) {
        for(int i=0;i<given.length;i++){
            System.out.print(given[i]);
        }
    }
}
