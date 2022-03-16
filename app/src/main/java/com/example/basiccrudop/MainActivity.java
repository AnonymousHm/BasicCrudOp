package com.example.basiccrudop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuav,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
          int id=item.getItemId();
        if (id==R.id.login){
            Intent signup = new Intent(MainActivity.this, signup.class);
            startActivity(signup);
        }
        if(id==R.id.gmail){
            Intent gmail = new Intent(Intent.ACTION_SEND);
            gmail.setType("*/*");
            gmail.putExtra(Intent.EXTRA_EMAIL,"address");
            gmail.putExtra(Intent.EXTRA_SUBJECT,"subject");
            gmail.putExtra(Intent.EXTRA_STREAM,"attachment");
            if (gmail.resolveActivity(getPackageManager())!=null){
                startActivity(gmail);
            }
        }
        if(id==R.id.bluetooth){
            Toast.makeText(this,"Sharing with bluetooth, please wait!",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}