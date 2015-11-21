package com.filthy.gnomes.controller;

import java.util.List;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public class DataStoreResult<T> extends AjaxResult {

    protected final Long total;

    protected final List<T> data;

    public DataStoreResult(Long total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    public DataStoreResult(List<T> data) {
        this.total = new Long(data.size());
        this.data = data;
    }

    public Long getTotal() {
        return this.total;
    }

    public List<T> getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "DataStoreResult [total=" + this.total + ", data=" + this.data + "]";
    }

}
