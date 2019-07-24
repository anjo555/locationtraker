package com.example.locationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth mAuth;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mAuth = FirebaseAuth.getInstance();

        if(mAuth.getCurrentUser()==null){
            finish();
            startActivity(new Intent(this,LoginActivity.class));
        }
        b1=(Button)findViewById(R.id.button3);


        b1.setOnClickListener(this);

    }
    @Override
        public void onClick(View view)
        {
            if(view == b1)
            {
                mAuth.signOut();
                finish();
                startActivity(new Intent(this,LoginActivity.class));
        }
    }
}
