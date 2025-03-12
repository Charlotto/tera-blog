package com.zplus.terablog.blog.category.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.category.domain.po.Tags;
import com.zplus.terablog.blog.category.domain.vo.TagsVO;

/**
 *     blogs
 */
public interface TagsService extends BaseService<Tags> {

    /**
     * 查询标签的列表
     * @param tagsVO
     * @return
     */
    Result<TagsVO> getTagsAndArticleQuantityList(TagsVO tagsVO);

    /**
     * 查询标签的列表
     * @param tagsVO
     * @return
     */
    Result<TagsVO> getTagsList(TagsVO tagsVO);

    /**
     * 查询标签
     * @param id
     * @return
     */
    Result<TagsVO> getTags(Long id);

    /**
     * 查询标签
     * @param tagsVO
     * @return
     */
    Result<TagsVO> updateTags(TagsVO tagsVO);

    /**
     * 删除标签
     * @param id
     * @return
     */
    Result<TagsVO> deleteTags(Long id);

    /**
     * 新增标签
     * @param tagsVO
     * @return
     */
    Result<TagsVO> saveTags(TagsVO tagsVO);
}
