package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "Ca")
@Data
public class Ca {

    /** */
    @Id
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "ca_name")
    String caName;

    /** */
    @Column(name = "gender_id")
    String genderId;

    /** */
    @Column(name = "ca_company")
    String caCompany;

    /** */
    @Column(name = "ca_img")
    String caImg;

    /** */
    @Column(name = "place_id")
    String placeId;

    /** */
    @Column(name = "pr_message")
    String prMessage;

    /** */
    @Column(name = "max_flg")
    Integer maxFlg;

    @Column(name = "ca_company_place")
    String caCompanyPlace;

    @Column(name = "ca_company_url")
    String caCompanyUrl;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "ca_yomigana")
    String caYomigana;

    @Column(name = "intro_message")
    String introMessage;

    @Column(name = "update")
    String update;

    @Column(name = "favo")
    String favo;

    @Column(name = "ca_mail")
    String caMail;

    @Column(name = "ca_password")
    String caPassword;

}