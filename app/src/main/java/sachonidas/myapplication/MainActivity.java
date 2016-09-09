package sachonidas.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ImageButton imagenNovio, imagenNovia;
    private Button btn;
    private TextView tv1, tv2, tv3;
    int senanasRestar = 14;
    int diasRestar = 10;
    int horasRestar = 12;
    int minutosRestar = 0;
    int segundosRestar = 0;
    Spinner sp1, sp2;
    private String sp1Opcion, sp2Opcion;
    String novios[] = {"LOS NOVIOS", "JUAN", "LAURA"};
    ExpandableListAdapter mAdapter;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        long ahora = System.currentTimeMillis();
        Date d = new Date(ahora);

        c.setTimeInMillis(ahora);
        int horas = c.get(Calendar.HOUR);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);
        int semanas = c.get(Calendar.WEEK_OF_MONTH);
        int dias = c.get(Calendar.DAY_OF_MONTH);

        String horasString = String.valueOf(horas);
        String minutosString = String.valueOf(minutos);
        String segundosString = String.valueOf(segundos);
        String semanasString = String.valueOf(semanas);
        String diasString = String.valueOf(dias);

        Log.e("Horas", horasString);
        Log.e("Minutos", minutosString);
        Log.e("Segundos", segundosString);
        Log.e("Dias", diasString);
        Log.e("Semanas", semanasString);



        Typeface face= Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);

        tv1.setTypeface(face);
        tv2.setTypeface(face);
        tv3.setTypeface(face);



        //imagenNovio = (ImageButton)findViewById(R.id.imgBtnNovio);
        //imagenNovia = (ImageButton)findViewById(R.id.imgBtnNovia);

        //imagenNovio.setImageResource(R.drawable.novio);
        //imagenNovia.setImageResource(R.drawable.novia);

        sp1 = (Spinner)findViewById(R.id.spLosNovios);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.novios_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);

        sp2 = (Spinner)findViewById(R.id.sp2InfoEvento);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.evento_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter2);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sp1Opcion = parent.getItemAtPosition(position).toString();
                Log.e("Opcion", "juan");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        String select = sp1.getSelectedItem().toString();
        if(select == "JUAN"){
            Intent intent = new Intent(MainActivity.this, MainActivityJuan.class);
            startActivity(intent);
        }

        expandableListView = (ExpandableListView)findViewById(R.id.expL);
        expandableListView.setAdapter(mAdapter);



    }



    public void onClickNovio(View view){
        Toast.makeText(MainActivity.this, "Has clicado en el novio.",
                Toast.LENGTH_SHORT).show();
        Log.e("Clic","- Novio");
    }

     public void onClickNovia(View view){
         Toast.makeText(MainActivity.this, "Has clicado en el novia.",
                 Toast.LENGTH_SHORT).show();
    }

    public void lanzaBienvenida(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
