package indi.yangxu52.hyping.core.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实例基类
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
public class BaseEntity implements Serializable {

    /**
     * 主键ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    /**
     * 删除标记（0=未删除，1=已删除）
     */
    private String deleted;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    /**
     * 更新用户
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 创建用户
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;
}
