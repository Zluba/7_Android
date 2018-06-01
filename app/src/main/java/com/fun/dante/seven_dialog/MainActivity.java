package com.fun.dante.seven_dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button press = findViewById(R.id.press);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final View ViewDialog = (View)getLayoutInflater().inflate(R.layout.login_edit,null);
                name = ViewDialog.findViewById(R.id.name);
                password = ViewDialog.findViewById(R.id.password);

                new android.support.v7.app.AlertDialog.Builder(MainActivity.this)
                        .setTitle("登录")
                        .setView(ViewDialog)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                System.out.println(name.getText());
                                if(name.getText().toString().equals("abc")&&password.getText().toString().equals("123"))
                                {
                                    Toast.makeText(getApplicationContext(),"Success!",Toast.LENGTH_LONG).show();
                                }
                                else
                                {
                                    Toast.makeText(getApplicationContext(),"Failure!",Toast.LENGTH_LONG).show();
                                }
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"You are exit!",Toast.LENGTH_LONG).show();
                            }
                        }).show();
            }
        });
    }
}
