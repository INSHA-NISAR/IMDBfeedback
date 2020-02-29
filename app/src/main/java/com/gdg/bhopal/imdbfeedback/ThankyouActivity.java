package com.gdg.bhopal.imdbfeedback;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ThankyouActivity extends AppCompatActivity {
    TextView thankYou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        thankYou = (TextView) findViewById(R.id.Thankyou);
        String s = getIntent().getStringExtra("name");

        thankYou.setText(thankYou.getText() + " " + s);
        FloatingActionButton coa= findViewById(R.id.coa);
        coa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
