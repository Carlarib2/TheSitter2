package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class my_rate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rate);
    }

    public void startHome6(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequests6(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessages7(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile5(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }
}