package indi.yangxu52.hyping.core.entity;

import lombok.NonNull;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
public interface TreeList<I, T> {
    /**
     * 获取Id
     *
     * @return ID
     */
    public T getId();

    /**
     * 获取父Id
     *
     * @return ParentID
     */
    public T getParentId();

    /**
     * 获取children列表
     *
     * @return Children列表
     */
    public List<I> getChildren();

    /**
     * 设置children列表
     *
     * @param children Children列表
     */
    public void setChildren(List<I> children);

    /**
     * ID的比较函数
     *
     * @param id ID1
     * @return 是否相等
     */
    public boolean compare(@NonNull T id);
}
