/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;
import java.rmi.*;
/**
 *
 *
 */
public interface AddServInt extends Remote {
    double add(double a,double b)throws RemoteException;
    double sub(double a,double b)throws RemoteException;
    double mul(double a,double b)throws RemoteException;
    double div(double a,double b)throws RemoteException;
    double si(double a)throws RemoteException;
    double co(double a)throws RemoteException;
    double sq(double a)throws RemoteException;
    double lo(double a)throws RemoteException;
    double sqr(double a)throws RemoteException;
    //double sin(double a,double b)throws RemoteException;
}
