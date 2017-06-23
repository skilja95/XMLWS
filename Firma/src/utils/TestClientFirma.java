package utils;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;
import rs.ac.uns.ftn.firma.Firma;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;

public class TestClientFirma {
	public void testIt() {
		try {
			URL wsdl = new URL("http://localhost:9001/firma/services/Firma?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Firma firma = service.getPort(portName,Firma.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	firma.posaljiNalogZaPrenos(nzp);
	    	
	        
	        
	

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	public void testIt2() {
		try {
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	banka.primiNalogZaPlacanje(nzp);
	    	
	        
	        
	

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		TestClientFirma test = new TestClientFirma();
		
		test.testIt2();
	}
}
