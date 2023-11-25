package indi.yangxu52.hyping.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.yangxu52.hyping.system.entity.SysDept;
import indi.yangxu52.hyping.system.entity.vo.SysDeptTree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {
    /**
     * 获取原始部门树列表
     *
     * @return 原始部门树列表
     */
    List<SysDeptTree> getTreeList();
}
