package com.gdg.bhopal.imdbfeedback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button SubmitBtn;
    EditText nameEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        nameEdt=(EditText)findViewById(R.id.nameEdt);
        setSupportActionBar(toolbar);

        SubmitBtn= (Button)findViewById(R.id.submitBtn);
        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThankYouActivity.class);
                i.putExtra("name", nameEdt.getText().toString());
                startActivity(i);
            }
        });



    }

    }



