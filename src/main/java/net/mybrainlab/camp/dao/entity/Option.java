package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Option implements Serializable {

    // キー
    String userId;

    /** 希望の年収 */
    String income;

    /** 希望の勤務地 */
    String place;

    /** 希望企業の規模 */
    String scaleNumber;

    /** 希望企業のタイプ */
    String scaleType;

    /** 資格 */
    String skill;

    /** 英語力 */
    String english;

    /** 希望転職時期：いつまでに */
    String timing;

    /** 転職活動に求めること */
    String work;

    /** 転職回数 */
    String times;

}