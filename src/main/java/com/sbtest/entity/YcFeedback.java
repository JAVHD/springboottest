package com.sbtest.entity;

import java.io.Serializable;

/**
 * 意见回复(YcFeedback)实体类
 *
 * @author makejava
 * @since 2020-04-06 09:27:13
 */
public class YcFeedback implements Serializable {
    private static final long serialVersionUID = 537042979107262309L;

    private Integer id;
    /**
     * 用户id
     */
    private Integer createId;
    /**
     * 回复人id
     */
    private Integer replyMemberId;
    /**
     * 反馈内容
     */
    private String feedbackContent;
    /**
     * 图片
     */
    private String images;
    /**
     * 联系方式
     */
    private Integer contactPhone;
    /**
     * 手机品牌
     */
    private String brand;
    /**
     * 手机型号
     */
    private String model;
    /**
     * 操作系统版本
     */
    private String systemVersion;
    /**
     * app版本
     */
    private String appVersion;
    /**
     * 回复内容
     */
    private String replyContent;
    /**
     * 反馈时间
     */
    private Integer createTime;
    /**
     * 回复时间
     */
    private Integer replyTime;
    /**
     * 0未回复；1已回复；
     */
    private Object isReply;
    /**
     * 0未删除；1已删除
     */
    private Object isDelete;
    /**
     * 更新人id
     */
    private Integer updateId;
    /**
     * 更新时间
     */
    private Integer updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getReplyMemberId() {
        return replyMemberId;
    }

    public void setReplyMemberId(Integer replyMemberId) {
        this.replyMemberId = replyMemberId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(Integer contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Integer replyTime) {
        this.replyTime = replyTime;
    }

    public Object getIsReply() {
        return isReply;
    }

    public void setIsReply(Object isReply) {
        this.isReply = isReply;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

}