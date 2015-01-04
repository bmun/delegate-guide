package com.parke.nathaniel.bmundelegate;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nathaniel on 12/31/14.
 */
public class NavDrawerAdapter extends BaseAdapter {

    ArrayList<NavDrawerItem> navDrawerItems;
    Context context;

    public NavDrawerAdapter (ArrayList<NavDrawerItem> items, Context context) {
        this.navDrawerItems = items;
        this.context = context;
    }

    public int getCount() {
        return this.navDrawerItems.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater =
                    (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.nav_drawer_item, null);
        }

        TextView title = (TextView) convertView.findViewById(R.id.title);

        title.setText(navDrawerItems.get(position).getTitle());
        return convertView;
    }

    public Object getItem (int position) {
        return this.navDrawerItems.get(position);
    }

    public long getItemId (int position) {
        return position;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEnabled(int position) {
        return true;
    }
}
