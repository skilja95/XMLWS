package testClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;
import rs.ac.uns.ftn.mt90010.TMT9;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos.PodaciOUplati;
import rs.ac.uns.ftn.xmlws.Status;
import rs.ac.uns.ftn.xmlws.TRacun;

public class rtgsClient {

	
	public void t1() {
		try {
			
			System.out.println("T1 rtgs");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	
	    	TMT9 t900 = new TMT9();
	    	t900.setIDPoruke("UatpjrCa0F");
	    	t900.setSWIFTKodBankeDuznika("KOMBRS22");
	    	t900.setObracunskiRacunBankeDuznika("111111111111111111");
	    	
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	
	    	t900.setDatum(date2);
	    	t900.setIznos(BigDecimal.valueOf(300000));
	    	t900.setSifraValute("RSD");
	    	
	    	
	    	
	    	banka.primiMT900(t900);
	    	System.out.println("Obavljeno");
	    	//Status stat = banka.primiNalogZaPlacanje(nzp);
	    	//System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		rtgsClient test = new rtgsClient();
		
		//test.testClearing();
		test.t1();
		//test.t2();
		//test.t3();
		//test.t4();
		//test.t5();
	}
	
}
