package in.co.brownleafbag.brownleaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DonorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.toy3);

    }
}
