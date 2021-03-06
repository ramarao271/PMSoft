package org.erp.tarak.supplier;

import java.util.List;

import org.erp.tarak.address.AddressBean;
import org.erp.tarak.bankaccount.BankAccountBean;
import org.erp.tarak.contactperson.ContactPersonBean;



public class SupplierBean {

	private long supplierId;
	private String supplierType;
	private String supplierName;
	private String companyName;
	private String companyBranch;
	private long companyTelephone1;
	private long companyTelephone2;
	private long companyMobile1;
	private long companyMobile2;
	private String companyEmail;
	private String companyTinNo;
	private String companyCstNo;
	private AddressBean companyAddressBean;
	private List<BankAccountBean> supplierAccountsBeans;
	private List<ContactPersonBean> contactPersonsBeans;
	private double openingBalance;
	private double currentBalance;
	private double totalAmount;
	private double returnAmount;
	private double adjustedAmount;
	private double paidAmount;
	public SupplierBean() {
		super();
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyBranch() {
		return companyBranch;
	}
	public void setCompanyBranch(String companyBranch) {
		this.companyBranch = companyBranch;
	}
	
	public void setCompanyMobile2(Integer companyMobile2) {
		this.companyMobile2 = companyMobile2;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyTinNo() {
		return companyTinNo;
	}
	public void setCompanyTinNo(String companyTinNo) {
		this.companyTinNo = companyTinNo;
	}
	public String getCompanyCstNo() {
		return companyCstNo;
	}
	public void setCompanyCstNo(String companyCstNo) {
		this.companyCstNo = companyCstNo;
	}
	public AddressBean getCompanyAddressBean() {
		return companyAddressBean;
	}
	public void setCompanyAddressBean(AddressBean companyAddressBean) {
		this.companyAddressBean = companyAddressBean;
	}
	public List<BankAccountBean> getSupplierAccountsBeans() {
		return supplierAccountsBeans;
	}
	public void setSupplierAccountsBeans(List<BankAccountBean> supplierAccountsBeans) {
		this.supplierAccountsBeans = supplierAccountsBeans;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public long getCompanyTelephone1() {
		return companyTelephone1;
	}
	public void setCompanyTelephone1(long companyTelephone1) {
		this.companyTelephone1 = companyTelephone1;
	}
	public long getCompanyTelephone2() {
		return companyTelephone2;
	}
	public void setCompanyTelephone2(long companyTelephone2) {
		this.companyTelephone2 = companyTelephone2;
	}
	public long getCompanyMobile1() {
		return companyMobile1;
	}
	public void setCompanyMobile1(long companyMobile1) {
		this.companyMobile1 = companyMobile1;
	}
	public long getCompanyMobile2() {
		return companyMobile2;
	}
	public void setCompanyMobile2(long companyMobile2) {
		this.companyMobile2 = companyMobile2;
	}
	public String getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}
	public List<ContactPersonBean> getContactPersonsBeans() {
		return contactPersonsBeans;
	}
	public void setContactPersonsBeans(List<ContactPersonBean> contactPersonsBeans) {
		this.contactPersonsBeans = contactPersonsBeans;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getReturnAmount() {
		return returnAmount;
	}
	public void setReturnAmount(double returnAmount) {
		this.returnAmount = returnAmount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getAdjustedAmount() {
		return adjustedAmount;
	}
	public void setAdjustedAmount(double adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}
	
}
