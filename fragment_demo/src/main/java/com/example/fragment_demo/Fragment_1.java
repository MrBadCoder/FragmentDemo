package com.example.fragment_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lxmisbest on 2017/5/21.
 */

public class Fragment_1 extends Fragment{
    Button btn;
    TextView textView;
    EditText editText;
    String content;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Fragment1_View = inflater.inflate(R.layout.fragment_1,container,false);
        return Fragment1_View;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn = (Button) getView().findViewById(R.id.button3);
        editText = (EditText) getView().findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content = editText.getText().toString();
                Fragment_2 fragment_2 = Fragment_2.newInstance(content);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_2);
                fragmentTransaction.commit();
            }
        });
    }
    public static void sendMessage(String message,callBack call){
        call.getContent(message);
    }


}
