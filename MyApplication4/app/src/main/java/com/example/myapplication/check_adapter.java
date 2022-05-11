package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class check_adapter extends RecyclerView.Adapter<check_adapter.check_viewHodler> {
    List<Boolean> list;

    public check_adapter(List<Boolean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public check_viewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_check,parent,false);
        return new check_viewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull check_viewHodler holder, int position) {
        Boolean s=list.get(position);
        holder.txt_stt.setChecked(s);


    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return  list.size();
        }
        return 0;
    }

    public class check_viewHodler extends RecyclerView.ViewHolder {
        CheckBox txt_stt;
        public check_viewHodler(@NonNull View itemView) {
            super(itemView);
            txt_stt=itemView.findViewById(R.id.checkBox);

        }


    }
}
