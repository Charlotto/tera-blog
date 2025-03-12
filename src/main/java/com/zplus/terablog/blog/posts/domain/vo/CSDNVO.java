package com.zplus.terablog.blog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import us.codecraft.webmagic.model.annotation.ExtractBy;

import java.util.List;

/**
 *     
 * @description:

 * @modified:
 */

@Data
@Accessors(chain = true)
public class CSDNVO {

    @ExtractBy("//*[@id=\"mainBox\"]/main/div[1]/div/div/div[1]/h1/text()")
    private String title;

    @ExtractBy("//*[@id='content_views']")
    private List<String> content;

}
