package com.example.vam1994.speedbytedemo;

/**
 * Created by tillu on 4/18/2017.
 */

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * The type Login activity.
 */
public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;

    /**
     * The Email text.
     */
    @Bind(R.id.input_email) EditText emailText;
    /**
     * The Password text.
     */
    @Bind(R.id.input_password) EditText passwordText;
    /**
     * The Login button.
     */
    @Bind(R.id.btn_login) Button loginButton;
    /**
     * The Signup link.
     */
    @Bind(R.id.link_signup) TextView signupLink;

    /**
     * Allow user to login
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                login();
            }
        });

        signupLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
    }

    /**
     * Login.
     */
    public void login(){
        Log.d(TAG, "MainScreen");

        if(!passwordChecked()){
            onLoginFailed();
            return;
        }

        loginButton.setEnabled(false); //find me1 sss

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);//this is cool
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating User...");
        progressDialog.show();

        String mailId = emailText.getText().toString();
        String pass = passwordText.getText().toString();

        //ADD AUTHENTICATION LOGIC HERE//
        //CHECK USERS AGAINST DATABASE//

        new android.os.Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        onLoginSuccess();
                        progressDialog.dismiss();
                    }
                }, 3000
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_SIGNUP) {
            if (resultCode == RESULT_OK) {
                // By default we just finish the Activity and log them in automatically
                this.finish();
            }
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /**
     * If login success, go to main screen
     */
    public void onLoginSuccess() {
        loginButton.setEnabled(true);
        Intent intent = new Intent(LoginActivity.this, MainScreen.class);
        startActivity(intent);
    }

    /**
     * If login failed.
     */
    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed!", Toast.LENGTH_LONG).show();

        loginButton.setEnabled(true);
    }

    /**
     * Check user password
     *
     * @return whether or not password check was successful
     */
    public boolean passwordChecked(){
        boolean isValid = true;

        String mailId = emailText.getText().toString();
        String pass = passwordText.getText().toString();

        if(mailId.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mailId).matches()){
            emailText.setError("please enter a valid email address");
            isValid = false;
        }

        else{
            emailText.setError(null);
        }

        if(pass.isEmpty() || pass.length() < 8 || pass.length() > 12){
            passwordText.setError("password must be between 5 and 10 alphanumeric characters");
            isValid = false;
        }

        else{
            passwordText.setError(null);
        }

        return isValid;
    }

}