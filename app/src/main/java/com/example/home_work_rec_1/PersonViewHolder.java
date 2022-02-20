package com.example.home_work_rec_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView person;
    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        person=itemView.findViewById(R.id.item_text);
    }

    public void bind(String s) {
        person.setText(s);
    }
}
