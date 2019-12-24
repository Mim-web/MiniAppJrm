package com.example.miniappjrm.ui.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniappjrm.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recycleview,parent,false);
        MyAdapter.ViewHolder holder = new MyAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return 5;
    }

    public interface MyAdapterItemClickListener {
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View constraint;
        public EditText editText1;
        public EditText editText2;
        public EditText editText3;
        public EditText editText4;
        public Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
constraint=itemView.findViewById(R.id.cons);
editText1=itemView.findViewById(R.id.Text1);
editText2=itemView.findViewById(R.id.Text2);
editText3=itemView.findViewById(R.id.Text3);
editText4=itemView.findViewById(R.id.Text4);
        }
    }
 }
