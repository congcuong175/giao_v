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

public class lich_hoc_Adapter extends RecyclerView.Adapter<lich_hoc_Adapter.lich_hoc_viewHodler> {
    List<lich_hoc>lich_hocs;
    Fragment fragment;

    public lich_hoc_Adapter(List<lich_hoc> lich_hocs, Fragment fragment) {
        this.lich_hocs = lich_hocs;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public lich_hoc_viewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lich_hoc,parent,false);
        return new lich_hoc_viewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull lich_hoc_viewHodler holder, int position) {
        lich_hoc lich_hoc=lich_hocs.get(position);
        holder.tv_mahp_diemhoc.setText(lich_hoc.getLop());
        holder.tv_tenhp_diemhoc.setText(lich_hoc.getMon());
        holder.tv_tinchi_diemhoc.setText(lich_hoc.getTiet());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_trang_chu_to_diem_danh);
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

    public class lich_hoc_viewHodler extends RecyclerView.ViewHolder {
        TextView tv_mahp_diemhoc,tv_tenhp_diemhoc,tv_tinchi_diemhoc;
        LinearLayout layout;
        public lich_hoc_viewHodler(@NonNull View itemView) {
            super(itemView);
            tv_tinchi_diemhoc=itemView.findViewById(R.id.tv_tinchi_diemhoc);
            tv_tenhp_diemhoc=itemView.findViewById(R.id.tv_tenhp_diemhoc);
            tv_mahp_diemhoc=itemView.findViewById(R.id.tv_mahp_diemhoc);
            layout=itemView.findViewById(R.id.layout);
        }
    }
}
