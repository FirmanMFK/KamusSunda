package com.firman.kamussunda.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.firman.kamussunda.R;
import com.firman.kamussunda.model.KamusModel;

import java.util.ArrayList;

/**
 * Created by Firmanz on 8/31/2016.
 */
public class ListKataAdapter extends BaseAdapter {

    Context context;
    ArrayList<KamusModel> listKamus;
    int count;

    public ListKataAdapter(Context context, ArrayList<KamusModel> listKamus) {
        //TODO Auto-generated constructor stub
        this.listKamus = listKamus;
        this.context = context;
        this.count = listKamus.size();
    }

    public int getCount() {
        //TODO Auto-generated method stub
        return count;
    }

    public Object getItem(int arg0) {
        //TODO Auto-generated method stub
        return 0;
    }

    public long getItemId(int arg0) {
        //TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //TODO Auto genereated method stub
        ViewHolder holder = null;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_list_kata, null);
            holder.txtKata = (TextView)convertView.findViewById(R.id.txtItemKata);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.txtKata.setText(listKamus.get(position).getKata());

        return convertView;
    }

    static class ViewHolder{
        TextView txtKata;
    }
}
