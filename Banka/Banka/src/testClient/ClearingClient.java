package testClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos.PodaciOUplati;
import rs.ac.uns.ftn.xmlws.Status;
import rs.ac.uns.ftn.xmlws.TRacun;






public class ClearingClient {

	
	public void testClearing() {
		try {
			
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	banka.odradiClearing();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	
	
	public static void main(String[] args) {
		ClearingClient test = new ClearingClient();
		
		test.testClearing();
		//test.testPrimiNalogZaPlacanje();
	}
	
}
