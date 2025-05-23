package com.zplus.terablog.blog.category.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.category.domain.po.Category;
import com.zplus.terablog.blog.category.domain.vo.CategoryVO;

/**
 *     blogs
 */
public interface CategoryService extends BaseService<Category> {

    /**
     * 新增分类
     * @param categoryVO
     * @return
     */
    Result saveCategory(CategoryVO categoryVO);

    /**
     * 查询分类列表
     * @param categoryVO
     * @return
     */
    Result getCategoryList(CategoryVO categoryVO);


    /**
     * 查询带有分类标签列表
     * @param categoryVO
     * @return
     */
    Result getCategoryTagsList(CategoryVO categoryVO);

    /**
     * 查询带有分类标签
     * @param id
     * @return
     */
    Result getCategoryTags(Long id);

    /**
     * 查询分类
     * @param id
     * @return
     */
    Result getCategory(Long id);

    /**
     * 更新分类
     * @param categoryVO
     * @return
     */
    Result updateCategory(CategoryVO categoryVO);

    /**
     * 删除分类
     * @param id
     * @return
     */
    Result deleteCategory(Long id);

    Result statisticsList(CategoryVO categoryVO);
}
