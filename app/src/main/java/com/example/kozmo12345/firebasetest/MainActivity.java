package com.example.kozmo12345.firebasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.auth.api.signin.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonHandler();
    }

    private void setButtonHandler(){

        findViewById(R.id.LogOutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                signOut();
            }
        });
    }

    private void signOut() {

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(account != null){
            LoginActivity.mGoogleSignInClient.signOut();
        }

    }
}
