package programacion.clasesJava;

public class v23_Uso_Arrays {
    public static void main(String[] args) {

        //int [] mi_matriz=new int[5];

        /*mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;*/

        int [] mi_matriz={5,38,-15,92,71, 64, 32, 13, 85, 99, 23};

        /*System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);*/

        //for (int i=0;i<5;i++){
        for (int i=0;i<mi_matriz.length;i++) {

            System.out.println("El valor del indice " + i + " = " + mi_matriz[i]);
        }

    }
}
