package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class danh_sach_sv_Adapter extends RecyclerView.Adapter<danh_sach_sv_Adapter.danh_sach_sv_viewHodler> {
    List<sinhvien>sinhviens;
    check_adapter check_adapter;
    Context context;

    public danh_sach_sv_Adapter(List<sinhvien> sinhviens, com.example.myapplication.check_adapter check_adapter, Context context) {
        this.sinhviens = sinhviens;
        this.check_adapter = check_adapter;
        this.context = context;
    }

    @NonNull
    @Override
    public danh_sach_sv_viewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sv,parent,false);
        return new danh_sach_sv_viewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull danh_sach_sv_viewHodler holder, int position) {
        sinhvien lich_hoc=sinhviens.get(position);
        holder.txt_stt.setText(position+1+"");
        holder.txt_masv.setText(lich_hoc.getMasv());
        holder.txt_email.setText(lich_hoc.getEmail());
        holder.txt_sdt.setText(lich_hoc.getSdt());
        holder.txt_ten.setText(lich_hoc.getTensv());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        holder.item2.setLayoutManager(linearLayoutManager);
        holder.item2.setAdapter(check_adapter);

    }

    @Override
    public int getItemCount() {
        if (sinhviens!=null){
            return sinhviens.size();
        }
        return 0;
    }

    public class danh_sach_sv_viewHodler extends RecyclerView.ViewHolder {
        TextView txt_stt,txt_masv,txt_email,txt_sdt,txt_ten;
        RecyclerView item2;
        public danh_sach_sv_viewHodler(@NonNull View itemView) {
            super(itemView);
            txt_stt=itemView.findViewById(R.id.txt_stt);
            txt_masv=itemView.findViewById(R.id.txt_masv);
            txt_email=itemView.findViewById(R.id.txt_email);
            txt_sdt=itemView.findViewById(R.id.txt_sdt);
            txt_ten=itemView.findViewById(R.id.txt_ten);
            item2=itemView.findViewById(R.id.item2);
        }
    }
}
