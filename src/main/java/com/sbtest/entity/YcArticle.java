package com.sbtest.entity;

import java.io.Serializable;

/**
 * 文章(YcArticle)实体类
 *
 * @author makejava
 * @since 2020-04-06 09:34:28
 */
public class YcArticle implements Serializable {
    private static final long serialVersionUID = 339933997838804911L;

    private Integer id;
    /**
     * 文章分类
     */
    private Integer catId;
    /**
     * 文章编辑人id
     */
    private Integer createId;
    /**
     * 更新人
     */
    private Integer updateId;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章来源
     */
    private String source;
    /**
     * 跳转链接
     */
    private String redirectUrl;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 附件地址
     */
    private String attachmentUrl;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 0未删除；1已经删除
     */
    private Object isDelete;
    /**
     * 文章发表时间
     */
    private Integer publishTime;
    /**
     * 创建时间
     */
    private Integer createTime;
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

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Integer publishTime) {
        this.publishTime = publishTime;
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

}