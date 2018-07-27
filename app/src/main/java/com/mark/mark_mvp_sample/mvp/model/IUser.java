package com.mark.mark_mvp_sample.mvp.model;

import com.mark.mark_mvp_sample.mvp.model.bean.UserBean;

/**
 * $desc$ 实体类的接口
 *
 * 这里大家要注意一下，IUser里面主要是接口，
 * 首先，我们要想好，在Presenter中要实现哪些逻辑，
 * 要用到哪些方法，然后就在这里定义哪些方法。
 * User主要是IUser的实现，返回一些数据，具体返回那些数据，
 * 就有大家自己去根据实际情况而定了。
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/7/27
 */
public interface IUser {
    void savaUserInfo(UserBean user);
    UserBean loadUserInfo();
}
