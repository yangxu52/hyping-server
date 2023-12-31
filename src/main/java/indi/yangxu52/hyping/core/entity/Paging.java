package indi.yangxu52.hyping.core.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * 分页数据
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
public class Paging<T> {
    /**
     * 分页列表
     */
    @Schema(description = "分页列表")
    private final List<T> list;
    /**
     * 总条数
     */
    @Schema(description = "总条数")
    private final Long total;

    public Paging(Long total, List<T> list) {
        this.total = total;
        this.list = list;
    }
}
