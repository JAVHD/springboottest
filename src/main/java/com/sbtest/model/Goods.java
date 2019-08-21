package java.com.sbtest.model;

import java.math.BigDecimal;

public class Goods {
    private Integer id;

    private Long barCode;

    private String goodsName;

    private String brand;

    private String category;

    private BigDecimal price;

    private BigDecimal itemPrice;

    private String origin;

    private Integer originId;

    private Short productionYear;

    private String goodsType;

    private BigDecimal tar;

    private String unit;

    private Byte periodNum;

    private String priceClerk;

    private Long itemBarCode;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private Integer streetId;

    private Integer createId;

    private Integer updateId;

    private Integer createTime;

    private Integer updateTime;

    private Boolean isDelete;

    private String itemUnit;

    private String cat;

    private String standards;

    private BigDecimal costPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    public Short getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Short productionYear) {
        this.productionYear = productionYear;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public BigDecimal getTar() {
        return tar;
    }

    public void setTar(BigDecimal tar) {
        this.tar = tar;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Byte getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Byte periodNum) {
        this.periodNum = periodNum;
    }

    public String getPriceClerk() {
        return priceClerk;
    }

    public void setPriceClerk(String priceClerk) {
        this.priceClerk = priceClerk == null ? null : priceClerk.trim();
    }

    public Long getItemBarCode() {
        return itemBarCode;
    }

    public void setItemBarCode(Long itemBarCode) {
        this.itemBarCode = itemBarCode;
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat == null ? null : cat.trim();
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards == null ? null : standards.trim();
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }
}