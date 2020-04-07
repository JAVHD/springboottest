package com.sbtest.entity;

import java.io.Serializable;

/**
 * 烟草商品表(YcGoods)实体类
 *
 * @author makejava
 * @since 2020-04-06 00:24:09
 */
public class YcGoods implements Serializable {
    private static final long serialVersionUID = -53410019970296877L;

    private Integer id;
    /**
     * 烟草条码
     */
    private String barCode;
    /**
     * 品名
     */
    private String goodsName;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品类
     */
    private String category;
    /**
     * 零售价(盒包装)
     */
    private Double price;
    /**
     * 零售价(条包装)
     */
    private Double itemPrice;
    /**
     * 产地
     */
    private String origin;
    /**
     * 产地id
     */
    private Integer originId;
    /**
     * 生产年份
     */
    private String productionYear;
    /**
     * 香烟类型
     */
    private String goodsType;
    /**
     * 焦油量
     */
    private String tar;
    /**
     * 计价单位(盒包装)
     */
    private String unit;
    /**
     * 期数
     */
    private String periodNum;
    /**
     * 物价员
     */
    private String priceClerk;
    /**
     * 商品条码(条包装)
     */
    private Integer itemBarCode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 省id
     */
    private Integer provinceId;
    /**
     * 市id
     */
    private Integer cityId;
    /**
     * 区id
     */
    private Integer areaId;
    /**
     * 街道id
     */
    private Integer streetId;
    /**
     * 创建者id
     */
    private Integer createId;
    /**
     * 更新者id
     */
    private Integer updateId;
    /**
     * 创建时间
     */
    private Integer createTime;
    /**
     * 更新时间
     */
    private Integer updateTime;
    /**
     * 1；已删除；0；未删除；
     */
    private Object isDelete;
    /**
     * 计价单位(条包装)
     */
    private String itemUnit;
    /**
     * 类别
     */
    private String cat;
    /**
     * 规格
     */
    private String standards;
    /**
     * 成本价
     */
    private Double costPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
    }

    public String getPriceClerk() {
        return priceClerk;
    }

    public void setPriceClerk(String priceClerk) {
        this.priceClerk = priceClerk;
    }

    public Integer getItemBarCode() {
        return itemBarCode;
    }

    public void setItemBarCode(Integer itemBarCode) {
        this.itemBarCode = itemBarCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

}