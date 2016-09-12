package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivityGaleria extends AppCompatActivity {


    private ImageView imgV,imgV2,imgV3,imgV4,imgV5,imgV6,imgV7,imgV8,imgV9,imgV10,imgV11,imgV12,imgV13,imgV14,imgV15;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_galeria);

        imgV = (ImageView)findViewById(R.id.imageView);
        imgV2 = (ImageView)findViewById(R.id.imageView2);
        imgV3 = (ImageView)findViewById(R.id.imageView3);
        imgV4 = (ImageView)findViewById(R.id.imageView4);
        imgV5 = (ImageView)findViewById(R.id.imageView5);
        imgV6 = (ImageView)findViewById(R.id.imageView6);
        imgV7 = (ImageView)findViewById(R.id.imageView7);
        imgV8 = (ImageView)findViewById(R.id.imageView8);
        imgV9 = (ImageView)findViewById(R.id.imageView9);
        imgV10 = (ImageView)findViewById(R.id.imageView10);
        imgV11 = (ImageView)findViewById(R.id.imageView11);
        imgV12 = (ImageView)findViewById(R.id.imageView12);
        imgV13 = (ImageView)findViewById(R.id.imageView13);
        imgV14 = (ImageView)findViewById(R.id.imageView14);
        imgV15 = (ImageView)findViewById(R.id.imageView15);

        imgV.setImageResource(R.drawable.galeria1);
        imgV2.setImageResource(R.drawable.galeria2);
        imgV3.setImageResource(R.drawable.galeria3);
        imgV4.setImageResource(R.drawable.galeria4);
        imgV5.setImageResource(R.drawable.galeria5);
        imgV6.setImageResource(R.drawable.galeria6);
        imgV7.setImageResource(R.drawable.galeria7);
        /*imgV8.setImageResource(R.drawable.galeria8);
        imgV9.setImageResource(R.drawable.galeria9);
        imgV10.setImageResource(R.drawable.galeria10);
        imgV11.setImageResource(R.drawable.galeria11);
        imgV12.setImageResource(R.drawable.galeria12);
        imgV13.setImageResource(R.drawable.galeria13);
        imgV14.setImageResource(R.drawable.galeria14);
        imgV15.setImageResource(R.drawable.galeria15);*/

        btnVolver = (ImageButton)findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);
    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
