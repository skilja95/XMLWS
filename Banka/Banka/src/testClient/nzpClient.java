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
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos.PodaciOUplati;
import rs.ac.uns.ftn.xmlws.Status;
import rs.ac.uns.ftn.xmlws.TRacun;

public class nzpClient {

	public void testPrimiNalogZaPlacanje() {
		try {
			
			System.out.println("T1 rtgs");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	nzp.setDuznik("Citroen");
	    	nzp.setIdPoruke("r1");
	    	PodaciOUplati pou = new PodaciOUplati();
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	pou.setDatumNaloga(date2);
	    	pou.setDatumValute(date2);
	    	pou.setHitno(false);
	    	pou.setIznos(BigDecimal.valueOf(290000));
	    	pou.setOznakaValute("RSD");
	    	TRacun duznik = new TRacun();
	    	duznik.setBrojModela(BigInteger.valueOf(10));
	    	duznik.setBrojRacuna("000000000000000001");
	    	duznik.setPozivNaBroj("98");
	    	pou.setRacunDuznika(duznik);
	    	TRacun pov = new TRacun();
	    	pov.setBrojModela(BigInteger.valueOf(11));
	    	pov.setBrojRacuna("000000000000000003");
	    	pov.setPozivNaBroj("98");
	    	pou.setRacunPoverioca(pov);
	    	nzp.setPodaciOUplati(pou);
	    	nzp.setPrimalac("VW");
	    	nzp.setSvrhaPlacanja("1");
	    	
	    	
	    	Status stat = banka.primiNalogZaPlacanje(nzp);
	    	System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void t2() {
		try {
			System.out.println("T2 clearing");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	nzp.setDuznik("Reno");
	    	nzp.setIdPoruke("r2");
	    	PodaciOUplati pou = new PodaciOUplati();
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	pou.setDatumNaloga(date2);
	    	pou.setDatumValute(date2);
	    	pou.setHitno(false);
	    	pou.setIznos(BigDecimal.valueOf(50000));
	    	pou.setOznakaValute("RSD");
	    	TRacun duznik = new TRacun();
	    	duznik.setBrojModela(BigInteger.valueOf(10));
	    	duznik.setBrojRacuna("000000000000000002");
	    	duznik.setPozivNaBroj("98");
	    	pou.setRacunDuznika(duznik);
	    	TRacun pov = new TRacun();
	    	pov.setBrojModela(BigInteger.valueOf(11));
	    	pov.setBrojRacuna("000000000000000003");
	    	pov.setPozivNaBroj("98");
	    	pou.setRacunPoverioca(pov);
	    	nzp.setPodaciOUplati(pou);
	    	nzp.setPrimalac("VW");
	    	nzp.setSvrhaPlacanja("1");
	    	
	    	
	    	Status stat = banka.primiNalogZaPlacanje(nzp);
	    	System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void t3() {
		try {
			System.out.println("T3 rtgs");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	nzp.setDuznik("Reno");
	    	nzp.setIdPoruke("r3");
	    	PodaciOUplati pou = new PodaciOUplati();
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	pou.setDatumNaloga(date2);
	    	pou.setDatumValute(date2);
	    	pou.setHitno(false);
	    	pou.setIznos(BigDecimal.valueOf(400000));
	    	pou.setOznakaValute("RSD");
	    	TRacun duznik = new TRacun();
	    	duznik.setBrojModela(BigInteger.valueOf(10));
	    	duznik.setBrojRacuna("000000000000000002");
	    	duznik.setPozivNaBroj("98");
	    	pou.setRacunDuznika(duznik);
	    	TRacun pov = new TRacun();
	    	pov.setBrojModela(BigInteger.valueOf(11));
	    	pov.setBrojRacuna("000000000000000004");
	    	pov.setPozivNaBroj("98");
	    	pou.setRacunPoverioca(pov);
	    	nzp.setPodaciOUplati(pou);
	    	nzp.setPrimalac("Skoda");
	    	nzp.setSvrhaPlacanja("1");
	    	
	    	
	    	Status stat = banka.primiNalogZaPlacanje(nzp);
	    	System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void t4() {
		try {
			System.out.println("T4 clearing ");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	nzp.setDuznik("Citroen");
	    	nzp.setIdPoruke("r4");
	    	PodaciOUplati pou = new PodaciOUplati();
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	pou.setDatumNaloga(date2);
	    	pou.setDatumValute(date2);
	    	pou.setHitno(false);
	    	pou.setIznos(BigDecimal.valueOf(20000));
	    	pou.setOznakaValute("RSD");
	    	TRacun duznik = new TRacun();
	    	duznik.setBrojModela(BigInteger.valueOf(10));
	    	duznik.setBrojRacuna("000000000000000001");
	    	duznik.setPozivNaBroj("98");
	    	pou.setRacunDuznika(duznik);
	    	TRacun pov = new TRacun();
	    	pov.setBrojModela(BigInteger.valueOf(11));
	    	pov.setBrojRacuna("000000000000000004");
	    	pov.setPozivNaBroj("98");
	    	pou.setRacunPoverioca(pov);
	    	nzp.setPodaciOUplati(pou);
	    	nzp.setPrimalac("Skoda");
	    	nzp.setSvrhaPlacanja("1");
	    	
	    	
	    	Status stat = banka.primiNalogZaPlacanje(nzp);
	    	System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void t5() {
		try {
			System.out.println("T5 medju");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	NalogZaPrenos nzp = new NalogZaPrenos();
	    	nzp.setDuznik("Citroen");
	    	nzp.setIdPoruke("r5");
	    	PodaciOUplati pou = new PodaciOUplati();
	    	GregorianCalendar c = new GregorianCalendar();
	    	Calendar calendar = Calendar.getInstance();
	    	Date date =  calendar.getTime();
	    	c.setTime(date);
	    	//c.setTime(new Date(117,5,7));
	    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	    	pou.setDatumNaloga(date2);
	    	pou.setDatumValute(date2);
	    	pou.setHitno(true);
	    	pou.setIznos(BigDecimal.valueOf(222111));
	    	pou.setOznakaValute("RSD");
	    	TRacun duznik = new TRacun();
	    	duznik.setBrojModela(BigInteger.valueOf(10));
	    	duznik.setBrojRacuna("000000000000000001");
	    	duznik.setPozivNaBroj("98");
	    	pou.setRacunDuznika(duznik);
	    	TRacun pov = new TRacun();
	    	pov.setBrojModela(BigInteger.valueOf(11));
	    	pov.setBrojRacuna("000000000000000002");
	    	pov.setPozivNaBroj("98");
	    	pou.setRacunPoverioca(pov);
	    	nzp.setPodaciOUplati(pou);
	    	nzp.setPrimalac("Reno");
	    	nzp.setSvrhaPlacanja("1");
	    	
	    	
	    	Status stat = banka.primiNalogZaPlacanje(nzp);
	    	System.out.println(stat.getStatusText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		nzpClient test = new nzpClient();
		
		//test.testClearing();
		test.testPrimiNalogZaPlacanje();
		test.t2();
		test.t3();
		test.t4();
		test.t5();
	}
	
}
