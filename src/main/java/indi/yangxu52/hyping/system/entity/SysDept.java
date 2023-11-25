package indi.yangxu52.hyping.system.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@Data
public class SysDept implements Serializable {

    private Long id;

    private Long parentId;

    private String name;
}