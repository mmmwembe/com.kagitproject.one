package com.example.com.kagitproject.one;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloGitHub extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_git_hub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hello_git_hub, menu);
        return true;
    }
}
