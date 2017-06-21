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
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.firma.Firma;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;
import rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod;
import utils.Pom;

@Path("/main")
public class MainRest {

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
					.unmarshal(new File("C:\\Users\\skilj\\Documents\\GitHub\\XMLWS\\Firma\\xmlovi\\" + nazivFajla + ".xml"));
			System.out.println("\nXML fajl je uspjesno ucitan");
			/*
			 * Kreiranje konekcije ka servisu FIRME
			 */
			URL wsdl = new URL("http://localhost:8080/firma/services/Firma?wsdl");
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
					.unmarshal(new File("C:\\Users\\skilj\\Documents\\GitHub\\XMLWS\\Firma\\xmlovi\\" + nazivFajla + ".xml"));
			System.out.println("\nXML fajl je uspjesno ucitan");
			/*
			 * Kreiranje konekcije ka servisu FIRME
			 */
			URL wsdl = new URL("http://localhost:8080/firma/services/Firma?wsdl");
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
}
