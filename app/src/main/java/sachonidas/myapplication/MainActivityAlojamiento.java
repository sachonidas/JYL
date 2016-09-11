package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityAlojamiento extends AppCompatActivity {

    private ImageView imgMaya, imgLucentum, imgTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_alojamiento);

        imgMaya = (ImageView)findViewById(R.id.imgMaya);
        imgLucentum = (ImageView)findViewById(R.id.imgLucentum);
        imgTurismo = (ImageView)findViewById(R.id.imgTurismo);

        imgMaya.setImageResource(R.drawable.hotelmaya);
        imgLucentum.setImageResource(R.drawable.eurostarlucentum);
        imgTurismo.setImageResource(R.drawable.turismoalicante);
    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}