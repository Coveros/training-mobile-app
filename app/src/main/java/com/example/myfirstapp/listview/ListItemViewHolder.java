package com.example.myfirstapp.listview;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapp.R;

public class ListItemViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    private ListDataModel data;

    public ListItemViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.elementTitle);
        Button b = itemView.findViewById(R.id.list_item_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Details")
                        .setMessage(data.getDetails())
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        }).create().show();
            }
        });
    }

    public void bindData (ListDataModel data) {
        this.data = data;

        textView.setText(data.getName());
    }

    public void setItemColor (int color) {
        this.itemView.setBackgroundColor(color);

    }
}
