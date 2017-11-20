package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CaResultCompanyListener.class)
@Table(name = "ca_result_company")
public class CaResultCompany {

    /** */
    @Id
    @Column(name = "result_company")
    Integer resultCompany;

    /** */
    @Column(name = "company_name")
    String companyName;

    /** */
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "company_number")
    Integer companyNumber;

    /** 
     * Returns the resultCompany.
     * 
     * @return the resultCompany
     */
    public Integer getResultCompany() {
        return resultCompany;
    }

    /** 
     * Sets the resultCompany.
     * 
     * @param resultCompany the resultCompany
     */
    public void setResultCompany(Integer resultCompany) {
        this.resultCompany = resultCompany;
    }

    /** 
     * Returns the companyName.
     * 
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Sets the companyName.
     * 
     * @param companyName the companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /** 
     * Returns the caId.
     * 
     * @return the caId
     */
    public String getCaId() {
        return caId;
    }

    /** 
     * Sets the caId.
     * 
     * @param caId the caId
     */
    public void setCaId(String caId) {
        this.caId = caId;
    }

    /** 
     * Returns the companyNumber.
     * 
     * @return the companyNumber
     */
    public Integer getCompanyNumber() {
        return companyNumber;
    }

    /** 
     * Sets the companyNumber.
     * 
     * @param companyNumber the companyNumber
     */
    public void setCompanyNumber(Integer companyNumber) {
        this.companyNumber = companyNumber;
    }
}