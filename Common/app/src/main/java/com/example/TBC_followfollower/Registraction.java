package com.example.TBC_followfollower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Registraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Registraction);

    }

    @Override
    protected void onResume(){
        super.onResume();

        Button registbtn = (Button)findViewById(R.id.RegistButton);

        registbtn.setOnClickListener(new NaibuListener());
    }

    private  class NaibuListener implements View.OnClickListener{
        @Override
        public  void onClick(View view){

            TextView mail = (TextView)findViewById(R.id.Mail);
            TextView name = (TextView)findViewById(R.id.Name);
            TextView pass = (TextView)findViewById(R.id.Pass);
            TextView addpass = (TextView)findViewById(R.id.AddPass);

            //getText().toString()の意味を聞く
            String Mail = mail.getText().toString();
            String Name = name.getText().toString();
            String Pass = pass.getText().toString();
            String AddPass = addpass.getText().toString();


            Intent intent = new Intent(Registraction.this,RegistrationConfirm.class);
            Toast eror = Toast.makeText(Registraction.this, "内容に誤りがあります!!", Toast.LENGTH_LONG);

            if (Pass.equals(AddPass)) {
                //IntentでConfirmに内容を送信する
                intent.putExtra("Mail",Mail);
                intent.putExtra("Name",Name);
                intent.putExtra("Pass",Pass);

                startActivity(intent);

            }else{
                //エラーメッセージをtextにセットする
                eror.show();
            }

            //DBに登録する内容


        }
    }
}
