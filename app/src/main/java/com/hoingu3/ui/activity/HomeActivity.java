package com.hoingu3.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.android.mkit.hoingu3.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.img_voz)
    ImageView imgVoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_play)
    public void onViewClicked() {
        startActivity(new Intent(this, PlayActivity.class));
    }
}
