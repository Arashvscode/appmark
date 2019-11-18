package com.vipapp.appmark2.menu;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmptyMenu extends DefaultMenu{

    @Override
    public ArrayList<?> list(Context context) {
        return new ArrayList<>();
    }

    @Override
    public void bind(RecyclerView.ViewHolder vh, Object item, int i) {

    }

    @Override
    public int size() {
        return 0;
    }
}
