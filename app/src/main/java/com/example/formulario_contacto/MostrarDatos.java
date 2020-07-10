package com.example.formulario_contacto;

import android.app.DatePickerDialog;
import android.renderscript.Int2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MostrarDatos extends AppCompatActivity {

private TextView NombreLLegada;
private TextView TelefonoLLegada;
private TextView EmailLLegada;
private TextView DescripcionLLegada;
private TextView FechaLLegada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        NombreLLegada=(TextView) findViewById(R.id.TextNombreLLegada);
        TelefonoLLegada=(TextView) findViewById(R.id.TextTelefonoLlegada);
        EmailLLegada =(TextView) findViewById(R.id.TextEmailLlegada);
       DescripcionLLegada=(TextView)findViewById(R.id.TextDescLlegada);
       FechaLLegada= (TextView) findViewById(R.id.FechaLLegada);
        Bundle Parametros= this.getIntent().getExtras();


            String nombre=Parametros.getString("nombre");
            String NombreLLegada_string=getString(R.string.nombre);
            NombreLLegada.setText(NombreLLegada_string +" " + nombre);

            String telefono=Parametros.getString("telefono");
            String TelefonoLLegada_string=getString(R.string.telefono);
            TelefonoLLegada.setText(TelefonoLLegada_string + " " + telefono);

        String Email=Parametros.getString("Email");
        String EmailLLegada_string=getString(R.string.Email);
        EmailLLegada.setText(EmailLLegada_string + " " + Email);


        String Desc=Parametros.getString("Desc");
        String DescripcionLLegada_string=getString(R.string.Desc);
        DescripcionLLegada.setText(DescripcionLLegada_string + " " + Desc);

        String FechaNac=Parametros.getString("FechaNac");
        String FechaLLegada_string=getString(R.string.FechaNac);
        FechaLLegada.setText(FechaLLegada_string+" "+FechaNac);





      //  }

    }


    public void onClick(View view) {
        finish();

    }
}