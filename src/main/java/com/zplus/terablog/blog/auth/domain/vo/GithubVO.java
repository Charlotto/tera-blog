package com.zplus.terablog.blog.auth.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description:
 *    

 */
@Data
@Accessors(chain = true)
public class GithubVO {
    private String id;
    private String login;
    private String avatar_url;
    private String email;
    private String name;
    private String html_url;

}
