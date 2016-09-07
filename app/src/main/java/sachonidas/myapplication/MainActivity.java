package sachonidas.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton imagenNovio, imagenNovia;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenNovio = (ImageButton)findViewById(R.id.imgBtnNovio);
        imagenNovia = (ImageButton)findViewById(R.id.imgBtnNovia);


        imagenNovio.setImageResource(R.drawable.novio);
        imagenNovia.setImageResource(R.drawable.novia);

        btn = (Button)findViewById(R.id.button);

    }

    public void onClickNovio(View view){
        Toast.makeText(MainActivity.this, "Has clicado en el novio.",
                Toast.LENGTH_SHORT).show();
        Log.e("Clic","- Novio");
    }

     public void onClickNovia(View view){
         Toast.makeText(MainActivity.this, "Has clicado en el noviass.",
                 Toast.LENGTH_SHORT).show();
    }

}
