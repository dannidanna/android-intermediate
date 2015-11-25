package com.example.danny.myparserproyect;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Danny on 03/11/2015.
 */
public class MainApplication extends Application{
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "hxYfyFGE639WYyBtVbd1E4nDXRgF8g7fe1BRj8po", "8IT6RpxXcvg6zgjxVSyFVfcIsS7HQ1KnlPcpRKKx");

    }
}
