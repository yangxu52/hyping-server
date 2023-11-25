package indi.yangxu52.hyping.system.service;

import indi.yangxu52.hyping.system.entity.vo.SysDeptTree;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
public interface SysDeptService {
    /**
     * 获取部门树列表
     *
     * @return 部门树列表
     */
    List<SysDeptTree> getDeptTree();
}
