package poo.empleado;

import poo.empleado.Empleado;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Guido Buccella", 120000, 2020, 12, 17);
        Empleado empleado2 = new Empleado("Juan Mones", 110000, 2021, 10, 04);
        Empleado empleado3 = new Empleado("Eliana Bayones", 105000, 2022, 01, 15);

        empleado1.subeSueldo(10);
        empleado2.subeSueldo(10);
        empleado3.subeSueldo(10);

        System.out.println("Nombre: " + empleado1.dameNombre() + ". Sueldo: " +
                empleado1.dameSueldo() + ". Fecha de alta: " + empleado1.dameFechaContrato());
        System.out.println("Nombre: " + empleado2.dameNombre() + ". Sueldo: " +
                empleado2.dameSueldo() + ". Fecha de alta: " + empleado2.dameFechaContrato());
        System.out.println("Nombre: " + empleado3.dameNombre() + ". Sueldo: " +
                empleado3.dameSueldo() + ". Fecha de alta: " + empleado3.dameFechaContrato());*/

        Jefatura jefeRRHH=new Jefatura("Juan",55000,2022,8,15);
        jefeRRHH.estableceIncentivo(2500);

        Empleado[] misEmpleados=new Empleado[6];

        misEmpleados[0]=new Empleado("Guido Buccella", 120000, 2020, 12, 17);
        misEmpleados[1]=new Empleado("Juan Mones", 110000, 2021, 10, 4);
        misEmpleados[2]=new Empleado("Eliana Bayones", 105000, 2022, 1, 15);
        misEmpleados[3]=new Empleado("Gabriel");
        misEmpleados[4]=jefeRRHH; //POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION
        misEmpleados[5]=new Jefatura("Maria",95000,2021,8,10);

        misEmpleados[2].cambiaSeccion("RRHH");

        /*for (int i=0;i<3;i++){
            misEmpleados[i].subeSueldo(10);
        }*/
        /*for (int i=0;i<3;i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ". Sueldo: " +
                    misEmpleados[i].dameSueldo() + ". Fecha de alta: " + misEmpleados[i].dameFechaContrato());
        }*/

        for (Empleado e:misEmpleados){
            e.subeSueldo(10);
        }
        for (Empleado e:misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() +
                    ". Sueldo: " + e.dameSueldo() +
                    ". Fecha de alta: " + e.dameFechaContrato());
        }

        /*Empleado trabajador1 = new Empleado("Juan");
        Empleado trabajador2 = new Empleado("Guido");
        Empleado trabajador3 = new Empleado("Eliana");
        Empleado trabajador4 = new Empleado("Rodolfo");
        trabajador3.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
                trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());

        System.out.println(Empleado.dameIdSiguiente());*/



    }

}
