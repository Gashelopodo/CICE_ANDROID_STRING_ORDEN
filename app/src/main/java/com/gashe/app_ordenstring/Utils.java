package com.gashe.app_ordenstring;

import android.util.Log;
import android.widget.EditText;

/**
 * Created by Gashe on 11/12/16.
 */

public class Utils {

    public String cambiaOrdenString(EditText editText){
        Log.d(getClass().getCanonicalName(), "Texto del input: "+editText.getText().toString());
        char[] caracteres = editText.getText().toString().toCharArray();
        String cadena = "";
        for (int i = (caracteres.length-1); i>=0; i--){
            Log.d(getClass().getCanonicalName(), ""+caracteres[i]);
            cadena += ""+caracteres[i];
        }
        return cadena;
    }


}
