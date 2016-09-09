package com.codekul.compoundviews;

import android.content.Context;
import android.view.LayoutInflater;

/**
 * Created by aniruddha on 9/9/16.
 */
public class MyTool {

    private Context context;

    public MyTool(Context context){
        this.context = context;
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
