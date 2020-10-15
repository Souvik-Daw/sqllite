package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button submit;
    String s="";
    EditText e,e1,e2;
    TextView t,t1,t2;
    Button display;
    SqlCall sql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        e=findViewById(R.id.e1);
        e1=findViewById(R.id.editemail);
        e2=findViewById(R.id.editcourse);
        t=findViewById(R.id.name2);
        t1=findViewById(R.id.email2);
        t2=findViewById(R.id.course2);
        submit=(Button)findViewById(R.id.btn2);
        display=findViewById(R.id.btn1);

        sql=new SqlCall(MainActivity.this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* t.setText(e.getText().toString());
                t1.setText(e1.getText().toString());
                t2.setText(e2.getText().toString());
*/
                student std=new student(e.getText().toString(),e1.getText().toString(),e2.getText().toString());
                long data=sql.addStudent(std);
                if(data>0)
                {
                    Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
            }
        });


    }
}