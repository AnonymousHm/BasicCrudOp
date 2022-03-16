package com.example.basiccrudop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    EditText forname;
    EditText formail;
    EditText fornumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        forname= (EditText) findViewById(R.id.nameinput);
        formail= (EditText) findViewById(R.id.mailinput);
        fornumber= (EditText) findViewById(R.id.numinput);

    }

    public void btnlogin(View view) {
        Intent detailspage = new Intent(this,detailspage.class);
        String namestr = forname.getText().toString();
        detailspage.putExtra("namemsg", namestr);
        String mailstr = formail.getText().toString();
        detailspage.putExtra("mailmsg", mailstr);
        String numstr = fornumber.getText().toString();
        detailspage.putExtra("nummsg", numstr);
        startActivity(detailspage);

    }
}
