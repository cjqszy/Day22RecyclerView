package com.example.cln62.day22recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    List<MyDataClass> myDataList;

    public MyAdapter(List<MyDataClass> myDataList) {
        this.myDataList = myDataList;
    }

    //where to create view holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.single_itme_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    //where to bind the data with view holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        MyDataClass myDataClass = myDataList.get(position);
        viewHolder.textViewTitle.setText(myDataClass.getTitle());
        viewHolder.textViewSubtitle.setText(myDataClass.getSubtitle());
        viewHolder.textViewNote.setText(myDataClass.getNote());

    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewSubtitle, textViewNote;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewSubtitle = itemView.findViewById(R.id.textViewSubtitle);
            textViewNote = itemView.findViewById(R.id.textViewNote);

        }
    }

}
