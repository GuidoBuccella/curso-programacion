package programacion.clasesJava;

public class v26_Ejemplo_Array_2D {
    public static void main(String[] args) {

        double acumulado;
        double interes=0.10;

        double [][] saldo=new double[6][5];

        for (int x=0;x<6;x++){

            saldo [x][0]=10000;
            acumulado=10000;

            for (int j=1;j<5;j++) {

                acumulado=acumulado + (acumulado*interes);

                saldo[x][j]=acumulado;

            }
            interes=interes+0.01;
        }
        for (int z=0;z<5;z++){
            System.out.println();

            for (int h=0;h<6;h++){

                System.out.printf("%1.2f", saldo[h][z]);
                System.out.print(" ");

            }
        }
    }
}
