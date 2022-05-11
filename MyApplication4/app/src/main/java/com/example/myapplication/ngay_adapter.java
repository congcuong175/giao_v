package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ngay_adapter extends RecyclerView.Adapter<ngay_adapter.ngay_viewHodler> {
    List<String> list;

    public ngay_adapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ngay_viewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ngay,parent,false);
        return new ngay_viewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ngay_viewHodler holder, int position) {
        String s=list.get(position);
        holder.txt_stt.setText(s);


    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return  list.size();
        }
        return 0;
    }

    public class ngay_viewHodler extends RecyclerView.ViewHolder {
        TextView txt_stt;
        public ngay_viewHodler(@NonNull View itemView) {
            super(itemView);
            txt_stt=itemView.findViewById(R.id.ngay);

        }
    }
}
