package com.sbtest.model;

public class Goods {
    private Integer id;

    private String barCode;

    private String name;

    private Integer origin;

    private String brand;

    private Integer tar;

    private String nicotine;

    private Integer carbonMon;

    private Integer smokeLen;

    private Byte goodsType;

    private Byte status;

    private Integer addTime;

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
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getTar() {
        return tar;
    }

    public void setTar(Integer tar) {
        this.tar = tar;
    }

    public String getNicotine() {
        return nicotine;
    }

    public void setNicotine(String nicotine) {
        this.nicotine = nicotine == null ? null : nicotine.trim();
    }

    public Integer getCarbonMon() {
        return carbonMon;
    }

    public void setCarbonMon(Integer carbonMon) {
        this.carbonMon = carbonMon;
    }

    public Integer getSmokeLen() {
        return smokeLen;
    }

    public void setSmokeLen(Integer smokeLen) {
        this.smokeLen = smokeLen;
    }

    public Byte getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Byte goodsType) {
        this.goodsType = goodsType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}