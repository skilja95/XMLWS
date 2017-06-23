package rs.ac.uns.ftn.rest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;

import rs.ac.uns.ftn.faktura.Faktura;
import rs.ac.uns.ftn.firma.Firma;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;
import rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod;
import utils.Pom;

@Path("/main")
public class MainRest {
	public static int increment=0;
	@POST
	@Path("/loadFile/")
	@Consumes({ MediaType.APPLICATION_XML })
	public String loadFile(Pom pom) throws JAXBException, MalformedURLException {
		try {
			System.out.println("\nPogodio load file rest controller");
			System.out.println("\nJAXB unmarshalling.\n");
			System.out.println("\nPrimio file sa nazivom " + pom.getSearchField().trim());
			String nazivFajla = pom.getSearchField().trim();
			// Definiše se JAXB kontekst (putanja do paketa sa JAXB bean-ovima)
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.nalogzaprenos");

			// Unmarshaller je objekat zadužen za konverziju iz XML-a u
			// objektni model
			Unmarshaller unmarshaller = context.createUnmarshaller();

			// Unmarshalling generiše objektni model na osnovu XML fajla
			NalogZaPrenos nalog = (NalogZaPrenos) unmarshaller
					.unmarshal(new File("/home/igor/Documents/gitRepos/XMLWS/Firma/xmlovi/" + nazivFajla + ".xml"));
			System.out.println("\nXML fajl je uspjesno ucitan");
			/*
			 * Kreiranje konekcije ka servisu FIRME
			 */
			URL wsdl = new URL("http://localhost:9001/firma/services/Firma?wsdl");
			QName serviceName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaService");
			QName portName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaPort");

			Service service = Service.create(wsdl, serviceName);

			Firma firma = service.getPort(portName, Firma.class);

			firma.posaljiNalogZaPrenos(nalog);
			return "OK";
		} catch (Exception e) {
			System.out.println("Error in reading file.Check file name!");
			return "ERROR";
		}
	}

	@POST
	@Path("/loadFileZZI/")
	@Consumes({ MediaType.APPLICATION_XML })
	public String loadFileZZI(Pom pom) throws JAXBException, MalformedURLException {
		try {
			System.out.println("\nPogodio load file rest controller");
			System.out.println("\nJAXB unmarshalling.\n");
			System.out.println("\nPrimio file sa nazivom " + pom.getSearchField().trim());
			String nazivFajla = pom.getSearchField().trim();
			// Definiše se JAXB kontekst (putanja do paketa sa JAXB bean-ovima)
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.zahtevzaizvod");

			// Unmarshaller je objekat zadužen za konverziju iz XML-a u
			// objektni model
			Unmarshaller unmarshaller = context.createUnmarshaller();

			// Unmarshalling generiše objektni model na osnovu XML fajla
			ZahtevZaIzvod zahtev = (ZahtevZaIzvod) unmarshaller
					.unmarshal(new File("/home/igor/Documents/gitRepos/XMLWS/Firma/xmlovi/" + nazivFajla + ".xml"));
			System.out.println("\nXML fajl je uspjesno ucitan");
			/*
			 * Kreiranje konekcije ka servisu FIRME
			 */
			URL wsdl = new URL("http://localhost:9001/firma/services/Firma?wsdl");
			QName serviceName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaService");
			QName portName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaPort");

			Service service = Service.create(wsdl, serviceName);

			Firma firma = service.getPort(portName, Firma.class);

			firma.posaljiZahtevZaIzvod(zahtev);
			return "OK";
		} catch (Exception e) {
			System.out.println("\nError in reading file. Check file name!");
			return "ERROR";
		}
	}
	
	@POST
	@Path("/obradiFakturu/")
	@Consumes({ MediaType.APPLICATION_XML })
	public String obradiFakturu(Faktura faktura) throws JAXBException, MalformedURLException {
		try {
			System.out.println("\nPogodio load file rest controller");
			System.out.println("\nBroj racuna je: " +faktura.getZaglavljeFakture().getBrojRacuna());
			
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.faktura");
			Marshaller marshaller = context.createMarshaller();
			File file = new File("/home/igor/Documents/gitRepos/XMLWS/Firma/xmlovi/probaSave "+increment+".xml");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(faktura, System.out);
			marshaller.marshal(faktura, file);
			
			increment++;
			System.out.println("\n");
	        System.out.println("Sent HTTP POST request to add customer");
//	        String inputFile = ClassLoader.getSystemResource("add_customer.xml").getFile();
//	        File input = new File(inputFile);
	        PostMethod post = new PostMethod("http://localhost:9001/firma/second/getFile");
	        post.addRequestHeader("Accept" , "text/xml");
	        RequestEntity entity = new FileRequestEntity(file, "text/xml;");
	        post.setRequestEntity(entity);
	        HttpClient httpclient = new HttpClient();
	        try {
	            int result = httpclient.executeMethod(post);
	            System.out.println("Response status code: " + result);
	            System.out.println("Response body: ");
	            System.out.println(post.getResponseBodyAsString());
	        } finally {
	        	/*
	        	 * Oslobodi konekciju...
	        	 */
	            post.releaseConnection();
	        }

			return "OK";
		} catch (Exception e) {
			System.out.println("\nError in reading file. Check file name!");
			return "ERROR";
		}
	}
}
