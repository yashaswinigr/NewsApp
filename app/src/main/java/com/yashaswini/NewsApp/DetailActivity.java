package com.yashaswini.NewsApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv = findViewById(R.id.text);
        Intent i = getIntent();
        Model model= (Model) i.getSerializableExtra("description");
        tv.setText((CharSequence) model);

    }
}
