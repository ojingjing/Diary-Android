package com.example.diary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
        Button buttonsave =findViewById(R.id.save);
        Button buttoncancel =findViewById(R.id.cancel);
        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(WriteActivity.this);
                builder.setTitle("제목");
                builder.setMessage("저장하시겠습니까?");
                builder.setPositiveButton("ㅇ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { //error
                        data();
                        Toast.makeText(WriteActivity.this, "Today saved :-)", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNegativeButton("x", null );
                builder.create().show();


            }
        });
        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        }
        void data(){
            Intent intent =new Intent(this, MainActivity.class);
            EditText editText = findViewById(R.id.context);
            intent.putExtra("context",editText.getText().toString());
            getIntent().setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

    }
