package com.mark.mark_mvp_sample.mvp.model.bean;

/**
 * $desc$ 实体类
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/7/27
 */
public class UserBean {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
