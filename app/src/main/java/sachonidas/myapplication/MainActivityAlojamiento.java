package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.regex.Pattern;

public class MainActivityAlojamiento extends AppCompatActivity {

    private ImageView imgMaya, imgLucentum, imgTurismo;
    private TextView hotelMaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_alojamiento);

        hotelMaya = (TextView)findViewById(R.id.textView27);

        imgMaya = (ImageView)findViewById(R.id.imgMaya);
        imgLucentum = (ImageView)findViewById(R.id.imgLucentum);
        imgTurismo = (ImageView)findViewById(R.id.imgTurismo);

        imgMaya.setImageResource(R.drawable.hotelmaya);
        imgLucentum.setImageResource(R.drawable.eurostarlucentum);
        imgTurismo.setImageResource(R.drawable.turismoalicante);

        ImageButton btnVolver = (ImageButton) findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);

        Pattern pattern = Pattern.compile("www.hotelalicantemaya.com/");
        Linkify.addLinks(hotelMaya, pattern, "http://");
        //Linkify.addLinks(hotelMaya, "http://www.hotelalicantemaya.com/");

    }

    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
