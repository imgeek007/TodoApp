package com.geektech.todoapp.ui.gallery;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.todoapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.vh_text_view);
    }
}
