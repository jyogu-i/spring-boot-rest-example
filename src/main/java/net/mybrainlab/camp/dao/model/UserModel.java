package net.mybrainlab.camp.dao.model;

import lombok.Getter;
import lombok.Setter;
import net.mybrainlab.camp.dao.entity.User;

@Getter
@Setter
public class UserModel extends User {
    private UserHopeModel userHopeModel;
    private UserPreviousModel userPreviousModel;
    private JobCategoryModel jobCategoryModel;
    private IndustryModel industryModel;

}
