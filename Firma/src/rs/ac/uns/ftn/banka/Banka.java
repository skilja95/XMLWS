package rs.ac.uns.ftn.banka;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-06-19T23:57:03.498+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.uns.ac.rs/banka", name = "Banka")
@XmlSeeAlso({rs.ac.uns.ftn.mt102.ObjectFactory.class, rs.ac.uns.ftn.zahtevzaizvod.ObjectFactory.class, rs.ac.uns.ftn.xmlws.ObjectFactory.class, rs.ac.uns.ftn.mt103.ObjectFactory.class, rs.ac.uns.ftn.faktura.ObjectFactory.class, rs.ac.uns.ftn.presek.ObjectFactory.class, rs.ac.uns.ftn.mt90010.ObjectFactory.class, rs.ac.uns.ftn.nalogzaprenos.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Banka {

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status primiNalogZaPlacanje(
        @WebParam(partName = "nalogZaPrenos", name = "nalog_za_prenos", targetNamespace = "http://www.ftn.uns.ac.rs/nalogZaPrenos")
        rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos nalogZaPrenos
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status odradiClearing();

    @WebMethod
    @WebResult(name = "presek", targetNamespace = "http://www.ftn.uns.ac.rs/presek", partName = "response")
    public rs.ac.uns.ftn.presek.Presek primiZahtevZaIzvod(
        @WebParam(partName = "zahtevZaIzvod", name = "zahtev_za_izvod", targetNamespace = "http://www.ftn.uns.ac.rs/ZahtevZaIzvod")
        rs.ac.uns.ftn.zahtevzaizvod.ZahtevZaIzvod zahtevZaIzvod
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status primiMT910(
        @WebParam(partName = "mt910", name = "MT910", targetNamespace = "http://www.ftn.uns.ac.rs/mt90010")
        rs.ac.uns.ftn.mt90010.TMT9 mt910
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status primiMT900(
        @WebParam(partName = "mt900", name = "MT900", targetNamespace = "http://www.ftn.uns.ac.rs/mt90010")
        rs.ac.uns.ftn.mt90010.TMT9 mt900
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status primiMT102(
        @WebParam(partName = "mt102", name = "mt102", targetNamespace = "http://www.ftn.uns.ac.rs/mt102")
        rs.ac.uns.ftn.mt102.Mt102 mt102
    );

    @WebMethod
    @WebResult(name = "status", targetNamespace = "http://www.ftn.uns.ac.rs/xmlws", partName = "response")
    public rs.ac.uns.ftn.xmlws.Status primiMT103(
        @WebParam(partName = "mt103", name = "MT_103", targetNamespace = "http://www.ftn.uns.ac.rs/mt103")
        rs.ac.uns.ftn.mt103.MT103 mt103
    );
}
