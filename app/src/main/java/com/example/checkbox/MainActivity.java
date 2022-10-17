package com.example.checkbox;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CheckBox.OnCheckedChangeListener{

    TextView textView;
    int numero=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        activateEvents();

    }

    public void activateEvents(){
        int ids [] = new Model().getCheckIds();
        for(int i=0;i<ids.length;i++){
            CheckBox cb = (CheckBox) findViewById(ids[i]);
            cb.setOnCheckedChangeListener(this);
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        textView= (TextView) findViewById(R.id.tv1);
        if(b){
            numero++;
        }
        else{
            if(numero!=0) {
                numero--;
            }
        }
            textView.setText("Número de deportes:"+numero);
    }


}
