package indi.yangxu52.hyping.core.entity;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/17
 */
public class Paging<T> {
    private final Long total;

    private final List<T> list;

    public Paging(Long total, List<T> list) {
        this.total = total;
        this.list = list;
    }
}
