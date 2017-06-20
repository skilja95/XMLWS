package dbModels;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="stavka")
public class StavkaDB {

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
	public static final String SMER_FIELD_NAME="smer";
	public static final String PRETHODNO_STANJE_FIELD_NAME="prethodnoStanje";
	public static final String TRENUTNO_STANJE_FIELD_NAME="trenutnoStanje";
	public static final String KLIJENT_ID_FIELD_NAME="klijent_id";
	
	
	@DatabaseField(generatedId=true)
	private int id;
	
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
	
	@DatabaseField(columnName = DATUM_VALUTE_FIELD_NAME, canBeNull=false)
	private Date datumValute;
	
	@DatabaseField(columnName = DATUM_NALOGA_FIELD_NAME, canBeNull=false)
	private Date datumNaloga;
	
	@DatabaseField(columnName = SMER_FIELD_NAME, canBeNull=false)
	private String smer;
	
	@DatabaseField(columnName = PRETHODNO_STANJE_FIELD_NAME, canBeNull=false)
	private double prethodnoStanje;
	
	@DatabaseField(columnName = TRENUTNO_STANJE_FIELD_NAME, canBeNull=false)
	private double trenutnoStanje;
	
	@DatabaseField(foreign=true, columnName=KLIJENT_ID_FIELD_NAME, canBeNull=false)
	private KlijentDB klijent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}

	public double getPrethodnoStanje() {
		return prethodnoStanje;
	}

	public void setPrethodnoStanje(double prethodnoStanje) {
		this.prethodnoStanje = prethodnoStanje;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void setTrenutnoStanje(double trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}

	public KlijentDB getKlijent() {
		return klijent;
	}

	public void setKlijent(KlijentDB klijent) {
		this.klijent = klijent;
	}

	



	public StavkaDB(String duznik, String svrhaPlacanja, String primalac, String oznakaValute, double iznos,
			String brojRacunaDuznika, int brojModelaDuznika, String pozivNaBrojDuznika, String brojRacunaPrimaoca,
			int brojModelaPrimaoca, String pozivNaBrojPrimaoca, Date datumValute, Date datumNaloga, String smer,
			double prethodnoStanje, double trenutnoStanje, KlijentDB klijent) {
		super();
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
		this.datumValute = datumValute;
		this.datumNaloga = datumNaloga;
		this.smer = smer;
		this.prethodnoStanje = prethodnoStanje;
		this.trenutnoStanje = trenutnoStanje;
		this.klijent = klijent;
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

	public StavkaDB() {
		
	}
	
	
	
}
