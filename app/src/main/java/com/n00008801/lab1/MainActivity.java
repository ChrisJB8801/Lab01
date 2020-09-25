package com.n00008801.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextFragment textFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFragment = (TextFragment) getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        textFragment.updateTextView(getResources().getString(R.string.oncreate));
    }

    @Override
    protected void onStart() {
        super.onStart();
        textFragment.updateTextView(getResources().getString(R.string.onstart));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textFragment.updateTextView(getResources().getString(R.string.onrestart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        textFragment.updateTextView(getResources().getString(R.string.onresume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        textFragment.updateTextView(getResources().getString(R.string.onpause));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textFragment.updateTextView(getResources().getString(R.string.ondestroy));
    }

    @Override
    protected void onStop() {
        super.onStop();
        textFragment.updateTextView(getResources().getString(R.string.onstop));
    }
}