package com.example.mybundle;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VioletFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_violet, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.sendBtn);
        EditText editText1 = view.findViewById(R.id.edit1);
        EditText editText2 = view.findViewById(R.id.edit2);
        EditText editText3 = view.findViewById(R.id.edit3);
        EditText editText4 = view.findViewById(R.id.edit4);
        EditText editText5 = view.findViewById(R.id.edit5);
        TextView textView = view.findViewById(R.id.textView);
        Bundle bundle = new Bundle();
        YellowFragment yellowFragment = new YellowFragment();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container, yellowFragment);
                ft.addToBackStack(null);
                ft.commit();
                yellowFragment.setArguments(bundle);
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();
                String text3 = editText3.getText().toString();
                String text4 = editText4.getText().toString();
                String text5 = editText5.getText().toString();
                bundle.putString("text1", text1);
                bundle.putString("text2", text2);
                bundle.putString("text3", text3);
                bundle.putString("text4", text4);
                bundle.putString("text5", text5);
                //Log.d("FFF", text2.toString());
            }
        });
    }
}