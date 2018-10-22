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

        // TODO: Add a ImageView and a number of EditText to get his/her Visiting Card details (Currently authenticated User)

        // TODO: Add profileImage, Name, Email, PhoneNumber, Github, LinkedIn & Twitter Fields.

        // TODO: Clicking the ImageView should invoke an implicit intent to take an image using camera / pick an image from the Gallery.

        // TODO: Align FAB to Bottom Right and replace it's icon with a SAVE icon
        // TODO: On Click on FAB should make a network call to store the entered information in the cloud using POST method(Do this in NetworkUtils class)
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
