package com.example.fragment_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lxmisbest on 2017/5/21.
 */

public class Fragment_2 extends Fragment {
    TextView showMessage;
    View myView;
    String message;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView =  inflater.inflate(R.layout.fragment_2,container,false);
        showMessage = (TextView) myView.findViewById(R.id.textView2);
        if(getArguments()!=null){
            message = getArguments().getString("message");
            showMessage.setText(message);
        }
        return myView;
    }
    /**
     *    创建Fragment类型方法，以便调用者传递参数
     * */
    public static Fragment_2 newInstance(String message){
        Fragment_2 fragment_2 = new Fragment_2();
        Bundle args = new Bundle();
        args.putString("message",message);
        fragment_2.setArguments(args);
        return  fragment_2;
    }
}
