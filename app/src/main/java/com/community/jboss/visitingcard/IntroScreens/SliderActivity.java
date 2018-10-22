package com.community.jboss.visitingcard.IntroScreens;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.community.jboss.visitingcard.LoginActivity;
import com.community.jboss.visitingcard.R;
import com.community.jboss.visitingcard.VisitingCard.VisitingCardActivity;

public class SliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        //TODO: The Slider should appear only on when the app is launched for the first time. - Add appropriate conditions for that.

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Proceed to Login", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent toLogin = new Intent(SliderActivity.this, LoginActivity.class);
                                startActivity(toLogin);
                            }
                        }).show();
            }
        });

        // TODO: Create Introduction slides explaining all the functionalities of the app here.

        // TODO: if you're creating an Adapter for the ViewPager create it in the same Package and name it as SlideAdapter

    }
}
