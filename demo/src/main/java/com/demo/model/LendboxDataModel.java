package com.demo.model;


/*import javax.persistence.Entity;
import javax.persistence.Id;*/
import java.util.Date;

/*@Entity*/
public class LendboxDataModel {

	private /* @Id */ int loanId;
    private int enrollmentid;
    private String clientName;
    private String clientuid;
    private String clientkyctype;
    private String clientmobileno;
    private Date clientDob;
    private String clientGender;
    private String clientcareof;
    private String coborrowername;
    private String coborroweruid;
    private String coborrowerkyctype;
    private String coborrowermobileno;
    private String coborrowerGender;
    private String coborrowerDob;
    private String coborrowercareof;
    private Integer coborrowerrelation;
    private String clienthouseno;
    private String clientstreet;
    private String clientlocality;
    private String clientlandmark;
    private String clienttown;
    private String clientpostoffice;
    private String clientdistrict;
    private String clientsubdistrict;
    private String clientstate;
    private Integer clientpincode;
    private String coborrowerstreet;
    private String coborrowerlocality;
    private String coborrowerlandmark;
    private String coborrowertown;
    private String coborrowerpostoffice;
    private String coborrowerdistrict;
    private String coborrowerstate;
    private String coborrowerpincode;
    private String resaddress;
    private Long maritalStatus;
    private Long homeStatus;
    private Integer period;
    private Float interest;
    private Integer financeamount;
    private Long purpose;
    private String categoryDetail;
    private String equifaxScoreRetail;
    private String equifaxScoreMicrofinance;
    private Long relation;
    private Date minDuedate;
    private Integer totalhouseholdincome;
    private Date cibilDate;
    private Integer cflClients; 

	private String accountNumber;

    private String ifscCode;

    private String bankName;

    private String bankBranch;

    private String cheque;

    private String adharCard;

    private String longitude;

    private String latitude;

    private String deviceId;
    
    private String clientEmailId;
    private String clientCaste;
    private String coborrowerpancard;
    private String clientpancard;
    private Date sanctiondate;
    private String loan_app_id;
  //  private String coborrowerpancard;
    private Integer sanctionamount;
    private Integer emi;
    private Integer risk;
    private Integer filecharge;
    private String emi_type;
    private float apr;
	private Integer otherupfrontcharges;
	private Integer totalinterestcharge;
	private String noOfYrsInBusinessEmployment;
	private String impsBeneNameDest;
	private String impsBeneAccDest;
	private String noOfYrsAtCurrentAddress;
	private Integer verification;
	private Integer	autoRenewalStatus;
	private String staffName;
	private String staffAddress;
	private String staffEmailId;
	private String staffContact;
	private String staffTypeDetail;
	private Integer hospi;
	private String borrRelation;
	private String branchname;
	
	 private String loanpurpose;//////
	 private String pvAddress;
	 private Date entrydate ;
	 
	 private Integer  processingFees  ;
	 
	 
	 
    public Integer getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(Integer processingFees) {
		this.processingFees = processingFees;
	}

	public String getPvAddress() {
		return pvAddress;
	}

	public void setPvAddress(String pvAddress) {
		this.pvAddress = pvAddress;
	}

	public String getLoanpurpose() {
		return loanpurpose;
	}

	public void setLoanpurpose(String loanpurpose) {
		this.loanpurpose = loanpurpose;
	}

	
	public String getBorrRelation() {
		return borrRelation;
	}

	public void setBorrRelation(String borrRelation) {
		this.borrRelation = borrRelation;
	}

	public Integer getHospi() {
		return hospi;
	}

