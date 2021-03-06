
package rs.ac.uns.ftn.mt90010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.mt90010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MT910_QNAME = new QName("http://www.ftn.uns.ac.rs/mt90010", "MT910");
    private final static QName _MT900_QNAME = new QName("http://www.ftn.uns.ac.rs/mt90010", "MT900");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.mt90010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMT9 }
     * 
     */
    public TMT9 createTMT9() {
        return new TMT9();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMT9 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/mt90010", name = "MT910")
    public JAXBElement<TMT9> createMT910(TMT9 value) {
        return new JAXBElement<TMT9>(_MT910_QNAME, TMT9 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMT9 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/mt90010", name = "MT900")
    public JAXBElement<TMT9> createMT900(TMT9 value) {
        return new JAXBElement<TMT9>(_MT900_QNAME, TMT9 .class, null, value);
    }

}
