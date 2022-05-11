package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class lop_hoc_Adapter extends RecyclerView.Adapter<lop_hoc_Adapter.lop_hoc_viewHolder> {
    List<lop_hoc> lich_hocs;
    Fragment fragment;

    public lop_hoc_Adapter(List<lop_hoc> lich_hocs, Fragment fragment) {
        this.lich_hocs = lich_hocs;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public lop_hoc_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lop_hoc,parent,false);
        return new lop_hoc_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull lop_hoc_viewHolder holder, int position) {
        lop_hoc lich_hoc=lich_hocs.get(position);
        holder.tv_mahp_diemhoc.setText(lich_hoc.getLop());
        holder.tv_tenhp_diemhoc.setText(lich_hoc.getKhoa());
        holder.tv_tinchi_diemhoc.setText(lich_hoc.getNam());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_quan_ly_lophoc_to_danh_sach_sv);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (lich_hocs!=null){
            return  lich_hocs.size();
        }
        return 0;
    }

    public class lop_hoc_viewHolder extends RecyclerView.ViewHolder {
        TextView tv_mahp_diemhoc,tv_tenhp_diemhoc,tv_tinchi_diemhoc;
        LinearLayout layout;
        public lop_hoc_viewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tinchi_diemhoc=itemView.findViewById(R.id.tv_tinchi_diemhoc);
            tv_tenhp_diemhoc=itemView.findViewById(R.id.tv_tenhp_diemhoc);
            tv_mahp_diemhoc=itemView.findViewById(R.id.tv_mahp_diemhoc);
            layout=itemView.findViewById(R.id.layout);
        }
    }
}
