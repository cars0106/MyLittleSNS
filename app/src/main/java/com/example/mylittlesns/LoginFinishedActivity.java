package com.example.mylittlesns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginFinishedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_finished);
    }

    public void onLogoutClicked(View view) {
        Toast.makeText(getApplicationContext(), "로그아웃이 완료되었습니다.", Toast.LENGTH_LONG).show();
        finish();
    }
}
