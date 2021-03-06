package com.video.tanmu.model;

import lombok.Data;

import java.io.Serializable;

/**
 * type
 * @author 
 */
@Data
public class TypeModel implements Serializable {
    private Integer id;
    /**
     * 名称
     */
    private String name;

    /**
     * 父级分类
     */
    private Integer parentType;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}