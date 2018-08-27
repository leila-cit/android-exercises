package com.example.leila.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnList)
    Button btnList;

    @BindView(R.id.btnClose)
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnList)
    public void OnBtnListClicked(View view){
        Intent i = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.btnClose)
    public void OnBtnCloseClicked(View view){
        MainActivity.this.finish();
        System.exit(0);
    }

}
