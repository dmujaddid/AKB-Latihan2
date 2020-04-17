package com.example.lat2;

import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife(target: this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, defaultValue: false)) {
            finish();
        }

    }

@OnClick(R.id.click_register)
    void mulai() {
    Intent intent = new Intent( packageContext: this, RegisterActivity.class);
    startActivity(intent);
}

}
