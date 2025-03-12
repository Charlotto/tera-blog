package com.zplus.terablog.blog.links.domain.vo;

import com.zplus.terablog.common.base.domain.vo.BaseVO;
import com.zplus.terablog.common.validator.annotion.NotBlank;
import com.zplus.terablog.blog.links.domain.validator.InsertLink;
import com.zplus.terablog.blog.links.domain.validator.UpdateLink;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FriendshipLinkVO extends BaseVO<FriendshipLinkVO> {

    @NotBlank(groups = {UpdateLink.class})
    private Long id;

    private String title;

    @NotBlank(groups = {InsertLink.class, UpdateLink.class})
    private String name;

    @NotBlank(groups = {InsertLink.class, UpdateLink.class})
    private String href;

    private String logo;

    private Integer sort;

    private String description;


}
