package dev.shantanu.com.forecastmvvm.data.db.entity;

import com.google.gson.annotations.SerializedName;

public class Condition {

    @SerializedName("code")
    private int code;

    @SerializedName("icon")
    private String icon;

    @SerializedName("text")
    private String text;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "Condition{" +
                        "code = '" + code + '\'' +
                        ",icon = '" + icon + '\'' +
                        ",text = '" + text + '\'' +
                        "}";
    }
}