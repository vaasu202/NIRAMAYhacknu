package com.beliscosolutions.corneliouzbett.medmanager01.utils.service;

import android.os.AsyncTask;

/**
 * Created by CorneliouzBett on 17/04/2018.
 */

public class MedicationJobExecutor extends AsyncTask<Void,Void,String>{

    @Override
    protected String doInBackground(Void... voids) {
        return "running in the background";
    }
}
