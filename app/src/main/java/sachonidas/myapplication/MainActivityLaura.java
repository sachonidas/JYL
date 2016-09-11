package sachonidas.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivityLaura extends AppCompatActivity {

    private ImageView imgLaura,imgFinal;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_laura);

        imgLaura = (ImageView)findViewById(R.id.imgLaura);
        imgFinal = (ImageView)findViewById(R.id.imgFinal);

        imgLaura.setImageResource(R.drawable.lauraactivity);
        imgFinal.setImageResource(R.drawable.laurafinal);

        btnVolver = (ImageButton)findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);



    }
    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
