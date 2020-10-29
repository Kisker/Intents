package net.learn2develop.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
    int request_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickWebBrowser (View view){
        Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);
    }
    public void onClickMakeCalls (View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +381638204868"));
        startActivity(i);
    }
    public void onClickShowMap(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Ba%C4%8Dko+Dobro+Polje,+Serbia/@45.5019299,19.6501738,13z/data=!3m1!4b1!4m5!3m4!1s0x475b44123a28ceff:0xbc5ec56a9c4d999a!8m2!3d45.5044801!4d19.6659901"));
        startActivity(i);
    }
    public void onClickLaunchMyBrowser (View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.kupujemprodajem.com"));
        startActivity(i);
    }
}