package com.example.mylittlesns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    EditText signInEditName, signInEditID, signInEditPW, signInEditRePW, logInEditID, logInEditPW, writeEditTitle, writeEditContent;
    Button btnSignIn, btnLogIn, btnWrite;
    String name, signInID, signInPW, signInRePW, logInID, logInPW, title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSignIn = tabHost.newTabSpec("SIGN IN").setIndicator("회원가입");
        tabSignIn.setContent(R.id.tabSignIn);
        tabHost.addTab(tabSignIn);

        TabHost.TabSpec tabLogIn = tabHost.newTabSpec("LOG IN").setIndicator("로그인");
        tabLogIn.setContent(R.id.tabLogIn);
        tabHost.addTab(tabLogIn);

        TabHost.TabSpec tabWrite = tabHost.newTabSpec("WRITE").setIndicator("글쓰기");
        tabWrite.setContent(R.id.tabWrite);
        tabHost.addTab(tabWrite);

        signInEditName = (EditText) findViewById(R.id.SIEdit1);
        signInEditID = (EditText) findViewById(R.id.SIEdit2);
        signInEditPW = (EditText) findViewById(R.id.SIEdit3);
        signInEditRePW = (EditText) findViewById(R.id.SIEdit4);

        logInEditID = (EditText) findViewById(R.id.LIEdit1);
        logInEditPW = (EditText) findViewById(R.id.LIEdit2);

        writeEditTitle = (EditText) findViewById(R.id.WREdit1);
        writeEditContent = (EditText) findViewById(R.id.WREdit2);

        btnSignIn = (Button) findViewById(R.id.BtnSignIn);
        btnLogIn = (Button) findViewById(R.id.BtnLogIn);
        btnWrite = (Button) findViewById(R.id.BtnWri);

        btnSignIn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                name = signInEditName.getText().toString();
                signInID = signInEditID.getText().toString();
                signInPW = signInEditPW.getText().toString();
                signInRePW = signInEditRePW.getText().toString();

                if(name.equals("") || signInID.equals("") || signInPW.equals("") || signInRePW.equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하지 않은 칸이 있습니다.", Toast.LENGTH_LONG).show();
                }
                else if(!signInPW.equals(signInRePW)) {
                    Toast.makeText(getApplicationContext(), "비밀번호와 비밀번호 확인이 다릅니다.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        btnLogIn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                logInID = logInEditID.getText().toString();
                logInPW = logInEditPW.getText().toString();
                if(logInID.equals("")) {
                    Toast.makeText(getApplicationContext(), "ID(아이디)를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if(logInPW.equals("")) {
                    Toast.makeText(getApplicationContext(), "PW(비밀번호)를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "로그인이 되었습니다.", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        btnWrite.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                title = writeEditTitle.getText().toString();
                content = writeEditContent.getText().toString();
                if(title.equals("") || content.equals("")) {
                    Toast.makeText(getApplicationContext(), "내용을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "내용이 저장되었습니다.", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}