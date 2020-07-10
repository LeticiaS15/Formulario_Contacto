package com.example.formulario_contacto;

import android.content.Intent;
import android.print.PageRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.app.DatePickerDialog;
import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private EditText EditNombre;
    private EditText EditTelefono;
    private EditText EditEmail;
    private EditText EditDescripcion;
    private EditText FechaNac;
    DatePickerDialog picker;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            EditNombre      =   (EditText) findViewById(R.id.EditNombre);
            EditTelefono    =   (EditText) findViewById(R.id.EditTelefono);
            EditEmail       =   (EditText) findViewById(R.id.EditEmail);
            EditDescripcion =   (EditText) findViewById(R.id.EditDescripcion);
            FechaNac  =    (EditText) findViewById(R.id.FechaNac);
            FechaNac.setOnClickListener((View.OnClickListener) this);


        }

    public void MostrarDatepicker(View view) {
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);


        DatePickerDialog  datePickerDialog= new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

                        FechaNac.setText(dayOfMonth+"/"+monthOfYear+" /"+year );

                    }
                }
                ,day,month,year);
        datePickerDialog.show();



    }


    public void MostrarDatos(View view) {

            Intent Intent= new Intent(MainActivity.this,MostrarDatos.class);

            Bundle Parametros =new Bundle();
            Parametros.putString("nombre",EditNombre.getText().toString());
            Parametros.putString("telefono",EditTelefono.getText().toString());
            Parametros.putString("Email",EditEmail.getText().toString());
            Parametros.putString("Desc",EditDescripcion.getText().toString());
            Parametros.putString("FechaNac",FechaNac.getText().toString());


            Intent.putExtras(Parametros);
            startActivity(Intent);



    }



}


