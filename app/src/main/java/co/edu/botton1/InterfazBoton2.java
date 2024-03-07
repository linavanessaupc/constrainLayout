package co.edu.botton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazBoton2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton2);
    }

    public void abrirPantalla(View view) {
        Intent intent = new Intent(this, InterfazBoton3.class);
        startActivity(intent);
    }
}
