package com.gohb.manage;

import com.gohb.bo.SysMenuBO;
import com.gohb.dto.SysMenuDTO;

import java.util.List;

public interface SysMenuManage {

    /**
     * 新增菜单
     * @param sysMenuBO
     * @return
     */
    Boolean saveMenu(SysMenuBO sysMenuBO);

    /**
     * 删除菜单
     * @param id
     * @return
     */
    Boolean deleteMenu(Integer id);

    /**
     * 更新菜单
     * @param sysMenuBO
     * @return
     */
    Boolean updateMenu(SysMenuBO sysMenuBO);

    /**
     * 列出所有菜单
     * @param sysMenuBO
     * @return
     */
    List<SysMenuDTO> listMenu(SysMenuBO sysMenuBO);

}
