package refresh.ManageSystem.model;

import lombok.Builder;
import lombok.Getter;

import lombok.NonNull;
import lombok.ToString;

/**
 * Daniel Kim
 *
 * Holiday 테이블에 접근하는 Request DAO
 * year : 년 월 데이터
 * month
 *
 * 2023-04-18
 */
@Getter @ToString @Builder
public class HolidayDbModel {
    @NonNull private String year;
    @NonNull private String month;


}
