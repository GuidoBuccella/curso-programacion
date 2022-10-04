package programacion._3_Intermedio;

public class PerfectSquarePatch {

    public static void main(String[] args) {
        squarePatch(3);
    }
    public static int [][] squarePatch(int number){

        if (number>0){
            int [][] square=new int[number][number];

            for (int i=0;i<number;i++){

                for (int j=0;j<number;j++){

                    square[i][j]=number;
                    System.out.print(square[i][j]+" ");
                }
                System.out.println();
            }
            return square;

        } else return null;
    }

}
