package com.dl7.simple.drag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dl7.simple.drag.activity.AnimateActivity;
import com.dl7.simple.drag.activity.DragActivity;
import com.dl7.simple.drag.activity.DragBlurActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_drag)
    Button mBtnDrag;
    @BindView(R.id.btn_animate)
    Button mBtnAnimate;
    @BindView(R.id.btn_other)
    Button mBtnOther;
    @BindView(R.id.tool_bar)
    Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolBar);
        mToolBar.setTitle("DragSlopLayout");
    }

    @OnClick({R.id.btn_drag, R.id.btn_animate, R.id.btn_other})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_drag:
                startActivity(new Intent(this, DragActivity.class));
                break;
            case R.id.btn_animate:
                startActivity(new Intent(this, AnimateActivity.class));
                break;
            case R.id.btn_other:
                startActivity(new Intent(this, DragBlurActivity.class));
                break;
        }
    }
}
