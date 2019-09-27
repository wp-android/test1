package com.example.wp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private Context mcontext;
    private String[] data;
    public MyAdapter(Context mcontext,String[] data){
        this.mcontext=mcontext;
        this.data=data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        View view1=inflater.inflate(R.layout.layout1,null);
        TextView textView=(TextView) view1.findViewById(R.id.text1);
        ImageView imageView=(ImageView) view1.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.t41);
        textView.setText(data[i]);
        return view1;
    }
}
