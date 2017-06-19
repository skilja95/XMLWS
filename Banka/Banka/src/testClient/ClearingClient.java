package testClient;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;






public class ClearingClient {

	
	public void testIt() {
		try {
			
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	banka.odradiClearing();
	    	
	        //BankaPort banka = service.getPort(portName, BankaPort.class);
			
			
	        
	        //banka.odradiClearing();
	        
	        
	

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		ClearingClient test = new ClearingClient();
		
		test.testIt();
	}
	
}
