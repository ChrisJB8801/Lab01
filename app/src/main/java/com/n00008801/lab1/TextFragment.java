package com.n00008801.lab1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TextFragment extends Fragment {

    private TextView tv;

    public TextFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        tv = (TextView) view.findViewById(R.id.txtView);
        updateTextView(getResources().getString(R.string.mainactivity));
        Toast.makeText(getContext(), getResources().getString(R.string.oncreateview_text),Toast.LENGTH_SHORT).show();

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), getResources().getString(R.string.onstart_text),Toast.LENGTH_SHORT).show();
    }

    public void updateTextView(String text) {
        tv.append(text + "\n");
    }
}