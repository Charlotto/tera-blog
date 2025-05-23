package com.zplus.terablog.blog.category.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zplus.terablog.common.base.dao.BaseDao;
import com.zplus.terablog.blog.category.domain.po.Category;
import com.zplus.terablog.blog.category.domain.vo.CategoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CategoryDao extends BaseDao<Category> {

    /**
     * 查询一个分类有多少篇文章
     * @return
     */
    List<CategoryVO> selectCategoryPostsTotal();
    IPage<CategoryVO> selectStatistics(Page page, @Param(Constants.WRAPPER) Wrapper<CategoryVO> queryWrapper);

    IPage<Category> selectListPage(@Param("page") Page page, @Param("condition") CategoryVO categoryVO);
}
