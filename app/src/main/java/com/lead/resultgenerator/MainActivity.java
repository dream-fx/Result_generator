package com.lead.resultgenerator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lead.resultgenerator.computation.Generator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName,etAnd,etIpc,etWeb;
    Button btnGen;
    TextView tvApp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etAnd=findViewById(R.id.etAnd);
        etIpc=findViewById(R.id.etIpc);
        etWeb=findViewById(R.id.etWeb);
        btnGen=findViewById(R.id.btnGen);
        tvApp=findViewById(R.id.tvApp);


        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genMarks();
            }
        });



    }

    private void genMarks() {
        //tvApp.append(name+android+ipc+web+"\n");
        tvApp.append("Name "+etName.getText().toString()+" "+
                "Android "+Integer.parseInt(etAnd.getText().toString())+" "+
                "IPC "+Integer.parseInt(etIpc.getText().toString())+" "+
                "Web Api "+Integer.parseInt(etWeb.getText().toString())+"\n");
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etName.getText().toString())){
            etName.setError("Enter Name");
            return;
        }
        else if(TextUtils.isEmpty(etAnd.getText().toString())){
            etAnd.setError("Enter Android Marks");
            return;
        }
        else if(TextUtils.isEmpty(etIpc.getText().toString())){
            etIpc.setError("Enter IPC Marks");
            return;
        }
        else if(TextUtils.isEmpty(etWeb.getText().toString())) {
            etWeb.setError("Enter Web Api Marks");
            return;
        }

        int android,ipc,web;
        //int tmarks;
        String name;
        name=etName.getText().toString();
        android=Integer.parseInt(etAnd.getText().toString());
        ipc=Integer.parseInt(etIpc.getText().toString());
        web=Integer.parseInt(etWeb.getText().toString());

        Generator generator=new Generator(name,android,ipc,web);
       // tmarks=generator.totalMarks();

    }



}
