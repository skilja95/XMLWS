package dbModels;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName="servis_nalog")
public class ServisNalogDB {
	
	public static final String MT_ID_FIELD_NAME="mtID";
	public static final String NALOG_ID_FIELD_NAME="nalogID";

	
	@DatabaseField(generatedId=true)
	private int id;
	
	
	@DatabaseField(columnName = MT_ID_FIELD_NAME, canBeNull=false)
	private String mtID;
	
	@DatabaseField(columnName = NALOG_ID_FIELD_NAME, canBeNull=false)
	private String nalogID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMtID() {
		return mtID;
	}

	public void setMtID(String mtID) {
		this.mtID = mtID;
	}

	public String getNalogID() {
		return nalogID;
	}

	public void setNalogID(String nalogID) {
		this.nalogID = nalogID;
	}

	public ServisNalogDB() {
		
	}

	public ServisNalogDB(String mtID, String nalogID) {
		super();
		this.mtID = mtID;
		this.nalogID = nalogID;
	}
	
	
	
	
}
