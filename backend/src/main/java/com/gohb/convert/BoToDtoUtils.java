package com.gohb.convert;

import com.gohb.bo.sys.*;
import com.gohb.dto.*;
import org.springframework.beans.BeanUtils;

/**
 * BO 转换为 DTO
 */
public class BoToDtoUtils {

    /**
     * sysLogBO -> sysLogDTO
     * @param sysLogBO
     * @return
     */
    public static SysLogDTO sysLogBOTOSysLogDTO(SysLogBO sysLogBO) {
        if (sysLogBO == null) {
            return null;
        }
        SysLogDTO sysLogDTO = new SysLogDTO();
        BeanUtils.copyProperties(sysLogBO, sysLogDTO);
        return sysLogDTO;
    }

    /**
     * sysMenuBO -> sysMenuDTO
     * @param sysMenuBO
     * @return
     */
    public static SysMenuDTO sysMenuBOTOSysMenuDTO(SysMenuBO sysMenuBO) {
        if (sysMenuBO == null) {
            return null;
        }
        SysMenuDTO sysMenuDTO = new SysMenuDTO();
        BeanUtils.copyProperties(sysMenuBO, sysMenuDTO);
        return sysMenuDTO;
    }

    /**
     * sysRoleBO -> sysRoleDTO
     * @param sysRoleBO
     * @return
     */
    public static SysRoleDTO sysRoleBOTOSysRoleDTO(SysRoleBO sysRoleBO) {
        if (sysRoleBO == null) {
            return null;
        }
        SysRoleDTO sysRoleDTO = new SysRoleDTO();
        BeanUtils.copyProperties(sysRoleBO, sysRoleDTO);
        return sysRoleDTO;
    }

    /**
     * sysRoleMenuBO -> sysRoleMenuDTO
     * @param sysRoleMenuBO
     * @return
     */
    public static SysRoleMenuDTO sysRoleMenuBOTOSysRoleMenuDTO(SysRoleMenuBO sysRoleMenuBO) {
        if (sysRoleMenuBO == null) {
            return null;
        }
        SysRoleMenuDTO sysRoleMenuDTO = new SysRoleMenuDTO();
        BeanUtils.copyProperties(sysRoleMenuBO, sysRoleMenuDTO);
        return sysRoleMenuDTO;
    }

    /**
     * sysUserBO -> sysUserDTO
     * @param sysUserBO
     * @return
     */
    public static SysUserDTO sysUserBOTOSysUserDTO(SysUserBO sysUserBO) {
        if (sysUserBO == null) {
            return null;
        }
        SysUserDTO sysUserDTO = new SysUserDTO();
        BeanUtils.copyProperties(sysUserBO, sysUserDTO);
        return sysUserDTO;
    }

    /**
     * sysUserRoleBO -> sysUserRoleDTO
     * @param sysUserRoleBO
     * @return
     */
    public static SysUserRoleDTO sysUserRoleBOTOSysUserRoleDTO(SysUserRoleBO sysUserRoleBO) {
        if (sysUserRoleBO == null) {
            return null;
        }
        SysUserRoleDTO sysUserRoleDTO = new SysUserRoleDTO();
        BeanUtils.copyProperties(sysUserRoleBO, sysUserRoleDTO);
        return sysUserRoleDTO;
    }

}
