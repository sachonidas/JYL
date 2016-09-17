package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivityAsistencia extends AppCompatActivity {

    private EditText etNombres, etMail, etComentarios;
    private Button btnEnviar;
    String[] TO = {"lsachaabazan@gmail.com"};
    Spinner sp1, sp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_asistencia);

        btnEnviar =(Button)findViewById(R.id.btnEnviar);

        ImageButton btnVolver = (ImageButton) findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);


        sp1 = (Spinner)findViewById(R.id.sp1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.asistereis_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);

        sp2 = (Spinner)findViewById(R.id.sp2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.asistentes_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter2);
    }

    public void envioFormulario(View view){

        etNombres = (EditText)findViewById(R.id.etNombres);
        String nombre = etNombres.getText().toString();
        etMail = (EditText)findViewById(R.id.etEmail);
        String email = etMail.getText().toString();
        etComentarios = (EditText)findViewById(R.id.etComentarios);
        String comentarios = etComentarios.getText().toString();

        String boton1 = "";
        String boton2 = "";
        String boton3 = "";
        String boton4 = "";
        String boton5 = "";

        String botonAceptar = "";
        String botonRechazar = "";

        String select1 = sp1.getSelectedItem().toString();
        String select2 = sp2.getSelectedItem().toString();

        if (select1 == "ACEPTAMOS ENCANTADOS"){
            botonAceptar = "ACEPTAMOS ENCANTADOS";
            Log.e("Leo", botonAceptar);
        }else if (select1 == "RECHAZAMOS CON PESAR"){
            botonAceptar = "RECHAZAMOS CON PESAR";
            Log.e("Leo", botonRechazar);
        }


        if (select2 == "1"){
            boton1 = "1";
            Log.e("Leo", boton1);
        }else if (select2 == "2"){
            boton1 = "2";
            Log.e("Leo", boton2);
        }else if (select2 == "3"){
            boton1 = "3";
            Log.e("Leo", boton3);
        }else if (select2 == "4"){
            boton1 = "4";
            Log.e("Leo", boton4);
        }else if (select2 == "5"){
            boton1 = "5";
            Log.e("Leo", boton2);
        }



        Intent itSend = new Intent(Intent.ACTION_SEND);
        itSend.setType("text/html");
        itSend.putExtra(Intent.EXTRA_EMAIL, TO);
        itSend.putExtra(Intent.EXTRA_CC, email);
        itSend.putExtra(Intent.EXTRA_SUBJECT, nombre);

        String textoEmail = "Respuesta: "+select1+"\n Asistentes: "+select2+"\n Comentario: "+comentarios ;

                itSend.putExtra(Intent.EXTRA_TEXT, textoEmail);
        try {
            startActivity(itSend);
            finish();
            Log.e("Finished" , "seing email...");
            Toast.makeText(MainActivityAsistencia.this,
                    "Confirmacion enviada! Nos vemos en la boda!!", Toast.LENGTH_SHORT).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivityAsistencia.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
        //startActivity(itSend);
    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
