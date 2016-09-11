package sachonidas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivityLibro extends AppCompatActivity {

    private ImageView imgManos, imgQuijote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_libro);

        imgManos = (ImageView)findViewById(R.id.imgManos);

        imgManos.setImageResource(R.drawable.slide);

    }
}
