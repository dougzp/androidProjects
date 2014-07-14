package br.com.detran.mobile.roteiro_profissionais;

import android.app.Activity;

/**
 * Created by douglas on 14/07/14.
 */
public class GlobalVariables extends Activity{



    private GlobalVariablesManager  globalVariablesManager= new GlobalVariablesManager();

    public GlobalVariablesManager getGlobalVariablesManager(){
        return globalVariablesManager ;
    }
}

