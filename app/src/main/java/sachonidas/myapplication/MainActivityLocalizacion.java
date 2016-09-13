package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivityLocalizacion extends AppCompatActivity {

    private ImageView imgAyuntamiento, imgEreta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_localizacion);

        imgAyuntamiento = (ImageView)findViewById(R.id.imgAyuntamiento);
        imgEreta = (ImageView)findViewById(R.id.imgEreta);

        imgAyuntamiento.setImageResource(R.drawable.hallazul);
        imgEreta.setImageResource(R.drawable.eretaweb);

        ImageButton btnVolver = (ImageButton) findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);


    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
