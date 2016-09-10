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

    private ImageView imgLaura;
    private ImageButton btnVolver;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_laura);

        imgLaura = (ImageView)findViewById(R.id.imgLaura);

        imgLaura.setImageResource(R.drawable.lauraactivity);

        btnVolver = (ImageButton)findViewById(R.id.imageButton);

        btnVolver.setImageResource(R.drawable.homeicon);

        videoView = (VideoView)findViewById(R.id.videoView);

        videoView.setVideoURI(Uri.parse("https://youtu.be/98XkPHcmCv0"));


    }
    public void lanzaInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void videoStart(View view){
        videoView.setMediaController(new MediaController(this));

        videoView.start();
    }
}
