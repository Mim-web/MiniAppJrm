package com.example.miniappjrm.ui.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.miniappjrm.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.example.miniappjrm.R.id.recycleview;

public class RecycleView extends AppCompatActivity  implements View.OnClickListener,MyAdapter.MyAdapterItemClickListener {
 private RecycleView recycleView;
 List<String>strings;
 private EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
       // String arraylist= new ArrayList<>();



    }

    @Override
    public void onClick(View v) {

    }
}
