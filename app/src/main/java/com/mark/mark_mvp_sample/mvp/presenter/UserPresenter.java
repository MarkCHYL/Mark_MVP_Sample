package com.mark.mark_mvp_sample.mvp.presenter;

import com.mark.mark_mvp_sample.mvp.model.IUser;
import com.mark.mark_mvp_sample.mvp.model.classbean.User;
import com.mark.mark_mvp_sample.mvp.view.IUserView;

/**
 * $desc$
 *
 * 是连接Activity和Model的重要桥梁，所有的业务逻辑都在它里面完成：
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/7/27
 */
public class UserPresenter {
    private IUser user;
    private IUserView userView;

    public UserPresenter(IUserView userView) {
        this.userView = userView;
        user = new User();
    }

    public void saveUser(){
        user.savaUserInfo(userView.getUser());
    }

    public void loadUser(){
        userView.setUser(user.loadUserInfo());
    }
}
