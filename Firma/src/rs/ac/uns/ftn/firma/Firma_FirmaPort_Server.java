
package rs.ac.uns.ftn.firma;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-06-20T01:53:21.159+02:00
 * Generated source version: 2.6.5
 * 
 */
 
public class Firma_FirmaPort_Server{

    protected Firma_FirmaPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new FirmaImpl();
        String address = "http://localhost:9001/Firma";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Firma_FirmaPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
