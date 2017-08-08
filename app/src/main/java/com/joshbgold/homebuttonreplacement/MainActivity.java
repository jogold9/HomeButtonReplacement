package com.joshbgold.homebuttonreplacement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public Context context;

    //required default constructor
    public MainActivity(){
    }

/*    public MainActivity(Context context) {
        context = getApplicationContext();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //context = this;

        final Button homeButton = (Button) findViewById(R.id.homeButton);

        Intent serviceIntent = new Intent(this, QuickSettingTileService.class);
        startService(serviceIntent);


        View.OnClickListener goHome = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go back to the home screen
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
        };
        homeButton.setOnClickListener(goHome);
    }
}
