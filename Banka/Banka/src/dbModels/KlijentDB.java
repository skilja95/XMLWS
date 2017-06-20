package dbModels;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="klijent")
public class KlijentDB {
	
	
	public static final String IME_FIELD_NAME="ime";
	public static final String BROJ_RACUNA_FIELD_NAME="brojRacuna";
	public static final String BANKA_ID_FIELD_NAME="banka_id";
	public static final String STANJE_FIELD_NAME="stanje";
	
	
	@DatabaseField(generatedId=true)
	private int id;
	
	@DatabaseField(columnName = IME_FIELD_NAME, canBeNull=false, unique=true)
	private String ime;

	@DatabaseField(columnName = BROJ_RACUNA_FIELD_NAME, canBeNull=false, unique=true)
	private String brojRacuna;
	
	@DatabaseField(foreign=true, columnName=BANKA_ID_FIELD_NAME, canBeNull=false)
	private BankaDB banka;
	
	@DatabaseField(columnName = STANJE_FIELD_NAME, canBeNull=false)
	private double stanje;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	

	

	public KlijentDB(String ime, String brojRacuna, BankaDB banka, double stanje) {
		super();
		this.ime = ime;
		this.brojRacuna = brojRacuna;
		this.banka = banka;
		this.stanje = stanje;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public BankaDB getBanka() {
		return banka;
	}

	public void setBanka(BankaDB banka) {
		this.banka = banka;
	}

	public KlijentDB() {
		// TODO Auto-generated constructor stub
	}
	
	

}
