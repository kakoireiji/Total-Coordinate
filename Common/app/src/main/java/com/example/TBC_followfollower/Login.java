package com.example.TBC_followfollower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Login);
    }
    @Override
    protected void onResume() {
        super.onResume();

        //ログインボタンを押した時の処理
        Button loginbtn = (Button) findViewById(R.id.LoginButton);

        loginbtn.setOnClickListener(new NaibuListeener());
    }

    private class NaibuListeener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            TextView mail = (TextView) findViewById(R.id.Mail);
            TextView pass = (TextView) findViewById(R.id.Pass);
            TextView eror = (TextView) findViewById(R.id.Eror);

            //メールとパスワードを取得
            String Mail = mail.getText().toString();
            String Pass = pass.getText().toString();

            //ログイン後はタイムラインに遷移
            Intent intent = new Intent(Login.this,Login.class);

            //DBのメールとパスワードを比較して可否を判断

            if (Mail.equals("sasaki")) {
                if (Pass.equals("sasaki7")) {

                }else {
                    eror.setText("エラーメッセージ");
                }
            }
        }
    }
}

