package com.n00008801.lab1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ListFragment extends Fragment {

    ListView listView;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), getResources().getString(R.string.oncreateview_list),Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.list_view);
        String[] array = getResources().getStringArray(R.array.listview_array);
        List<String> list = Arrays.asList(array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent aiactivity_intent = new Intent(getActivity(), AIActivity.class);
                    startActivity(aiactivity_intent);
                }
                if (i == 1) {
                    Intent vractivity_intent = new Intent(getActivity(), VRActivity.class);
                    startActivity(vractivity_intent);
                }
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), getResources().getString(R.string.onstart_list),Toast.LENGTH_SHORT).show();
    }

}