	public void setHospi(Integer hospi) {
		this.hospi = hospi;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffEmailId() {
		return staffEmailId;
	}

	public void setStaffEmailId(String staffEmailId) {
		this.staffEmailId = staffEmailId;
	}

	public String getStaffContact() {
		return staffContact;
	}

	public void setStaffContact(String staffContact) {
		this.staffContact = staffContact;
	}

	public String getStaffTypeDetail() {
		return staffTypeDetail;
	}

	public void setStaffTypeDetail(String staffTypeDetail) {
		this.staffTypeDetail = staffTypeDetail;
	}

	public Integer getVerification() {
		return verification;
	}

	public void setVerification(Integer verification) {
		this.verification = verification;
	}

	public String getNoOfYrsAtCurrentAddress() {
		return noOfYrsAtCurrentAddress;
	}

	public void setNoOfYrsAtCurrentAddress(String noOfYrsAtCurrentAddress) {
		this.noOfYrsAtCurrentAddress = noOfYrsAtCurrentAddress;
	}

	public Integer getTotalinterestcharge() {
		return totalinterestcharge;
	}

	public void setTotalinterestcharge(Integer totalinterestcharge) {
		this.totalinterestcharge = totalinterestcharge;
	}

	public Integer getOtherupfrontcharges() {
		return otherupfrontcharges;
	}

	public void setOtherupfrontcharges(Integer otherupfrontcharges) {
		this.otherupfrontcharges = otherupfrontcharges;
	}

	public String getEmi_type() {
		return emi_type;
	}

	public void setEmi_type(String emi_type) {
		this.emi_type = emi_type;
	}

	public float getApr() {
		return apr;
	}

	public void setApr(float apr) {
		this.apr = apr;
	}

	public Date getSanctiondate() {
		return sanctiondate;
	}

	public void setSanctiondate(Date sanctiondate) {
		this.sanctiondate = sanctiondate;
	}

	public String getLoan_app_id() {
		return loan_app_id;
	}

	public void setLoan_app_id(String loan_app_id) {
		this.loan_app_id = loan_app_id;
	}

	public String getCoborrowerpancard() {
		return coborrowerpancard;
	}

	public void setCoborrowerpancard(String coborrowerpancard) {
		this.coborrowerpancard = coborrowerpancard;
	}

	public Integer getSanctionamount() {
		return sanctionamount;
	}

	public void setSanctionamount(Integer sanctionamount) {
		this.sanctionamount = sanctionamount;
	}

	public Integer getEmi() {
		return emi;
	}

	public void setEmi(Integer emi) {
		this.emi = emi;
	}

	public Integer getRisk() {
		return risk;
	}

	public void setRisk(Integer risk) {
		this.risk = risk;
	}

	public Integer getFilecharge() {
		return filecharge;
	}

	public void setFilecharge(Integer filecharge) {
		this.filecharge = filecharge;
	}

//	public String getCoborrowerrelation() {
//		return coborrowerrelation;
//	}
//
//	public void setCoborrowerrelation(String coborrowerrelation) {
//		this.coborrowerrelation = coborrowerrelation;
//	}

	private Date termsConditionSignSl;

    public String getClientEmailId() {
		return clientEmailId;
	}

	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}

	public String getClientCaste() {
		return clientCaste;
	}

	public void setClientCaste(String clientCaste) {
		this.clientCaste = clientCaste;
	}

	public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getAdharCard() {
        return adharCard;
    }

