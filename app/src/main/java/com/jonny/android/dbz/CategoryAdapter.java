package com.jonny.android.dbz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<String> {
    ArrayList<Integer> images;
    ArrayList<String> names;

    public CategoryAdapter(Context context, ArrayList<String> names, ArrayList<Integer> images) {
        super(context, 0, names);
        this.images = images;
        this.names = names;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        ImageView categoryImageView = convertView.findViewById(R.id.item_image_view);
        categoryImageView.setImageResource(images.get(position));
        TextView categoryTextView = convertView.findViewById(R.id.item_text_view);
        categoryTextView.setText(names.get(position));

        return convertView;
    }
}
