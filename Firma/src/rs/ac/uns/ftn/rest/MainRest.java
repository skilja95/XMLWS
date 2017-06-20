package rs.ac.uns.ftn.rest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.firma.Firma;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;


@Path("/main")
public class MainRest {
	
    @POST
    @Path("/loadFile/")
    public void loadFile() throws JAXBException, MalformedURLException {
       System.out.println("\nPogodio load file rest controller");
       System.out.println("\nJAXB unmarshalling.\n");
		
		// Definiše se JAXB kontekst (putanja do paketa sa JAXB bean-ovima)
		JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.nalogzaprenos");
		
		// Unmarshaller je objekat zadužen za konverziju iz XML-a u objektni model
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		// Unmarshalling generiše objektni model na osnovu XML fajla 
		//Nalozi nalozi = (Nalozi) unmarshaller.unmarshal(new File(nazivFajla/*primjerXml.xml"*/));
		NalogZaPrenos nalog = (NalogZaPrenos) unmarshaller.unmarshal(new File("C:\\Users\\skilj\\Desktop\\Firma\\xmlovi\\NalogZaPrenos.xml"));
        System.out.println("\nXML fajl je uspjesno ucitan");
        /*
         * Kreiranje konekcije ka servisu FIRME
         * */
        URL wsdl = new URL("http://localhost:8080/firma/services/Firma?wsdl");
    	QName serviceName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaService");
    	QName portName = new QName("http://www.ftn.uns.ac.rs/firma", "FirmaPort");
    	
    	Service service = Service.create(wsdl, serviceName);
    	
    	Firma firma = service.getPort(portName,Firma.class);

    	firma.posaljiNalogZaPrenos(nalog);
    }
}
