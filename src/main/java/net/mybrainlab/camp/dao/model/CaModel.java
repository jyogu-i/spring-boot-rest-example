package net.mybrainlab.camp.dao.model;

import lombok.Getter;
import lombok.Setter;
import net.mybrainlab.camp.dao.entity.Ca;

@Getter
@Setter
public class CaModel extends Ca {
    private CaResultCompanyModel caResultCompanyModel;
    private CaResultIndustryModel caResultIndustryModel;
    private CaResultJobCategoryModel caResultJobCategoryModel;

}
