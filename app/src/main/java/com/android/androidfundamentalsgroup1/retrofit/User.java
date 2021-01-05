package com.android.androidfundamentalsgroup1.retrofit;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public User(String name) {
        this.name = name;
    }

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}