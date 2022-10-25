package colecciones;
import java.util.*;

public class CuentasUsuarios {
    public static void main(String[] args) {

        Cliente cl1=new Cliente("Guido","00001",180000);
        Cliente cl2=new Cliente("Juan","00002",200000);
        Cliente cl3=new Cliente("Eliana","00003",150000);
        Cliente cl4=new Cliente("Diego","00004",50000);
        Cliente cl5=new Cliente("Guido","00001",180000);

        Set <Cliente> clientesBanco=new HashSet<Cliente>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for (Cliente cliente:clientesBanco) {
            System.out.println("Nombre cliente: "+cliente.getNombre()+
                    ". Numero de cuenta: "+cliente.getNroCuenta()+". " +
                    "saldo: "+cliente.getSaldo());

        }
    }
}
