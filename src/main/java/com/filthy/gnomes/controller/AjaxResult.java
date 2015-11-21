package com.filthy.gnomes.controller;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public class AjaxResult {

    protected final Boolean success;

    protected final String message;

    protected final Object dataObject;

    public AjaxResult() {
        this.success = true;
        this.message = "OK";
        this.dataObject = null;
    }

    public AjaxResult(Boolean success, String message) {
        this.success = success;
        this.message = message;
        this.dataObject = null;
    }

    public AjaxResult(Boolean success, String message, Object dataObject) {
        this.success = success;
        this.message = message;
        this.dataObject = dataObject;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getDataObject() {
        return dataObject;
    }
}
