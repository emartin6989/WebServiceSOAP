/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebService;

public interface BanqueService extends java.rmi.Remote {
    public double conversionED(double mt) throws java.rmi.RemoteException;
    public WebService.Compte getCompte(int code) throws java.rmi.RemoteException;
    public WebService.Compte[] getComptes() throws java.rmi.RemoteException;
}
