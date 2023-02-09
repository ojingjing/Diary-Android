package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
        Button buttonsave =findViewById(R.id.save);
        Button buttoncancel =findViewById(R.id.cancel);
        public void m0nClick(View v){
            AlterDialog.Builder builder;
            switch (v.getId()){

            }
        }
        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WriteActivity.this, "Today saved :-)", Toast.LENGTH_SHORT).show();
            }
        });


        }
    }
}