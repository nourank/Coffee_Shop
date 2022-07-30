package com.example.coffee_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static boolean login=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (login==true){
            ImageView usericon= findViewById(R.id.user_image);
            usericon.setImageResource(R.drawable.useri);
        }
    }
    public static boolean getlogin(){
        return login;
    }
    public static void setlogin(boolean status){
        login=status;
    }
}