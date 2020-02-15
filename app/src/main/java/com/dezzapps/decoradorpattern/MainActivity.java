package com.dezzapps.decoradorpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dezzapps.decoradorpattern.models.bread.Bagel;
import com.dezzapps.decoradorpattern.models.bread.Bread;
import com.dezzapps.decoradorpattern.models.bread.LowFatButter;
import com.dezzapps.decoradorpattern.models.bread.Open;
import com.dezzapps.decoradorpattern.models.bread.Toasted;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.texto);

        Bread bagel = new Bagel();

        LowFatButter sbread = new LowFatButter(bagel);

        Toasted toasted = new Toasted(sbread);

        Open open = new Open(toasted);

        textView.setText(open.getDescription() + " : "+open.getKcal());
    }
}
