package com.khoubyari.example.dao.model;

import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.CaResultIndustry;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaModel extends Ca {
    private CaResultCompanyModel caResultCompanyModel;
    private CaResultIndustryModel caResultIndustryModel;
    private CaResultJobCategoryModel caResultJobCategoryModel;

}
