package indi.yangxu52.hyping.system.entity.vo;

import indi.yangxu52.hyping.core.entity.TreeList;
import indi.yangxu52.hyping.system.entity.SysDept;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SysDeptTree extends SysDept implements TreeList<SysDeptTree, Long> {

    private List<SysDeptTree> children;

    public SysDeptTree(SysDept sysDept) {
        this.setId(sysDept.getId());
        this.setParentId(sysDept.getParentId());
        this.setName(sysDept.getName());
    }

    @Override
    public List<SysDeptTree> getChildren() {
        return this.children;
    }

    @Override
    public void setChildren(List<SysDeptTree> children) {
        this.children = children;
    }

    @Override
    public boolean compare(Long id) {
        return this.getId().longValue() == id.longValue();
    }
}
