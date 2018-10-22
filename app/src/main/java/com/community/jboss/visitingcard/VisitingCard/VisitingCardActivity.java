package com.community.jboss.visitingcard.VisitingCard;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.community.jboss.visitingcard.LoginActivity;
import com.community.jboss.visitingcard.Maps.MapsActivity;
import com.community.jboss.visitingcard.R;

public class VisitingCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visiting_card);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Proceed to Maps Activity", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent toVisitingCard = new Intent(VisitingCardActivity.this, MapsActivity.class);
                                startActivity(toVisitingCard);
                            }
                        }).show();
            }
        });

    }
}
