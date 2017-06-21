package help;

import java.util.ArrayList;

import dbModels.BankaDB;
import dbModels.NalogZaPrenosDB;

public class Trojka {

	public BankaDB bankaDuznik;
	
	public BankaDB bankaPrimaoc;
	
	public ArrayList<NalogZaPrenosDB> listaNaloga;

	public BankaDB getBankaDuznik() {
		return bankaDuznik;
	}

	public void setBankaDuznik(BankaDB bankaDuznik) {
		this.bankaDuznik = bankaDuznik;
	}

	public BankaDB getBankaPrimaoc() {
		return bankaPrimaoc;
	}

	public void setBankaPrimaoc(BankaDB bankaPrimaoc) {
		this.bankaPrimaoc = bankaPrimaoc;
	}

	public ArrayList<NalogZaPrenosDB> getListaNaloga() {
		return listaNaloga;
	}

	public void setListaNaloga(ArrayList<NalogZaPrenosDB> listaNaloga) {
		this.listaNaloga = listaNaloga;
	}

	public Trojka(BankaDB bankaDuznik, BankaDB bankaPrimaoc) {
		super();
		this.bankaDuznik = bankaDuznik;
		this.bankaPrimaoc = bankaPrimaoc;
		listaNaloga= new ArrayList<NalogZaPrenosDB>();
	}

	public Trojka() {
		super();
		listaNaloga= new ArrayList<NalogZaPrenosDB>();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
