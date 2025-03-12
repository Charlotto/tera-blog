package com.zplus.terablog.common.base.domain.vo;

import com.zplus.terablog.common.validator.Messages;
import com.zplus.terablog.common.validator.annotion.IntegerNotNull;
import com.zplus.terablog.common.validator.annotion.NotNull;
import com.zplus.terablog.common.validator.annotion.Numeric;
import com.zplus.terablog.common.validator.constraint.IntegerValidator;
import com.zplus.terablog.common.validator.group.Page;
import com.zplus.terablog.common.validator.group.Update;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseVO<T> {

    /**
     * 主键
     */
    @NotNull(message = Messages.ID_NOT_NULL,groups = {Update.class})
    protected Long id;

    /**
     * 关键词搜索
     */
    protected String keywords;

    /**
     * 页数
     */
    @IntegerNotNull(groups = {Page.class},message = Messages.PAGE_NOT_NULL)
    protected Integer page;

    /**
     * 每页大小
     */
    @IntegerNotNull(groups = {Page.class},message = Messages.SIZE_NOT_NULL)
    protected Integer size;

    public Long getId() {
        return id;
    }

    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }

    public Integer getSize() {
        return size;
    }

    public BaseVO<T> setSize(Integer size) {
        this.size = size > 20 ? 20 : size;
        return this;
    }

}
