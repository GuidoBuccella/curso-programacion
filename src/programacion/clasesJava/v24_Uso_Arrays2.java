package programacion.clasesJava;

public class v24_Uso_Arrays2 {
    public static void main(String[] args) {

        String [] paises=new String[8];

        //String [] paises={"Espana", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela" };

        /*paises[0]="Espana";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Peru";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";*/

        /*for (int i =0; i<paises.length;i++) {

            System.out.println("Pais " + (i+1) + " " + paises[i]);
        }*/

        /*for (int i=0;i<8;i++){

            paises[i]=JOptionPane.showInputDialog("Introduce Pais " + (i+1));
        }

        for (String elemento:paises) {

            System.out.println("Pais " + elemento);
        }*/

        int [] matriz_aleatorios=new int [150];

        for (int i=0;i<matriz_aleatorios.length;i++){

            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);

        }

        for (int numeros:matriz_aleatorios){

            System.out.print(numeros + ", ");
        }


    }
}
