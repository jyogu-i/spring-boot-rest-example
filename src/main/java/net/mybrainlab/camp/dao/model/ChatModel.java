package net.mybrainlab.camp.dao.model;

import lombok.Getter;
import lombok.Setter;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.CaResultIndustry;
import net.mybrainlab.camp.dao.entity.Chat;

@Getter
@Setter
public class ChatModel extends Chat {
    private Ca caModel;
    private CaResultIndustry caResultIndustryModel;

}
