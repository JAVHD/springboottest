package com.sbtest.entity;

import java.io.Serializable;

/**
 * 省市区信息(YcDistrict)实体类
 *
 * @author makejava
 * @since 2020-04-06 00:34:38
 */
public class YcDistrict implements Serializable {
    private static final long serialVersionUID = 812708908188673300L;
    /**
     * id
     */
    private Integer id;
    /**
     * 上级id
     */
    private Integer pid;
    /**
     * 名称
     */
    private String name;
    /**
     * 简称
     */
    private String shortName;
    /**
     * 地区代码
     */
    private Integer code;
    /**
     * 路径
     */
    private String paths;
    /**
     * 路径名称
     */
    private String pathsName;
    /**
     * 经度
     */
    private Double lng;
    /**
     * 维度
     */
    private Double lat;
    /**
     * 区域类型；1省；2市；3区；4街道；
     */
    private Object type;
    /**
     * 排序
     */
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPaths() {
        return paths;
    }

    public void setPaths(String paths) {
        this.paths = paths;
    }

    public String getPathsName() {
        return pathsName;
    }

    public void setPathsName(String pathsName) {
        this.pathsName = pathsName;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}