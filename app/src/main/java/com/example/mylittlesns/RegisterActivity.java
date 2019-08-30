package com.example.mylittlesns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText edit_ID, edit_PW, edit_PW_CHK;
    String sID, sPW, sPW_CHK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edit_ID = (EditText) findViewById(R.id.edit_register_id);
        edit_PW = (EditText) findViewById(R.id.edit_register_pw);
        edit_PW_CHK = (EditText) findViewById(R.id.edit_register_pw_chk);
    }

    public void onSignInClicked(View view) {
        sID = edit_ID.getText().toString();
        sPW = edit_PW.getText().toString();
        sPW_CHK = edit_PW_CHK.getText().toString();

        if(sPW.equals(sPW_CHK)) {
            //비밀번호와 비밀번호 확인이 일치할 때
        }
        else {
            //비밀번호와 비밀번호 확인이 불일치할 때
            Toast.makeText(getApplicationContext(), "비밀번호와 비밀번호 확인이 일치하지 않습니다.", Toast.LENGTH_LONG).show();
        }
    }

    public void onBackToLoginClicked(View view) {
        Toast.makeText(getApplicationContext(), "로그인 페이지로 돌아갑니다.", Toast.LENGTH_LONG).show();
        finish();
    }
}
