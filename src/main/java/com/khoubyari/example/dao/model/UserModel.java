package com.khoubyari.example.dao.model;

import com.khoubyari.example.dao.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel extends User {
    private UserHopeModel userHopeModel;
    private UserPreviousModel userPreviousModel;
    private JobCategoryModel jobCategoryModel;
    private IndustryModel industryModel;

}
