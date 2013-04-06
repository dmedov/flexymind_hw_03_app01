package com.example.flexy_app01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void regBtnOnClick(View view) {
        Log.d("info", "reg_btn_pressed");
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void quitBtnOnClick(View view) {
        finish();
    }
}
