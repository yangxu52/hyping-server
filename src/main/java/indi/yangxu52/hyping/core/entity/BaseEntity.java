package indi.yangxu52.hyping.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yangxu52
 * @Date 2023/11/17
 */
public class BaseEntity implements Serializable {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 更新用户
     */
    private Long updateBy;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 创建用户
     */
    private Long createBy;
}
