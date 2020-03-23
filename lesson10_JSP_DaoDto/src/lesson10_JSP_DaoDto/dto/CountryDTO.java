package lesson10_JSP_DaoDto.dto;

public class CountryDTO {
	String COUNTRY_ID;
	String COUNTRY_NAME;
	String REGION_ID;
	
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(String cOUNTRY_ID, String cOUNTRY_NAME, String rEGION_ID) {
		super();
		COUNTRY_ID = cOUNTRY_ID;
		COUNTRY_NAME = cOUNTRY_NAME;
		REGION_ID = rEGION_ID;
	}

	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}

	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}

	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}

	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		COUNTRY_NAME = cOUNTRY_NAME;
	}

	public String getREGION_ID() {
		return REGION_ID;
	}

	public void setREGION_ID(String rEGION_ID) {
		REGION_ID = rEGION_ID;
	}
	
	
}
