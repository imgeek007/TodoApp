package com.geektech.todoapp.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.todoapp.R;

import java.util.ArrayList;

public class AdapterAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> names;
    AdapterAdapter adapter;

    public AdapterAdapter() {
        names = new ArrayList<>();
        names.add("Nursultan");
        names.add("Nurjamal");
        names.add("Aigerim");
        names.add("Pavel");
        names.add("Kubat");
        names.add("Kunduz");
        names.add("Aiyma");

//adapter.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public void addStudents() {

        notifyDataSetChanged();
    }
}
