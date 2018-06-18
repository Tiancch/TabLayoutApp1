package com.example.user.tablayoutapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    ImageView mImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mImageView = (ImageView) findViewById(R.id.imageView2);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null){
           mImageView.setImageResource(mBundle.getInt("countryFlag"));
        }
    }
}
