package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_my_family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epg_parent_my_family);
    }

    public void startHome7(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequests7(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    /*public void startMessages8(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startProfile6(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startAdd(View view){
        Intent intent = new Intent(this, Parent_create_family_profile.class);
        startActivity(intent);
    }

    public void startSave3(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}