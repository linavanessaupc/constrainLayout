package co.edu.botton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazBoton3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton3);
    }

    public void abrirPantalla(View view) {
        Intent intent = new Intent(this, InterfazBoton4.class);
        startActivity(intent);
    }
}
