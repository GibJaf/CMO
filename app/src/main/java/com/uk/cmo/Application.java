package com.uk.cmo;

import com.google.firebase.database.FirebaseDatabase;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //For enabling offline capabilities.
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
