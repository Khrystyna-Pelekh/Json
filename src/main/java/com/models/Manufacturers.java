package com.models;

import java.util.List;

public class Manufacturers {

    private List<ChildCompany> childCompanies;
    private String officePhoneNumber;
    private String reportSource;
    private String siteAddress;
    private String siteName;
    private String siteRegionState;

    public List<ChildCompany> getChildCompanies() {
        return childCompanies;
    }

    public void setChildCompanies(List<ChildCompany> childCompanies) {
        this.childCompanies = childCompanies;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteRegionState() {
        return siteRegionState;
    }

    public void setSiteRegionState(String siteRegionState) {
        this.siteRegionState = siteRegionState;
    }

}
