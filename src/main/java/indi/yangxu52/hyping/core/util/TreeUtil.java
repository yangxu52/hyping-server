package indi.yangxu52.hyping.core.util;

import indi.yangxu52.hyping.core.entity.TreeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
public class TreeUtil {


    public static <I extends TreeList<I, T>, T> List<I> parentList2Tree(List<I> list) {
        List<I> returnList = new ArrayList<>();
        List<T> tempList = new ArrayList<>();
        for (I item : list) {
            tempList.add(item.getId());
        }
        for (I dept : list) {
            // 如果是顶级节点, 遍历该父节点的所有子节点
            if (!tempList.contains(dept.getParentId())) {
                recursionFn(list, dept);
                returnList.add(dept);
            }
        }
        if (returnList.isEmpty()) {
            returnList = list;
        }
        return returnList;
    }

    /**
     * 递归列表
     */
    private static <I extends TreeList<I, T>, T> void recursionFn(List<I> list, I t) {
        // 得到子节点列表
        List<I> childList = getChildList(list, t);
        t.setChildren(childList);
        for (I tChild : childList) {
            if (hasChild(list, tChild)) {
                recursionFn(list, tChild);
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private static <I extends TreeList<I, T>, T> List<I> getChildList(List<I> list, I t) {
        List<I> tlist = new ArrayList<I>();
        for (I n : list) {
            if (Objects.nonNull(n.getParentId()) && t.compare(n.getParentId())) {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private static <I extends TreeList<I, T>, T> boolean hasChild(List<I> list, I t) {
        return !getChildList(list, t).isEmpty();
    }
}
