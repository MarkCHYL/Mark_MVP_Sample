package com.mark.mark_mvp_sample.mvp.view;

import com.mark.mark_mvp_sample.mvp.model.bean.UserBean;

/**
 * $desc$
 *
 * 一个是拿到数据，一个是把数据给别人，
 * 我们需要让我们的Activity去实现这个接口里面的方法，
 * 然后去做一些数据的显示或者获取。
 *
 * Presenter与View交互是通过接口。所以我们这里需要定义一个IUserView，
 * 难点就在于应该有哪些方法，我们看一眼效果图会发现一个是保存，一个是载入，
 * 所以我们就创建两个方法，分别是：getUser和setUser；
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/7/27
 */
public interface IUserView {
    UserBean getUser();
    void setUser(UserBean bean);
}
