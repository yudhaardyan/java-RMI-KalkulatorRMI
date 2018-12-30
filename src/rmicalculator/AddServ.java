/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;
import java.net.*;
import java.rmi.*;
import java.math.*;
import java.rmi.registry.LocateRegistry;
/**
 *
 *
 */
public class AddServ {

    /**
     * @param args the command line arguments
     */
    


public static void main(String args[]) {
try {
    LocateRegistry.createRegistry(1099);
    AddServImpl addServerImpl = new AddServImpl();
    Naming.rebind("AddServer", addServerImpl);
}
catch(Exception e) {
System.out.println("Exception: " + e);
}
}


}
