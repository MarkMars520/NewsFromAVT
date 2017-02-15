package com.wanj.administrator.newsfromavt;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/2/15 0015.
 */

public class LeftFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.left_fragment,container,false);
        return view;
    }
}
