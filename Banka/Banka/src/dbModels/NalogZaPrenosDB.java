package dbModels;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName="nalog_za_prenos")
public class NalogZaPrenosDB {
	
	public static final String ID_PORUKE_FIELD_NAME="idPoruke";
	public static final String DUZNIK_FIELD_NAME="duznik";
	public static final String SVRHA_PLACANJA_FIELD_NAME="svrhaPlacanja";
	public static final String PRIMALAC_FIELD_NAME="primalac";
	public static final String OZNAKA_VALUTE_FIELD_NAME="oznakaValute";
	public static final String IZNOS_FIELD_NAME="iznos";
	public static final String BROJ_RACUNA_DUZNIKA_FIELD_NAME="brojRacunaDuznika";
	public static final String BROJ_MODELA_DUZNIKA_FIELD_NAME="brojModelaDuznika";
	public static final String POZIV_NA_BROJ_DUZNIKA_FIELD_NAME="pozivNaBrojDuznika";
	public static final String BROJ_RACUNA_PRIMAOCA_FIELD_NAME="brojRacunaPrimaoca";
	public static final String BROJ_MODELA_PRIMAOCA_FIELD_NAME="brojModelaPrimaoca";
	public static final String POZIV_NA_BROJ_PRIMAOCA_FIELD_NAME="pozivNaBrojPrimaoca";
	public static final String HITNO_FIELD_NAME="hitno";
	public static final String DATUM_VALUTE_FIELD_NAME="datumValute";
	public static final String DATUM_NALOGA_FIELD_NAME="datumNaloga";
	public static final String OBRADJENO_DUZNIK_FIELD_NAME="obradjenoDuznik";
	public static final String OBRADJENO_PRIMAOC_FIELD_NAME="obradjenoPrimaoc";
	
	
	@DatabaseField(generatedId=true)
	private int id;

	@DatabaseField(columnName = ID_PORUKE_FIELD_NAME, canBeNull=false,unique=true)
	private String idPoruke;
	
	@DatabaseField(columnName = DUZNIK_FIELD_NAME, canBeNull=false)
	private String duznik;
	
	@DatabaseField(columnName = SVRHA_PLACANJA_FIELD_NAME, canBeNull=false)
	private String svrhaPlacanja;
	
	@DatabaseField(columnName = PRIMALAC_FIELD_NAME, canBeNull=false)
	private String primalac;
	
	@DatabaseField(columnName = OZNAKA_VALUTE_FIELD_NAME, canBeNull=false)
	private String oznakaValute;
	
	@DatabaseField(columnName = IZNOS_FIELD_NAME, canBeNull=false)
	private double iznos;
	
	@DatabaseField(columnName = BROJ_RACUNA_DUZNIKA_FIELD_NAME, canBeNull=false)
	private String brojRacunaDuznika;
	
	@DatabaseField(columnName = BROJ_MODELA_DUZNIKA_FIELD_NAME, canBeNull=false)
	private int brojModelaDuznika;
	
	@DatabaseField(columnName = POZIV_NA_BROJ_DUZNIKA_FIELD_NAME, canBeNull=false)
	private String pozivNaBrojDuznika;
	
	@DatabaseField(columnName = BROJ_RACUNA_PRIMAOCA_FIELD_NAME, canBeNull=false)
	private String brojRacunaPrimaoca;
	
	@DatabaseField(columnName = BROJ_MODELA_PRIMAOCA_FIELD_NAME, canBeNull=false)
	private int brojModelaPrimaoca;
	
	@DatabaseField(columnName = POZIV_NA_BROJ_PRIMAOCA_FIELD_NAME, canBeNull=false)
	private String pozivNaBrojPrimaoca;
	
	@DatabaseField(columnName = HITNO_FIELD_NAME, canBeNull=false)
	private boolean hitno;
	
	@DatabaseField(columnName = DATUM_VALUTE_FIELD_NAME, canBeNull=false)
	private Date datumValute;
	
	@DatabaseField(columnName = DATUM_NALOGA_FIELD_NAME, canBeNull=false)
	private Date datumNaloga;
	
	@DatabaseField(columnName = OBRADJENO_DUZNIK_FIELD_NAME, canBeNull=false)
	private boolean obradjenoDuznik;
	
	@DatabaseField(columnName = OBRADJENO_PRIMAOC_FIELD_NAME, canBeNull=false)
	private boolean obradjenoPrimaoc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdPoruke() {
		return idPoruke;
	}

	public void setIdPoruke(String idPoruke) {
		this.idPoruke = idPoruke;
	}

