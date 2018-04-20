package com.hoingu3.ui.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.mkit.hoingu3.R;
import com.hoingu3.ui.adapter.MyDatabaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayActivity extends BaseActivity {

    @BindView(R.id.tv_question)
    TextView tvQuestion;
    @BindView(R.id.bt_ans_a)
    Button btAnsA;
    @BindView(R.id.bt_ans_b)
    Button btAnsB;
    @BindView(R.id.bt_ans_c)
    Button btAnsC;
    @BindView(R.id.bt_ans_d)
    Button btAnsD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ButterKnife.bind(this);
        getData();
    }

    public void getData() {
        MyDatabaseAdapter myDatabase = new MyDatabaseAdapter(this);
        myDatabase.open();
        SQLiteDatabase database = myDatabase.getMyDatabase();
        if (database != null) {
//            Toast.makeText(this, "data base exist!", Toast.LENGTH_LONG).show();
            Cursor cursor = database.rawQuery("SELECT * FROM 'tb_dvhainaohoingu' WHERE _id = 1", null);
            while (cursor.moveToNext()) {
                tvQuestion.setText(cursor.getString(1));
            }
        }
    }

    @OnClick({R.id.bt_ans_a, R.id.bt_ans_b, R.id.bt_ans_c, R.id.bt_ans_d})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_ans_a:
                break;
            case R.id.bt_ans_b:
                break;
            case R.id.bt_ans_c:
                break;
            case R.id.bt_ans_d:
                break;
        }
    }
}
