package com.example.TBC_followfollower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationConfirm extends AppCompatActivity {


    //ローカル変数
    EditText pass;
    String Mail;
    String Pass;
    String Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.RegistrationConfirm);

        //前のRegistractionから値を受け取る
        Intent RegistIntent = getIntent();

        Mail = RegistIntent.getStringExtra("Mail");
        Pass = RegistIntent.getStringExtra("Pass");
        Name = RegistIntent.getStringExtra("Name");

        //テキストボックスのIDを取得
        TextView Tmail = (TextView)findViewById(R.id.Mail) ;
        TextView Tpass = (TextView)findViewById(R.id.Pass) ;
        TextView Tname = (TextView)findViewById(R.id.Name) ;

        //テキストボックスに受け取った値を入れ込む
        Tmail.setText(Mail);
        Tpass.setText(Pass);
        Tname.setText(Name);

        CheckBox check = (CheckBox)findViewById(R.id.password_visibility);


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               //!いるかも？？
                if(isChecked){
                    pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }else{
                    pass.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });


    }
}
