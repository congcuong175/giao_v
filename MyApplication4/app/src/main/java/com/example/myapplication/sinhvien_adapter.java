package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class sinhvien_adapter extends RecyclerView.Adapter<sinhvien_adapter.sinhvien_viewHodler> {
    List<sinhvien> sinhviens;

    public sinhvien_adapter(List<sinhvien> sinhviens) {
        this.sinhviens = sinhviens;
    }

    @NonNull
    @Override
    public sinhvien_viewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dd,parent,false);
        return new sinhvien_viewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sinhvien_viewHodler holder, int position) {

        sinhvien lich_hoc=sinhviens.get(position);
        holder.txt_stt.setText(position+1+"");
        holder.txt_masv.setText(lich_hoc.getMasv());
        holder.txt_ten.setText(lich_hoc.getTensv());
        holder.checkBox.setChecked(lich_hoc.isCheck());

    }

    @Override
    public int getItemCount() {
        if (sinhviens!=null){
            return  sinhviens.size();
        }
        return 0;
    }

    public class sinhvien_viewHodler extends RecyclerView.ViewHolder {
        TextView txt_stt,txt_masv,txt_ten;
        CheckBox checkBox;
        public sinhvien_viewHodler(@NonNull View itemView) {
            super(itemView);
            txt_stt=itemView.findViewById(R.id.txt_stt);
            txt_masv=itemView.findViewById(R.id.txt_masv);
            txt_ten=itemView.findViewById(R.id.txt_ten);
            checkBox=itemView.findViewById(R.id.checkBox);
        }
    }
}
