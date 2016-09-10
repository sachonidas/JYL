package sachonidas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivityJuan extends AppCompatActivity {

    private ImageView imgJuan;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_juan);

        imgJuan = (ImageView)findViewById(R.id.imgLaura);

        imgJuan.setImageResource(R.drawable.juanactivity);

        btnVolver = (ImageButton)findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);

    }
    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
