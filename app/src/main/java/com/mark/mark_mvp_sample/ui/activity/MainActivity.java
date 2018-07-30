package com.mark.mark_mvp_sample.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mark.mark_mvp_sample.R;
import com.mark.mark_mvp_sample.mvp.model.bean.UserBean;
import com.mark.mark_mvp_sample.mvp.presenter.UserPresenter;
import com.mark.mark_mvp_sample.mvp.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView {

    private EditText et_id, et_name;
    private TextView tv_data_show;

    private UserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new UserPresenter(this);

        initView();

        initEvent();
    }

    private void initEvent() {
        findViewById(R.id.btn_load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadUser();
            }
        });

        findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.saveUser();
            }
        });
    }

    private void initView() {
        et_id = findViewById(R.id.et_id);
        et_name = findViewById(R.id.et_name);

        tv_data_show = findViewById(R.id.tv_data_show);
    }

    @Override
    public UserBean getUser() {
        int id = Integer.valueOf(et_id.getText().toString().trim());
        String name = et_name.getText().toString().trim();
        if (name != null) {
            UserBean bean = new UserBean();
            bean.setId(id);
            bean.setName(name);
            return bean;
        }
        return null;
    }

    @Override
    public void setUser(UserBean bean) {
        if (bean!=null){
            tv_data_show.setText(bean.toString());
        }
    }
}
