package com.gohb.manage;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gohb.bo.SysUserBO;
import com.gohb.dto.SysUserDTO;

import java.util.List;

public interface SysUserManage {

    /**
     * 新建用户
     * @param sysUserBO
     * @return
     */
    Boolean saveSysUser(SysUserBO sysUserBO);

    /**
     * 根据user id 根据用户
     * @param id
     * @return
     */
    Boolean deleteSysUser(Integer id);

    /**
     * 根据user id，更新用户信息
     * @param sysUserBO
     * @return
     */
    Boolean updateSysUser(SysUserBO sysUserBO);

    /**
     * 查询所有用户信息, 或模糊查询
     * @param page
     * @param sysUserBO
     * @return
     */
    IPage<SysUserDTO> listSysUser(Page<SysUserBO> page, SysUserBO sysUserBO);

    /**
     * 根据user id查询 用户信息
     * @param id
     * @return
     */
    SysUserDTO getSysUserById(Integer id);

}
