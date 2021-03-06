
package rs.ac.uns.ftn.mt102;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import rs.ac.uns.ftn.nalogzaprenos.NalogZaPrenos;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPoruke" type="{http://www.ftn.uns.ac.rs/xmlws}TIDPoruke"/>
 *         &lt;element name="SwiftKodBankeDuznika" type="{http://www.ftn.uns.ac.rs/xmlws}TSWIFT"/>
 *         &lt;element name="ObracunskiRacunBankeDuznika" type="{http://www.ftn.uns.ac.rs/xmlws}TBrojRacuna"/>
 *         &lt;element name="SwiftKodBankePoverioca" type="{http://www.ftn.uns.ac.rs/xmlws}TSWIFT"/>
 *         &lt;element name="ObracunskiRacunBankePoverioca" type="{http://www.ftn.uns.ac.rs/xmlws}TBrojRacuna"/>
 *         &lt;element name="UkupanIznos" type="{http://www.ftn.uns.ac.rs/xmlws}TIznos"/>
 *         &lt;element name="SifraValute" type="{http://www.ftn.uns.ac.rs/xmlws}TOznaka_valute"/>
 *         &lt;element name="DatumValute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/nalogZaPrenos}nalog_za_prenos" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idPoruke",
    "swiftKodBankeDuznika",
    "obracunskiRacunBankeDuznika",
    "swiftKodBankePoverioca",
    "obracunskiRacunBankePoverioca",
    "ukupanIznos",
    "sifraValute",
    "datumValute",
    "datum",
    "nalogZaPrenos"
})
@XmlRootElement(name = "mt102")
public class Mt102 {

    @XmlElement(name = "IdPoruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "SwiftKodBankeDuznika", required = true)
    protected String swiftKodBankeDuznika;
    @XmlElement(name = "ObracunskiRacunBankeDuznika", required = true)
    protected String obracunskiRacunBankeDuznika;
    @XmlElement(name = "SwiftKodBankePoverioca", required = true)
    protected String swiftKodBankePoverioca;
    @XmlElement(name = "ObracunskiRacunBankePoverioca", required = true)
    protected String obracunskiRacunBankePoverioca;
    @XmlElement(name = "UkupanIznos", required = true)
    protected BigDecimal ukupanIznos;
    @XmlElement(name = "SifraValute", required = true)
    protected String sifraValute;
    @XmlElement(name = "DatumValute", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(name = "Datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "nalog_za_prenos", namespace = "http://www.ftn.uns.ac.rs/nalogZaPrenos", required = true)
    protected List<NalogZaPrenos> nalogZaPrenos;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the swiftKodBankeDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftKodBankeDuznika() {
        return swiftKodBankeDuznika;
    }

    /**
     * Sets the value of the swiftKodBankeDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftKodBankeDuznika(String value) {
        this.swiftKodBankeDuznika = value;
    }

    /**
     * Gets the value of the obracunskiRacunBankeDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacunBankeDuznika() {
        return obracunskiRacunBankeDuznika;
    }

    /**
     * Sets the value of the obracunskiRacunBankeDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacunBankeDuznika(String value) {
        this.obracunskiRacunBankeDuznika = value;
    }

    /**
     * Gets the value of the swiftKodBankePoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftKodBankePoverioca() {
        return swiftKodBankePoverioca;
    }

    /**
     * Sets the value of the swiftKodBankePoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftKodBankePoverioca(String value) {
        this.swiftKodBankePoverioca = value;
    }

    /**
     * Gets the value of the obracunskiRacunBankePoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacunBankePoverioca() {
        return obracunskiRacunBankePoverioca;
    }

    /**
     * Sets the value of the obracunskiRacunBankePoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacunBankePoverioca(String value) {
        this.obracunskiRacunBankePoverioca = value;
    }

    /**
     * Gets the value of the ukupanIznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupanIznos() {
        return ukupanIznos;
    }

    /**
     * Sets the value of the ukupanIznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupanIznos(BigDecimal value) {
        this.ukupanIznos = value;
    }

    /**
     * Gets the value of the sifraValute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifraValute() {
        return sifraValute;
    }

    /**
     * Sets the value of the sifraValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifraValute(String value) {
        this.sifraValute = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the nalogZaPrenos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nalogZaPrenos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNalogZaPrenos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NalogZaPrenos }
     * 
     * 
     */
    public List<NalogZaPrenos> getNalogZaPrenos() {
        if (nalogZaPrenos == null) {
            nalogZaPrenos = new ArrayList<NalogZaPrenos>();
        }
        return this.nalogZaPrenos;
    }

}
