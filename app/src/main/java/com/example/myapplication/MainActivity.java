package com.example.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText usuario, contraseña;
    ProgressBar pgB;
    Button btnValidar;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario= findViewById(R.id.txtusuario);
        contraseña = findViewById(R.id.btnpass);
       btnValidar = findViewById(R.id.btnValidar);
        pgB = findViewById(R.id.btnValidar);
        lblResultado = findViewById(R.id.lblMsj;
        btnValidar.setOnClickListener();txtUsuario(View view);{
            new AsyncTask().execute((usuario.getText().toString(), contraseña.getText().toString());
        });
    }
}
class asyncTask extends android.os.AsyncTask<String,Void , String>{
    @Override
    protected void onPreExecute() {
        pgB.setvisitibility(View.VISIBLE);
        btnValidar.setEnabled(false);
    }

    @Override
    protected String doInBackground(String... strings) {
     try{
         Thread.sleep(5000);
         String UserValido= pepito;
         String Uservalido =pepito123;
         String UserInput = String[0];
         String PassInput= String[1];
         if (UserInput.equals(UserValido)&&PassInput.equals(passInput));
     }catch (InterruptedException e){
         e.printStackTrace();
     }


    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        pgB.setVisibility(View.INVISIBLE);
        btnValidar.setEnabled(True);
    }

}