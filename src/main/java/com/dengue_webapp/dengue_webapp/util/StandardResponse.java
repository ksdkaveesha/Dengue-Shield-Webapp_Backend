package com.dengue_webapp.dengue_webapp.util;

import lombok.Data;

@Data
public class StandardResponse {

    private int code;
    private String message;
    private Object data;

    public StandardResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public StandardResponse(){}

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public Object getData() {
        return data;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
