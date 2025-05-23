package com.zplus.terablog.blog.menu.dao;

import java.util.List;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zplus.terablog.common.base.dao.BaseDao;
import com.zplus.terablog.blog.menu.domain.po.Menu;
import com.zplus.terablog.blog.menu.domain.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

/**
 * 菜单表:数据层
 */
public interface MenuDao extends BaseDao<Menu> {
    
    /**
     * 分页查询菜单表
     */
    List<Menu> selectMenuList(@Param("page") Page<Menu> page, @Param("condition") MenuVO menu);
    List<Menu> selectMenuList(@Param("condition") MenuVO menu);
}
