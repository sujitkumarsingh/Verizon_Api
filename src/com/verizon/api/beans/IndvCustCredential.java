package com.verizon.api.beans;

public class IndvCustCredential {

	private String ssn;
	
	private String dateOfBirth;
	
	private String drvLic;
	
	private String drvLicState;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDrvLic() {
		return drvLic;
	}

	public void setDrvLic(String drvLic) {
		this.drvLic = drvLic;
	}

	public String getDrvLicState() {
		return drvLicState;
	}

	public void setDrvLicState(String drvLicState) {
		this.drvLicState = drvLicState;
	}
	
}
