package utils;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pom")
public class Pom {
	private String searchField;

	public Pom() {
		super();
	}

	public Pom(String searchField) {
		super();
		this.searchField = searchField;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}
	
}
