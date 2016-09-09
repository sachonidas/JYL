package sachonidas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivityJuan extends AppCompatActivity {

    private ImageView imgJuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_juan);

        imgJuan = (ImageView)findViewById(R.id.imgJuan);

        imgJuan.setImageResource(R.drawable.juanactivity);

    }
}
