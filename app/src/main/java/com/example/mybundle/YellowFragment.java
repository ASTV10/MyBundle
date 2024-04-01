package com.example.mybundle;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class YellowFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yellow, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        TextView textView1 = view.findViewById(R.id.TextView1);
        TextView textView2 = view.findViewById(R.id.TextView2);
        TextView textView3 = view.findViewById(R.id.TextView3);
        TextView textView4 = view.findViewById(R.id.TextView4);
        TextView textView5 = view.findViewById(R.id.TextView5);
        Button btn = view.findViewById(R.id.backBtn);
        if (bundle != null) {
            String gettingText1 = bundle.getString("text1");
            textView1.setText(gettingText1);
            String gettingText2 = bundle.getString("text2");
            textView2.setText(gettingText2);
            String gettingText3 = bundle.getString("text3");
            textView3.setText(gettingText3);
            String gettingText4 = bundle.getString("text4");
            textView4.setText(gettingText4);
            String gettingText5 = bundle.getString("text5");
            textView5.setText(gettingText5);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
    }
}