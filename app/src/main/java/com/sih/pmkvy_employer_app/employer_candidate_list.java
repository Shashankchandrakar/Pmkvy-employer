package com.sih.pmkvy_employer_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sih.pmkvy_employer_app.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nidhi Singh on 3/22/2017.
 */

public class employer_candidate_list extends AppCompatActivity {
    List<student_details> s_d;
    RecyclerView candidate_list_rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employe_candidates);
        candidate_list_rv = (RecyclerView) findViewById(R.id.recyclerview_student_list);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        candidate_list_rv.setLayoutManager(llm);
        candidate_list_rv.setHasFixedSize(true);
        initializedata();
        initailizeadapter();
    }

    private void initializedata(){

        s_d = new ArrayList<>();
        // todo:from database to recycler view
        s_d.add(new student_details("nidhi","20","cg","balod","none"));
        s_d.add(new student_details("gauri","27","cg","durg","doctor"));
        s_d.add(new student_details("rajni","22","mp","jabalpur","none"));
        s_d.add(new student_details("rakesh","23","mp","sambalpur","none"));
    }
     private void initailizeadapter(){

         student_data_adapter s_a_d = new student_data_adapter(s_d);
         candidate_list_rv.setAdapter(s_a_d);
        s_a_d.notifyDataSetChanged();

     }
}
