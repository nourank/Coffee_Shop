package com.example.coffee_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    private TextInputLayout inputusername;
    private TextInputLayout inputpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inputusername= findViewById(R.id.username);
        inputpassword= findViewById(R.id.password);
    }
   private boolean validateuser(){
        String userin= inputusername.getEditText().getText().toString();
        if(userin.isEmpty()){
            inputusername.setError("Field cannot be empty");
            return false;
        }
        else if(userin.equals("user1")){
            inputusername.setError(null);
            return true;
        }
        else{
            inputusername.setError("incorrect username");
            return false;
        }

   }

    private boolean validatepassword(){
        String passin= inputpassword.getEditText().getText().toString();
        if(passin.isEmpty()){
            inputpassword.setError("Field cannot be empty");
            return false;
        }
        else if(passin.equals("password1")){
            inputpassword.setError(null);
            return true;
        }
        else{
            inputpassword.setError("incorrect username");
            return false;
        }

    }

    public void validation (View login){
        inputusername= findViewById(R.id.username);
        inputpassword= findViewById(R.id.password);
        if (!validateuser() | !validatepassword()){
            return;
        }
        else {
            MainActivity.setlogin(true);
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }

    }
    public void skipvalidation (View skip){
        MainActivity.setlogin(true);
        Intent main= new Intent(this, MainActivity.class);
        startActivity(main);


    }
}