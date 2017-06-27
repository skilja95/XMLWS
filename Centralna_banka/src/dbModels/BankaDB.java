package dbModels;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "banka")
public class BankaDB {

	public static final String NAZIV_FIELD_NAME = "naziv";
	public static final String SWIFT_FIELD_NAME = "swift";
	public static final String OBRACUNSKIRACUN_FIELD_NAME = "obracunskiRacun";
	public static final String STANJE_FIELD_NAME = "stanje";

	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = NAZIV_FIELD_NAME, canBeNull = false, unique = true)
	private String naziv;

	@DatabaseField(columnName = SWIFT_FIELD_NAME, canBeNull = false, unique = true)
	private String swift;

	@DatabaseField(columnName = OBRACUNSKIRACUN_FIELD_NAME, canBeNull = false, unique = true)
	private String obracunskiRacun;

	@DatabaseField(columnName = STANJE_FIELD_NAME, canBeNull = false, unique = false)
	private int stanje;

	public BankaDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankaDB(int id, String naziv, String swift, String obracunskiRacun, int stanje) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.swift = swift;
		this.obracunskiRacun = obracunskiRacun;
		this.stanje = stanje;
	}
	
	public BankaDB(String swift, String obracunskiRacun) {
		super();
		this.swift = swift;
		this.obracunskiRacun = obracunskiRacun;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public String getObracunskiRacun() {
		return obracunskiRacun;
	}

	public void setObracunskiRacun(String obracunskiRacun) {
		this.obracunskiRacun = obracunskiRacun;
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	

}