    public void setAdharCard(String adharCard) {
        this.adharCard = adharCard;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String branchName) {
        this.bankBranch = branchName;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getEnrollmentid() {
        return enrollmentid;
    }

    public void setEnrollmentid(int enrollmentid) {
        this.enrollmentid = enrollmentid;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientuid() {
        return clientuid;
    }

    public void setClientuid(String clientuid) {
        this.clientuid = clientuid;
    }

    public String getClientkyctype() {
        return clientkyctype;
    }

    public void setClientkyctype(String clientkyctype) {
        this.clientkyctype = clientkyctype;
    }

    public String getClientmobileno() {
        return clientmobileno;
    }

    public void setClientmobileno(String clientmobileno) {
        this.clientmobileno = clientmobileno;
    }

    public Date getClientDob() {
        return clientDob;
    }

    public void setClientDob(Date clientDob) {
        this.clientDob = clientDob;
    }

    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    public String getClientcareof() {
        return clientcareof;
    }

    public void setClientcareof(String clientcareof) {
        this.clientcareof = clientcareof;
    }

    public String getCoborrowername() {
        return coborrowername;
    }

    public void setCoborrowername(String coborrowername) {
        this.coborrowername = coborrowername;
    }

    public String getCoborroweruid() {
        return coborroweruid;
    }

    public void setCoborroweruid(String coborroweruid) {
        this.coborroweruid = coborroweruid;
    }

    public String getCoborrowerkyctype() {
        return coborrowerkyctype;
    }

    public void setCoborrowerkyctype(String coborrowerkyctype) {
        this.coborrowerkyctype = coborrowerkyctype;
    }

    public String getCoborrowermobileno() {
        return coborrowermobileno;
    }

    public void setCoborrowermobileno(String coborrowermobileno) {
        this.coborrowermobileno = coborrowermobileno;
    }

    public String getCoborrowerGender() {
        return coborrowerGender;
    }

    public void setCoborrowerGender(String coborrowerGender) {
        this.coborrowerGender = coborrowerGender;
    }

    public String getCoborrowerDob() {
        return coborrowerDob;
    }

    public void setCoborrowerDob(String coborrowerDob) {
        this.coborrowerDob = coborrowerDob;
    }

    public String getCoborrowercareof() {
        return coborrowercareof;
    }

    public void setCoborrowercareof(String coborrowercareof) {
        this.coborrowercareof = coborrowercareof;
    }

    public String getClienthouseno() {
        return clienthouseno;
    }

    public void setClienthouseno(String clienthouseno) {
        this.clienthouseno = clienthouseno;
    }

    public String getClientstreet() {
        return clientstreet;
    }

    public void setClientstreet(String clientstreet) {
        this.clientstreet = clientstreet;
    }

    public String getClientlocality() {
        return clientlocality;
    }

    public void setClientlocality(String clientlocality) {
        this.clientlocality = clientlocality;
    }

    public String getClientlandmark() {
        return clientlandmark;
    }

    public void setClientlandmark(String clientlandmark) {
        this.clientlandmark = clientlandmark;
    }

    public String getClienttown() {
        return clienttown;
    }

    public void setClienttown(String clienttown) {
        this.clienttown = clienttown;
    }

    public String getClientpostoffice() {
        return clientpostoffice;
    }

    public void setClientpostoffice(String clientpostoffice) {
        this.clientpostoffice = clientpostoffice;
    }

    public String getClientdistrict() {
        return clientdistrict;
    }

    public void setClientdistrict(String clientdistrict) {
        this.clientdistrict = clientdistrict;
    }

    public String getClientstate() {
        return clientstate;
    }

    public void setClientstate(String clientstate) {
        this.clientstate = clientstate;
    }

    public Integer getClientpincode() {
        return clientpincode;
    }

    public void setClientpincode(Integer clientpincode) {
        this.clientpincode = clientpincode;
    }

    public String getCoborrowerstreet() {
        return coborrowerstreet;
    }

    public void setCoborrowerstreet(String coborrowerstreet) {
        this.coborrowerstreet = coborrowerstreet;
    }

    public String getCoborrowerlocality() {
        return coborrowerlocality;
    }

    public void setCoborrowerlocality(String coborrowerlocality) {
        this.coborrowerlocality = coborrowerlocality;
    }

    public String getCoborrowerlandmark() {
        return coborrowerlandmark;
    }

    public void setCoborrowerlandmark(String coborrowerlandmark) {
        this.coborrowerlandmark = coborrowerlandmark;
    }

    public String getCoborrowertown() {
        return coborrowertown;
    }

    public void setCoborrowertown(String coborrowertown) {
        this.coborrowertown = coborrowertown;
    }

    public String getCoborrowerpostoffice() {
        return coborrowerpostoffice;
    }

    public void setCoborrowerpostoffice(String coborrowerpostoffice) {
        this.coborrowerpostoffice = coborrowerpostoffice;
    }

    public String getCoborrowerdistrict() {
        return coborrowerdistrict;
    }

    public void setCoborrowerdistrict(String coborrowerdistrict) {
        this.coborrowerdistrict = coborrowerdistrict;
    }

    public String getCoborrowerstate() {
        return coborrowerstate;
    }

    public void setCoborrowerstate(String coborrowerstate) {
        this.coborrowerstate = coborrowerstate;
    }

    public String getCoborrowerpincode() {
        return coborrowerpincode;
    }

    public void setCoborrowerpincode(String coborrowerpincode) {
        this.coborrowerpincode = coborrowerpincode;
    }

    public String getResaddress() {
        return resaddress;
    }

    public void setResaddress(String resaddress) {
        this.resaddress = resaddress;
    }

    public Long getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Long maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Long getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(Long homeStatus) {
        this.homeStatus = homeStatus;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }

    public Integer getFinanceamount() {
        return financeamount;
    }

    public void setFinanceamount(Integer financeamount) {
        this.financeamount = financeamount;
    }

    public Long getPurpose() {
        return purpose;
    }

    public void setPurpose(Long purpose) {
        this.purpose = purpose;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public String getEquifaxScoreRetail() {
        return equifaxScoreRetail;
    }

    public void setEquifaxScoreRetail(String equifaxScoreRetail) {
        this.equifaxScoreRetail = equifaxScoreRetail;
    }

    public String getEquifaxScoreMicrofinance() {
        return equifaxScoreMicrofinance;
    }

    public void setEquifaxScoreMicrofinance(String equifaxScoreMicrofinance) {
        this.equifaxScoreMicrofinance = equifaxScoreMicrofinance;
    }

    public Long getRelation() {
        return relation;
    }

    public void setRelation(Long relation) {
        this.relation = relation;
    }

    public Date getMinDuedate() {
        return minDuedate;
    }

    public void setMinDuedate(Date minDuedate) {
        this.minDuedate = minDuedate;
    }

    public Integer getTotalhouseholdincome() {
        return totalhouseholdincome;
    }

    public void setTotalhouseholdincome(Integer totalhouseholdincome) {
        this.totalhouseholdincome = totalhouseholdincome;
    }

    public Date getCibilDate() {
        return cibilDate;
    }

    public void setCibilDate(Date cibilDate) {
        this.cibilDate = cibilDate;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    public Date getTermsConditionSignSl() {
        return termsConditionSignSl;
    }

    public void setTermsConditionSignSl(Date termsConditionSignSl) {
        this.termsConditionSignSl = termsConditionSignSl;
    }
    

    public String getClientsubdistrict() {
		return clientsubdistrict;
	}

	public void setClientsubdistrict(String clientsubdistrict) {
		this.clientsubdistrict = clientsubdistrict;
	}

	public String getClientpancard() {
		return clientpancard;
	}

	public void setClientpancard(String clientpancard) {
		this.clientpancard = clientpancard;
	}
	
	

	public String getNoOfYrsInBusinessEmployment() {
		return noOfYrsInBusinessEmployment;
	}

	public void setNoOfYrsInBusinessEmployment(String noOfYrsInBusinessEmployment) {
		this.noOfYrsInBusinessEmployment = noOfYrsInBusinessEmployment;
	}
	
	

	public String getImpsBeneNameDest() {
		return impsBeneNameDest;
	}

	public void setImpsBeneNameDest(String impsBeneNameDest) {
		this.impsBeneNameDest = impsBeneNameDest;
	}

	public String getImpsBeneAccDest() {
		return impsBeneAccDest;
	}

	public void setImpsBeneAccDest(String impsBeneAccDest) {
		this.impsBeneAccDest = impsBeneAccDest;
	}

	public Integer getCoborrowerrelation() {
		return coborrowerrelation;
	}

	public void setCoborrowerrelation(Integer coborrowerrelation) {
		this.coborrowerrelation = coborrowerrelation;
	}

	
	public Integer getAutoRenewalStatus() {
		return autoRenewalStatus;
	}

	public void setAutoRenewalStatus(Integer autoRenewalStatus) {
		this.autoRenewalStatus = autoRenewalStatus;
	}

	@Override
	public String toString() {
		return "LendboxDataModel [loanId=" + loanId + ", enrollmentid=" + enrollmentid + ", clientName=" + clientName
				+ ", clientuid=" + clientuid + ", clientkyctype=" + clientkyctype + ", clientmobileno=" + clientmobileno
				+ ", clientDob=" + clientDob + ", clientGender=" + clientGender + ", clientcareof=" + clientcareof
				+ ", coborrowername=" + coborrowername + ", coborroweruid=" + coborroweruid + ", coborrowerkyctype="
				+ coborrowerkyctype + ", coborrowermobileno=" + coborrowermobileno + ", coborrowerGender="
				+ coborrowerGender + ", coborrowerDob=" + coborrowerDob + ", coborrowercareof=" + coborrowercareof
				+ ", coborrowerrelation=" + coborrowerrelation + ", clienthouseno=" + clienthouseno + ", clientstreet="
				+ clientstreet + ", clientlocality=" + clientlocality + ", clientlandmark=" + clientlandmark
				+ ", clienttown=" + clienttown + ", clientpostoffice=" + clientpostoffice + ", clientdistrict="
				+ clientdistrict + ", clientsubdistrict=" + clientsubdistrict + ", clientstate=" + clientstate
				+ ", clientpincode=" + clientpincode + ", coborrowerstreet=" + coborrowerstreet
				+ ", coborrowerlocality=" + coborrowerlocality + ", coborrowerlandmark=" + coborrowerlandmark
				+ ", coborrowertown=" + coborrowertown + ", coborrowerpostoffice=" + coborrowerpostoffice
				+ ", coborrowerdistrict=" + coborrowerdistrict + ", coborrowerstate=" + coborrowerstate
				+ ", coborrowerpincode=" + coborrowerpincode + ", resaddress=" + resaddress + ", maritalStatus="
				+ maritalStatus + ", homeStatus=" + homeStatus + ", period=" + period + ", interest=" + interest
				+ ", financeamount=" + financeamount + ", purpose=" + purpose + ", categoryDetail=" + categoryDetail
				+ ", equifaxScoreRetail=" + equifaxScoreRetail + ", equifaxScoreMicrofinance="
				+ equifaxScoreMicrofinance + ", relation=" + relation + ", minDuedate=" + minDuedate
				+ ", totalhouseholdincome=" + totalhouseholdincome + ", cibilDate=" + cibilDate + ", accountNumber="
				+ accountNumber + ", ifscCode=" + ifscCode + ", bankName=" + bankName + ", bankBranch=" + bankBranch
				+ ", cheque=" + cheque + ", adharCard=" + adharCard + ", longitude=" + longitude + ", latitude="
				+ latitude + ", deviceId=" + deviceId + ", clientEmailId=" + clientEmailId + ", clientCaste="
				+ clientCaste + ", coborrowerpancard=" + coborrowerpancard + ", clientpancard=" + clientpancard
				+ ", sanctiondate=" + sanctiondate + ", loan_app_id=" + loan_app_id + ", sanctionamount="
				+ sanctionamount + ", emi=" + emi + ", risk=" + risk + ", filecharge=" + filecharge + ", emi_type="
				+ emi_type + ", apr=" + apr + ", termsConditionSignSl=" + termsConditionSignSl + ", getEmi_type()="
				+ getEmi_type() + ", getApr()=" + getApr() + ", getSanctiondate()=" + getSanctiondate()
				+ ", getLoan_app_id()=" + getLoan_app_id() + ", getCoborrowerpancard()=" + getCoborrowerpancard()
				+ ", getSanctionamount()=" + getSanctionamount() + ", getEmi()=" + getEmi() + ", getRisk()=" + getRisk()
				+ ", getFilecharge()=" + getFilecharge() + ", getClientEmailId()=" + getClientEmailId()
				+ ", getClientCaste()=" + getClientCaste() + ", getDeviceId()=" + getDeviceId() + ", getAdharCard()="
				+ getAdharCard() + ", getAccountNumber()=" + getAccountNumber() + ", getIfscCode()=" + getIfscCode()
				+ ", getBankName()=" + getBankName() + ", getBankBranch()=" + getBankBranch() + ", getCheque()="
				+ getCheque() + ", getLoanId()=" + getLoanId() + ", getEnrollmentid()=" + getEnrollmentid()
				+ ", getClientName()=" + getClientName() + ", getClientuid()=" + getClientuid()
				+ ", getClientkyctype()=" + getClientkyctype() + ", getClientmobileno()=" + getClientmobileno()
				+ ", getClientDob()=" + getClientDob() + ", getClientGender()=" + getClientGender()
				+ ", getClientcareof()=" + getClientcareof() + ", getCoborrowername()=" + getCoborrowername()
				+ ", getCoborroweruid()=" + getCoborroweruid() + ", getCoborrowerkyctype()=" + getCoborrowerkyctype()
				+ ", getCoborrowermobileno()=" + getCoborrowermobileno() + ", getCoborrowerGender()="
				+ getCoborrowerGender() + ", getCoborrowerDob()=" + getCoborrowerDob() + ", getCoborrowercareof()="
				+ getCoborrowercareof() + ", getClienthouseno()=" + getClienthouseno() + ", getClientstreet()="
				+ getClientstreet() + ", getClientlocality()=" + getClientlocality() + ", getClientlandmark()="
				+ getClientlandmark() + ", getClienttown()=" + getClienttown() + ", getClientpostoffice()="
				+ getClientpostoffice() + ", getClientdistrict()=" + getClientdistrict() + ", getClientstate()="
				+ getClientstate() + ", getClientpincode()=" + getClientpincode() + ", getCoborrowerstreet()="
				+ getCoborrowerstreet() + ", getCoborrowerlocality()=" + getCoborrowerlocality()
				+ ", getCoborrowerlandmark()=" + getCoborrowerlandmark() + ", getCoborrowertown()="
				+ getCoborrowertown() + ", getCoborrowerpostoffice()=" + getCoborrowerpostoffice()
				+ ", getCoborrowerdistrict()=" + getCoborrowerdistrict() + ", getCoborrowerstate()="
				+ getCoborrowerstate() + ", getCoborrowerpincode()=" + getCoborrowerpincode() + ", getResaddress()="
				+ getResaddress() + ", getMaritalStatus()=" + getMaritalStatus() + ", getHomeStatus()="
				+ getHomeStatus() + ", getPeriod()=" + getPeriod() + ", getInterest()=" + getInterest()
				+ ", getFinanceamount()=" + getFinanceamount() + ", getPurpose()=" + getPurpose()
				+ ", getCategoryDetail()=" + getCategoryDetail() + ", getEquifaxScoreRetail()="
				+ getEquifaxScoreRetail() + ", getEquifaxScoreMicrofinance()=" + getEquifaxScoreMicrofinance()
				+ ", getRelation()=" + getRelation() + ", getMinDuedate()=" + getMinDuedate()
				+ ", getTotalhouseholdincome()=" + getTotalhouseholdincome() + ", getCibilDate()=" + getCibilDate()
				+ ", getLongitude()=" + getLongitude() + ", getLatitude()=" + getLatitude()
				+ ", getTermsConditionSignSl()=" + getTermsConditionSignSl() + ", getClientsubdistrict()="
				+ getClientsubdistrict() + ", getClientpancard()=" + getClientpancard() + ", getCoborrowerrelation()="
				+ getCoborrowerrelation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Integer getCflClients() {
		return cflClients;
	}

	public void setCflClients(Integer cflClients) {
		this.cflClients = cflClients;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

}