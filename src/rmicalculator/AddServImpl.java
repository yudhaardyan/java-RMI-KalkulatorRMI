/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;
import java.rmi.*;
import java.rmi.server.*;
import java.math.*;
/**
 *
 *
 */
public class AddServImpl extends UnicastRemoteObject implements AddServInt {

    /**
     * @param args the command line arguments
     */
    double c;
    public AddServImpl() throws RemoteException{
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public double add(double a, double b) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
      c = a+b;
      return c;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      c = a-b;
      return c;
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     c = a*b;
     return c;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      c = a/b;
      return c;
    
    }

    @Override
    public double si(double a) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
        c= Math.sin(a); 
        return c;
    }

    @Override
    public double co(double a) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return Math.cos(a);
    }

    @Override
    public double sq(double a) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return a*a;
    }

    @Override
    public double lo(double a) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return Math.log(a);
    }
    public double sqr(double a) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return Math.sqrt(a);
    }
}
