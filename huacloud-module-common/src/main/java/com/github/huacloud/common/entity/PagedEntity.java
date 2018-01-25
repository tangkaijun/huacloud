package com.github.huacloud.common.entity;

/**
 * Created by kjtang on 2018/1/22.
 */
public class PagedEntity extends Entity{

    private Integer pageSize;
    private Integer curPage;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

}
