package com.anthony.fansQueryBilibili.entity;

import java.util.List;

public class JsonTest {

    private String code;

    private String message;

    private String ttl;

    private List<FansQueryEntity> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public List<FansQueryEntity> getData() {
        return data;
    }

    public void setData(List<FansQueryEntity> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonTest{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", ttl='" + ttl + '\'' +
                ", data=" + data +
                '}';
    }
}
