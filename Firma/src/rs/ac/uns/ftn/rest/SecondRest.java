package rs.ac.uns.ftn.rest;

import java.io.File;
import java.net.MalformedURLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import rs.ac.uns.ftn.faktura.Faktura;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;

@Path("/second")
public class SecondRest {
	public static int increment=0;
	public static final String PUTANJA_DO_FOLDERA = "/home/igor/Documents/gitRepos/XMLWS/Firma/xmlovi/";
	
	@POST
	@Path("/getFile/")
	public String getFile(Faktura faktura) throws JAXBException, MalformedURLException {
		try {
			System.out.println("\nPogodio get file second rest controller");
			System.out.println("\nJAXB unmarshalling.\n");
			System.out.println("\nID dobijene poruke je: " + faktura.getZaglavljeFakture().getIdPoruke());
			
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.faktura");
			Marshaller marshaller = context.createMarshaller();
			File file = new File(PUTANJA_DO_FOLDERA + "dobijeniXml "+increment+".xml");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(faktura, file);
			increment++;
			return "File successfully saved.";
		} catch (Exception e) {
			System.out.println("Error in getFile(second)");
			return "ERROR";
		}
	}
}
