package com.zplus.terablog.blog.menu.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.menu.domain.vo.MenuVO;

/**
 * 菜单表:业务接口类
 */
public interface MenuService {
    
    /**
     * 新增菜单表
     */
    Result saveMenu(MenuVO menuVO);
    
    
    /**
     * 查询菜单表
     */
    Result getMenu(Long id);

    
    /**
     * 分页查询菜单表
     */
    Result getMenuList(MenuVO menuVO);

    
    /**
     * 更新菜单表
     */
    Result updateMenu(MenuVO menuVO);

    
    /**
     * 删除菜单表
     */
    Result deleteMenu(Long id);

    Result getFrontMenuList(MenuVO menuVO);
}