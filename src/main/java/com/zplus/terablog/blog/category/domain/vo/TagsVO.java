package com.zplus.terablog.blog.category.domain.vo;

import com.zplus.terablog.common.base.domain.vo.BaseVO;
import com.zplus.terablog.common.validator.annotion.NotBlank;
import com.zplus.terablog.common.validator.group.Insert;
import com.zplus.terablog.common.validator.group.Update;
import lombok.Data;
import lombok.experimental.Accessors;

/**

 * @modified:
 */
@Data
@Accessors(chain = true)
public class TagsVO extends BaseVO<TagsVO> {

    /**
     * 名称
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String name;

    /**
     * 文章总数
     */
    private Integer postsTotal;
}
