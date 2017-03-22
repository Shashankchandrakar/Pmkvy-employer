package com.sih.pmkvy_employer_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(Button)findViewById(R.id.rv);
        rv.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent rec=new Intent(this,employer_candidate_list.class);
        startActivity(rec);
    }
}