	public String getDuznik() {
		return duznik;
	}

	public void setDuznik(String duznik) {
		this.duznik = duznik;
	}

	public String getSvrhaPlacanja() {
		return svrhaPlacanja;
	}

	public void setSvrhaPlacanja(String svrhaPlacanja) {
		this.svrhaPlacanja = svrhaPlacanja;
	}

	public String getPrimalac() {
		return primalac;
	}

	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}

	public String getOznakaValute() {
		return oznakaValute;
	}

	public void setOznakaValute(String oznakaValute) {
		this.oznakaValute = oznakaValute;
	}


	public String getBrojRacunaDuznika() {
		return brojRacunaDuznika;
	}

	public void setBrojRacunaDuznika(String brojRacunaDuznika) {
		this.brojRacunaDuznika = brojRacunaDuznika;
	}



	public String getPozivNaBrojDuznika() {
		return pozivNaBrojDuznika;
	}

	public void setPozivNaBrojDuznika(String pozivNaBrojDuznika) {
		this.pozivNaBrojDuznika = pozivNaBrojDuznika;
	}

	public String getBrojRacunaPrimaoca() {
		return brojRacunaPrimaoca;
	}

	public void setBrojRacunaPrimaoca(String brojRacunaPrimaoca) {
		this.brojRacunaPrimaoca = brojRacunaPrimaoca;
	}



	public String getPozivNaBrojPrimaoca() {
		return pozivNaBrojPrimaoca;
	}

	public void setPozivNaBrojPrimaoca(String pozivNaBrojPrimaoca) {
		this.pozivNaBrojPrimaoca = pozivNaBrojPrimaoca;
	}

	public boolean isHitno() {
		return hitno;
	}

	public void setHitno(boolean hitno) {
		this.hitno = hitno;
	}
	
	



	public NalogZaPrenosDB(String idPoruke, String duznik, String svrhaPlacanja, String primalac, String oznakaValute,
			double iznos, String brojRacunaDuznika, int brojModelaDuznika, String pozivNaBrojDuznika,
			String brojRacunaPrimaoca, int brojModelaPrimaoca, String pozivNaBrojPrimaoca, boolean hitno,
			Date datumValute, Date datumNaloga, boolean obradjenoDuznik, boolean obradjenoPrimaoc) {
		super();
		this.idPoruke = idPoruke;
		this.duznik = duznik;
		this.svrhaPlacanja = svrhaPlacanja;
		this.primalac = primalac;
		this.oznakaValute = oznakaValute;
		this.iznos = iznos;
		this.brojRacunaDuznika = brojRacunaDuznika;
		this.brojModelaDuznika = brojModelaDuznika;
		this.pozivNaBrojDuznika = pozivNaBrojDuznika;
		this.brojRacunaPrimaoca = brojRacunaPrimaoca;
		this.brojModelaPrimaoca = brojModelaPrimaoca;
		this.pozivNaBrojPrimaoca = pozivNaBrojPrimaoca;
		this.hitno = hitno;
		this.datumValute = datumValute;
		this.datumNaloga = datumNaloga;
		this.obradjenoDuznik = obradjenoDuznik;
		this.obradjenoPrimaoc = obradjenoPrimaoc;
	}

	public boolean isObradjenoDuznik() {
		return obradjenoDuznik;
	}

	public void setObradjenoDuznik(boolean obradjenoDuznik) {
		this.obradjenoDuznik = obradjenoDuznik;
	}

	public boolean isObradjenoPrimaoc() {
		return obradjenoPrimaoc;
	}

	public void setObradjenoPrimaoc(boolean obradjenoPrimaoc) {
		this.obradjenoPrimaoc = obradjenoPrimaoc;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public int getBrojModelaDuznika() {
		return brojModelaDuznika;
	}

	public void setBrojModelaDuznika(int brojModelaDuznika) {
		this.brojModelaDuznika = brojModelaDuznika;
	}

	public int getBrojModelaPrimaoca() {
		return brojModelaPrimaoca;
	}

	public void setBrojModelaPrimaoca(int brojModelaPrimaoca) {
		this.brojModelaPrimaoca = brojModelaPrimaoca;
	}

	public Date getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(Date datumValute) {
		this.datumValute = datumValute;
	}

	public Date getDatumNaloga() {
		return datumNaloga;
	}

	public void setDatumNaloga(Date datumNaloga) {
		this.datumNaloga = datumNaloga;
	}



	public NalogZaPrenosDB() {
	}
	
	
	
	
}
