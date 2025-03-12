package com.zplus.terablog.blog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *     blogs
 */
@Data
@Accessors(chain = true)
public class PostsAttributeVO {

    private Long id;

    private String content;

}
