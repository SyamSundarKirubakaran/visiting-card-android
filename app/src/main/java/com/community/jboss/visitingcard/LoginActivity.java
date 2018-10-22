package com.community.jboss.visitingcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.community.jboss.visitingcard.VisitingCard.VisitingCardActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // TODO: Perform Firebase Authentication using Google Signin.
        // TODO: Have a Signin with google Button.

        //TODO: Move the FAB to bottom Right and replace it's icon with a check icon
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Proceed to Visiting Card Layout", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // TODO: Go to next stage only when the User is Authenticated.
                                Intent toVisitingCard = new Intent(LoginActivity.this, VisitingCardActivity.class);
                                startActivity(toVisitingCard);
                            }
                        }).show();
            }
        });
    }
}
