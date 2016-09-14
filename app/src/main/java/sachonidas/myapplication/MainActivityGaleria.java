package sachonidas.myapplication;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivityGaleria extends AppCompatActivity {


    private ImageButton btnVolver;
    private ViewPager mPager;
    Integer[] imageIDs = {
            R.drawable.galeria1,
            R.drawable.galeria2,
            R.drawable.galeria3,
            R.drawable.galeria4,
            R.drawable.galeria5,
            R.drawable.galeria6,
            R.drawable.galeria7,
            R.drawable.galeria8,
            R.drawable.galeria9,
            R.drawable.galeria10,
            R.drawable.galeria11,
            R.drawable.galeria12,
            R.drawable.galeria13,
            R.drawable.galeria14,
            R.drawable.galeria15

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_galeria);



        btnVolver = (ImageButton)findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);
    }



    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
