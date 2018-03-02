package com.example.tay.trabajofinalandroid.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.tay.trabajofinalandroid.R;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/**
 * Created by tay on 23/2/18.
 */

public class MainActivityEvents implements View.OnClickListener{

    private MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }


    @Override
    public void onClick(View view) {
       /* if (view.getId() == R.id.btnLogOut) {
            AuthUI.getInstance()
                    .signOut(mainActivity)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        public void onComplete(@NonNull Task<Void> task) {
                            // user is now signed out
                            //startActivity(new Intent(MainActivity, SignInActivity.class));
                            //finish();
                        }
                    });
        }
    */
    }
}
