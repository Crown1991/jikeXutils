package com.jike.jikexutils.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jike.jikexutils.R;
import com.jike.jikexutils.domain.Child;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Administrator on 2016/7/8.
 */

public class ChildAdapter extends BaseAdapter {
    private List<Child> children;
    private LayoutInflater inflater;
    public ChildAdapter(Context context, List<Child> children) {
        this.children = children;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return children.size();
    }

    @Override
    public Object getItem(int i) {
        return children.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view = inflater.inflate(R.layout.child_item,null);
            viewHolder = new ViewHolder();
            x.view().inject(viewHolder,view);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        System.out.println(i);
        Child child = children.get(i);
        viewHolder.childName.setText(child.getName());
        return view;
    }

    class ViewHolder {
        @ViewInject(R.id.tv_child_name)
        TextView childName;
    }
}
