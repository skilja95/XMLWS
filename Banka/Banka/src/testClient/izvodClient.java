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
import rs.ac.uns.ftn.presek.Presek;
import rs.ac.uns.ftn.presek.Presek.Stavka;
import rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod;

public class izvodClient {

	public void t1() {
		try {
			
			System.out.println("T1 rtgs");
			
			//URL wsdl = new URL("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
			URL wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
	    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
	    	QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
	    	
	    	Service service = Service.create(wsdl, serviceName);
	    	
	    	Banka banka = service.getPort(portName,Banka.class);
	    	
	    	
	    	ZahtevZaIzvod zzi = new ZahtevZaIzvod();
	    	
	    	zzi.setBrojRacuna("000000000000000001");
		    	GregorianCalendar c = new GregorianCalendar();
		    	Calendar calendar = Calendar.getInstance();
		    	//calendar.set(2017, 5, 21);
		    	Date date =  calendar.getTime();
		    	
		    	c.setTime(date);
		    	//c.setTime(new Date(117,5,7));
		    	XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		    	
	    	zzi.setDatum(date2);
	    	zzi.setRedniBrojPreseka(BigInteger.valueOf(1));
	    	
	    	Presek pres =  banka.primiZahtevZaIzvod(zzi);
	    	
	    	if(pres!=null)
	    	{
	    		System.out.println("broj prom na teret: "+ pres.getZaglavlje().getBrojPromenaNaTeret());
	    		System.out.println("broj prom u korist: "+ pres.getZaglavlje().getBrojPromenaUKorist());
	    		System.out.println("Prethodno stanje: "+ pres.getZaglavlje().getPrethodnoStanje());
	    		System.out.println("Trenutno stanje: "+ pres.getZaglavlje().getNovoStanje());
	    		
	    		System.out.println("--------------------------------------");
	    		for(Stavka st: pres.getStavka())
	    		{
	    			System.out.println("\t =STAVKA= Duzn: "+st.getDuznik()+" Pov: "+st.getPoverilac()+" R. duz: "+st.getRacunDuznika().getBrojRacuna()+" izn: "+st.getIznos()+" Smijer: "+st.getSmer());
	    		}
	    	
	    	
	    	}
	    	else
	    	{
	    		System.out.println("VRACEN PRESJEK NULL!!!!!!!!!!!!!!!!!!!!!!!!!!");
	    	}
	    	
	    	/*
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
	    	*/
	    	
	    	
	    	//banka.primiMT900(t900);
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
		izvodClient test = new izvodClient();
		
		//test.testClearing();
		//test.testPrimiNalogZaPlacanje();
		//test.t2();
		//test.t3();
		//test.t4();
		test.t1();
	}
	
	
}
