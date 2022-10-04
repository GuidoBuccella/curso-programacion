package programacion.clasesJava;

public class v25_Array_Bidimensional {
    public static void main(String[] args) {

        int [][] matrix=new int[4][5];

        matrix[0][0]=15;
        matrix[0][1]=36;
        matrix[0][2]=73;
        matrix[0][3]=67;
        matrix[0][4]=89;

        matrix[1][0]=98;
        matrix[1][1]=37;
        matrix[1][2]=22;
        matrix[1][3]=78;
        matrix[1][4]=88;

        matrix[2][0]=20;
        matrix[2][1]=46;
        matrix[2][2]=65;
        matrix[2][3]=58;
        matrix[2][4]=82;

        matrix[3][0]=74;
        matrix[3][1]=94;
        matrix[3][2]=61;
        matrix[3][3]=16;
        matrix[3][4]=44;

        //System.out.println("Valor almacenado en la posicion 2, 3 es :" + matrix[2][4]);

        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
