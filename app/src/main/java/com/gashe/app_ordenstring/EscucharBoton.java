package com.gashe.app_ordenstring;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Iterator;

/**
 * Created by Gashe on 11/12/16.
 */

public class EscucharBoton implements View.OnClickListener{

    private Context ct;

    //Contruct__
    public EscucharBoton(Context context){
        //Recogemos this mediante Context y lo instanciamos a variable ct
        this.ct = context;
    }

    //Implementamos método del comportamiento del View.OnclickListener
    @Override
    public void onClick(View view) {

        Log.d(getClass().getCanonicalName(), "Pinchamos sobre el botón");

        //Instanciamos la actividad y recogemos datos
        Activity activity = (Activity) ct;
        EditText editText = (EditText)activity.findViewById(R.id.inputNombre);

        //Llamamos a utils y cambiamos orden
        Utils utils = new Utils();
        String nombreAlreves = utils.cambiaOrdenString(editText);

        Log.d(getClass().getCanonicalName(), "Nombre alrevés: "+nombreAlreves);

        //Instanciamos el linearLayout iframe y vemos si tiene hijos o no
        LinearLayout linearLayout = (LinearLayout)activity.findViewById(R.id.layoutIframe);
        Log.d(getClass().getCanonicalName(), "Número de hijos del layout: "+linearLayout.getChildCount());
        if(linearLayout.getChildCount() > 0){
            Log.d(getClass().getCanonicalName(), "Tiene hijos");
            TextView salida = (TextView)activity.findViewById(R.id.labelMensaje);
            salida.setText(nombreAlreves);
        }else{
            Log.d(getClass().getCanonicalName(), "No tiene hijos");
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            View newContent = layoutInflater.inflate(R.layout.mensaje_salida, linearLayout);
            TextView salida = (TextView)newContent.findViewById(R.id.labelMensaje);
            salida.setText(nombreAlreves);
        }


    }

}
