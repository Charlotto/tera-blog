package com.zplus.terablog.blog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 *     
 * @description:

 * @modified:
 */
@Data
@Accessors(chain = true)
public class BlogMoveVO {

    @NotBlank(message = "Mysql用户名不能为空")
    private String username;

    @NotBlank(message = "Mysql密码不能为空")
    private String password;

    @NotNull(message = "端口不能为空")
    private Integer port;

    @NotBlank(message = "数据库不能为空")
    private String database;

    @NotBlank
    private String ip;

    @NotBlank
    private String blogType;
}
