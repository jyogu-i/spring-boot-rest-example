package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "Ca_result_company")
public class CaResultCompany {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_company_id")
    Integer resultCompanyId;

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
        return resultCompanyId;
    }

    public void setResultCompany(Integer resultCompany) {
        this.resultCompanyId = resultCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public Integer getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(Integer companyNumber) {
        this.companyNumber = companyNumber;
    }
}