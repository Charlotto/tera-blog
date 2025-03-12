package com.zplus.terablog.blog.auth.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zplus.terablog.common.base.domain.vo.BaseVO;
import com.zplus.terablog.common.validator.annotion.IntegerNotNull;
import com.zplus.terablog.common.validator.annotion.NotBlank;
import com.zplus.terablog.blog.auth.domain.validator.InsertSocial;
import com.zplus.terablog.blog.auth.domain.validator.UpdateSocial;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AuthUserSocialVO extends BaseVO<AuthUserSocialVO> {
    // columns START
	@IntegerNotNull(groups = {UpdateSocial.class})
	private Long id;

	/**
	 * qq、csdn、wechat、weibo、email等
	 */
	@NotBlank(groups = {InsertSocial.class})
	private String code;
	/**
	 * 内容
	 */
	@TableField(value = "content")
	private String content;

	/**
	 * 展示类型( 1、显示二维码，2、显示账号，3、跳转链接)
	 */
	@TableField(value = "show_type")
	private Integer showType;

	/**
	 * 备注
	 */
	private String remark;

	private String icon;

	/**
	 * 是否删除
	 */
	@TableField(value = "is_enabled")
	private Integer isEnabled;

	/**
	 * 是否主页社交信息
	 */
	@TableField(value = "is_home")
	private Integer isHome;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time")
	private LocalDateTime createTime;

	/**
	 * 更新时间
	 */
	@TableField(value = "update_time")
	private LocalDateTime updateTime;
	// columns END
}