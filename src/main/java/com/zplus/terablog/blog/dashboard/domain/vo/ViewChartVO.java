package com.zplus.terablog.blog.dashboard.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 *    

 */
@Data
@Accessors(chain = true)
public class ViewChartVO {

    private List<ViewChartSpotVO> viewRecordList;

}
