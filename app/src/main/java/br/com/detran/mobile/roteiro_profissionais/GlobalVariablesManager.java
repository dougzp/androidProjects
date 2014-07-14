package br.com.detran.mobile.roteiro_profissionais;

/**
 * Created by douglas on 14/07/14.
 */
public class GlobalVariablesManager {

    GlobalVariablesManager() {
    /* this should be fast */
    }

   private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
