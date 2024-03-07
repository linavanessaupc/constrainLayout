package co.edu.botton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazFormulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);
    }

    public void abrirPantalla(View view) {
        Intent intent = new Intent(this, InterfazCorreo.class);
        startActivity(intent);
    }

}