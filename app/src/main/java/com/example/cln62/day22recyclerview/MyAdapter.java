package com.example.cln62.day22recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<MyDataClass> myDataList;

    public MyAdapter(List<MyDataClass> myDataList) {
        this.myDataList = myDataList;
    }

    @Override
    public int getItemViewType(int position) {
        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        return position % 2 * 2;
    }

    //where to create view holder
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = null;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.single_itme_layout, viewGroup, false);
                return new ViewHolder(view);
            case 2:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.single_itme_layout2, viewGroup, false);
                return new ViewHolder2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case 0:
                ViewHolder vh = (ViewHolder) viewHolder;
                MyDataClass myDataClass = myDataList.get(position);
                vh.textViewTitle.setText(myDataClass.getTitle());
                vh.textViewSubtitle.setText(myDataClass.getSubtitle());
                vh.textViewNote.setText(myDataClass.getNote());
                break;

            case 2:
                ViewHolder2 vh2 = (ViewHolder2) viewHolder;
                MyDataClass myDataClass2 = myDataList.get(position);
                vh2.textViewTitle.setText(myDataClass2.getTitle());
                break;
        }
    }

    //where to bind the data with view holder
/*    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case 0:
                MyDataClass myDataClass = myDataList.get(position);
                viewHolder.textViewTitle.setText(myDataClass.getTitle());
                viewHolder.textViewSubtitle.setText(myDataClass.getSubtitle());
                viewHolder.textViewNote.setText(myDataClass.getNote());
                break;

            case 2:
                MyDataClass myDataClass2 = myDataList.get(position);
                viewHolder.textViewTitle.setText(myDataClass2.getTitle());
                break;
        }
    }*/

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

    public class ViewHolder2 extends RecyclerView.ViewHolder{
        TextView textViewTitle;

        public ViewHolder2(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle2);
        }
    }

}
