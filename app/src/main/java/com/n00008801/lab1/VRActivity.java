package com.n00008801.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vractivity);
        tv = (TextView)findViewById(R.id.txtView_vractivity);
        updateTextView(getResources().getString(R.string.vractivity));
        updateTextView(getResources().getString(R.string.oncreate));
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateTextView(getResources().getString(R.string.onstart));
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateTextView(getResources().getString(R.string.onstop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateTextView(getResources().getString(R.string.ondestroy));
    }

    public void updateTextView(String text) {
        tv.append(text + "\n");
    }
}