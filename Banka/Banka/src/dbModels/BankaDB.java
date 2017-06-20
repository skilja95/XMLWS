package dbModels;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="banka")
public class BankaDB {
	
	public static final String NAZIV_FIELD_NAME="naziv";
	public static final String SWIFT_FIELD_NAME="swift";
	public static final String OBRACUNSKIRACUN_FIELD_NAME="obracunskiRacun";
	
	@DatabaseField(generatedId=true)
	private int id;
	
	@DatabaseField(columnName = NAZIV_FIELD_NAME, canBeNull=false, unique=true)
	private String naziv;

	@DatabaseField(columnName = SWIFT_FIELD_NAME, canBeNull=false, unique=true)
	private String swift;
	
	@DatabaseField(columnName = OBRACUNSKIRACUN_FIELD_NAME, canBeNull=false, unique=true)
	private String obracunskiRacun;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	



	public BankaDB(String naziv, String swift, String obracunskiRacun) {
		super();
		this.naziv = naziv;
		this.swift = swift;
		this.obracunskiRacun = obracunskiRacun;
	}

	public String getObracunskiRacun() {
		return obracunskiRacun;
	}

	public void setObracunskiRacun(String obracunskiRacun) {
		this.obracunskiRacun = obracunskiRacun;
	}

	public BankaDB() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
