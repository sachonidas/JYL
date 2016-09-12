package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivityAsistencia extends AppCompatActivity {

    private EditText etNombres, etMail, etComentarios;
    private ToggleButton tglBtnAceptar,tglBtnRechazar,tglBtn1,tglBtn2, tglBtn3,tglBtn4,tglBtn5;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_asistencia);

        etNombres = (EditText)findViewById(R.id.etNombres);
        String nombre = etNombres.getText().toString();
        etMail = (EditText)findViewById(R.id.etEmail);
        String email = etMail.getText().toString();
        etComentarios = (EditText)findViewById(R.id.etComentarios);
        String comentarios = etComentarios.getText().toString();

        tglBtn1 = (ToggleButton)findViewById(R.id.tglBtn1);
        tglBtn2 = (ToggleButton)findViewById(R.id.tglBtn2);
        tglBtn3 = (ToggleButton)findViewById(R.id.tglBtn3);
        tglBtn4 = (ToggleButton)findViewById(R.id.tglBtn4);
        tglBtnAceptar = (ToggleButton)findViewById(R.id.tglBtnAcpetar);
        tglBtnRechazar = (ToggleButton)findViewById(R.id.tglBtnRechazar);

        btnEnviar =(Button)findViewById(R.id.btnEnviar);

        ImageButton btnVolver = (ImageButton) findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);
    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
