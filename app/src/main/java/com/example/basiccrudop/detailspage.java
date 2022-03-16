package com.example.basiccrudop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class detailspage extends AppCompatActivity {

    TextView nameview;
    TextView mailview;
    TextView numview;
    Button btnforcontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailspage);

        btnforcontext = (Button) findViewById(R.id.btnforcontextm);
        registerForContextMenu(btnforcontext);

        nameview = (TextView) findViewById(R.id.acceptname);
        mailview = (TextView) findViewById(R.id.acceptmail);
        numview = (TextView) findViewById(R.id.acceptnum);

        Intent showdetails = getIntent();
        String showsname = showdetails.getStringExtra("namemsg");
        nameview.setText(showsname);
        String showsmail = showdetails.getStringExtra("mailmsg");
        mailview.setText(showsmail);
        String showsnum = showdetails.getStringExtra("nummsg");
        numview.setText(showsnum);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.backmenu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.backitem){
            Intent backpage = new Intent(this, signup.class);
            startActivity(backpage);
        }
        if (id==R.id.logoutitem){
            Intent backpage = new Intent(this, MainActivity.class);
            startActivity(backpage);
            finish();
        }
        return super.onContextItemSelected(item);
    }
}
