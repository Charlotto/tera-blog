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
public class JianShuVO {

    @ExtractBy("//*[@id='__next']/div[1]/div/div/section[1]/h1/text()")
    private String title;

    @ExtractBy("//*[@id='__next']/div[1]/div/div/section[1]/article")
    private List<String> content;

}
