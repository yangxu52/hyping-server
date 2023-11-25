package indi.yangxu52.hyping.system.service.impl;

import indi.yangxu52.hyping.core.util.TreeUtil;
import indi.yangxu52.hyping.system.entity.vo.SysDeptTree;
import indi.yangxu52.hyping.system.mapper.SysDeptMapper;
import indi.yangxu52.hyping.system.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {

    private final SysDeptMapper sysDeptMapper;

    @Autowired
    public SysDeptServiceImpl(SysDeptMapper sysDeptMapper) {
        this.sysDeptMapper = sysDeptMapper;
    }


    @Override
    public List<SysDeptTree> getDeptTree() {
        List<SysDeptTree> list = sysDeptMapper.getTreeList();
        List<SysDeptTree> treeList = TreeUtil.parentList2Tree(list);
        return treeList;

    }
}
