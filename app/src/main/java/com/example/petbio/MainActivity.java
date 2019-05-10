package com.example.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.catViewID);
        dogView = findViewById(R.id.dogViewID);
        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.catViewID:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Maja");
                catIntent.putExtra("bio", "Graži spalva. Nemėgsta žmonių. Šeriasi");
                startActivity(catIntent);
                break;

            case R.id.dogViewID:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Lola");
                dogIntent.putExtra("bio", "Daug miega. Labai lėta. Amžinai alkana");
                startActivity(dogIntent);
                break;
        }

    }
}
