package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {
    private String[][] doctor_details1 = {
            {"Doctor Name: Bs.Thư", "Hospital Address: Quận 10", "Exp: 10 năm", "Mobile No: 09873637378", "600"},
            {"Doctor Name: Bs.Tùng", "Hospital Address: Quận 1", "Exp: 5 năm", "Mobile No: 09867637378", "900"},
            {"Doctor Name: Bs.Tú", "Hospital Address: Quận 9", "Exp: 3 năm", "Mobile No: 09873638778", "500"}
    };
    private String[][] doctor_details2 = {
            {"Doctor Name: Bs.Thư", "Hospital Address: Quận 10", "Exp: 10 năm", "Mobile No: 09873637378", "600"},
            {"Doctor Name: Bs.Tùng", "Hospital Address: Quận 1", "Exp: 5 năm", "Mobile No: 09867637378", "900"},
            {"Doctor Name: Bs.Tú", "Hospital Address: Quận 9", "Exp: 3 năm", "Mobile No: 09873638778", "500"}
    };
    private String[][] doctor_details3 = {
            {"Doctor Name: Bs.Thư", "Hospital Address: Quận 10", "Exp: 10 năm", "Mobile No: 09873637378", "600"},
            {"Doctor Name: Bs.Tùng", "Hospital Address: Quận 1", "Exp: 5 năm", "Mobile No: 09867637378", "900"},
            {"Doctor Name: Bs.Tú", "Hospital Address: Quận 9", "Exp: 3 năm", "Mobile No: 09873638778", "500"}
    };
    private String[][] doctor_details4 = {
            {"Doctor Name: Bs.Thư", "Hospital Address: Quận 10", "Exp: 10 năm", "Mobile No: 09873637378", "600"},
            {"Doctor Name: Bs.Tùng", "Hospital Address: Quận 1", "Exp: 5 năm", "Mobile No: 09867637378", "900"},
            {"Doctor Name: Bs.Tú", "Hospital Address: Quận 9", "Exp: 3 năm", "Mobile No: 09873638778", "500"}
    };
    private String[][] doctor_details5 = {
            {"Doctor Name: Bs.Thư", "Hospital Address: Quận 10", "Exp: 10 năm", "Mobile No: 09873637378", "600"},
            {"Doctor Name: Bs.Tùng", "Hospital Address: Quận 1", "Exp: 5 năm", "Mobile No: 09867637378", "900"},
            {"Doctor Name: Bs.Tú", "Hospital Address: Quận 9", "Exp: 3 năm", "Mobile No: 09873638778", "500"}
    };
    TextView tv;
    Button bt;
    String [][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        tv = findViewById(R.id.textViewDDTitle);
        bt = findViewById(R.id.buttonDDBack);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailActivity.this, FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for (int ii = 0; ii<doctor_details.length; ii++){
            item = new HashMap<String, String>();
            item.put("line1", doctor_details[ii][0]);
            item.put("line2", doctor_details[ii][1]);
            item.put("line3", "Cons Fees:" + doctor_details[ii][2] + "/-");
            list.add( item );
        }
        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String []{"line1", "line2", "line3", "line4", "line5"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e});

        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

    }
}