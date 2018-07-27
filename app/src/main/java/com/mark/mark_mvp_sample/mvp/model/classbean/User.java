package com.mark.mark_mvp_sample.mvp.model.classbean;

import com.mark.mark_mvp_sample.mvp.model.IUser;
import com.mark.mark_mvp_sample.mvp.model.bean.UserBean;

/**
 * $desc$  实体类的业务实现类
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/7/27
 */
public class User implements IUser {

    private UserBean bean;

    @Override
    public void savaUserInfo(UserBean user) {
        this.bean = user;
    }

    @Override
    public UserBean loadUserInfo() {
        if (bean != null) {
            return bean;
        }
        return null;
    }
}
