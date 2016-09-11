package sachonidas.myapplication;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityLibro extends AppCompatActivity {

    private ImageView imgManos, imgQuijote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_libro);

        imgQuijote = (ImageView)findViewById(R.id.imgQuijote);
        imgManos = (ImageView)findViewById(R.id.imgManos);

        imgQuijote.setImageResource(R.drawable.quijotedoble);
        imgManos.setImageResource(R.drawable.slide);

    }
    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
