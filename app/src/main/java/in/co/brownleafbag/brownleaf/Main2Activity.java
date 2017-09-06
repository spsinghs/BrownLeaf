package in.co.brownleafbag.brownleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.toy3);

        Button btnDn = (Button) findViewById(R.id.btndonate);
        Button btnRe = (Button) findViewById(R.id.btnReceive);

        btnDn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DonorActivity.class);
                startActivity(i);

                // close this activity
               // finish();
            }
        });
        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, ReceiverActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        });
    }
    }