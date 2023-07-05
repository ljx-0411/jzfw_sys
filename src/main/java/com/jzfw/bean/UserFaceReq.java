package com.jzfw.bean;

import java.util.Objects;

public class UserFaceReq {
    private long id;

    private String userface;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserFaceReq that = (UserFaceReq) o;
        return id == that.id && Objects.equals(userface, that.userface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userface);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFaceReq{");
        sb.append("id=").append(id);
        sb.append(", userface='").append(userface).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
