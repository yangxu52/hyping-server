package indi.yangxu52.hyping.core.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实例基类
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
public class BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @Schema(description = "主键ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @EqualsAndHashCode.Include
    @TableId
    private Long id;
    /**
     * 删除标记（0=未删除，1=已删除）
     */
    @Schema(description = "删除标记")
    @EqualsAndHashCode.Include
    @TableField()
    private String deleted;
    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    @EqualsAndHashCode.Exclude
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    /**
     * 更新用户
     */
    @Schema(description = "更新用户")
    @EqualsAndHashCode.Exclude
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;
    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    @EqualsAndHashCode.Exclude
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 创建用户
     */
    @Schema(description = "创建用户")
    @EqualsAndHashCode.Exclude
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;
}
