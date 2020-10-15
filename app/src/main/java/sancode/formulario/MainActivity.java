package sancode.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, fecha, telefono, mail, nota;
    Button btn_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.etNombre);
        fecha = (EditText) findViewById(R.id.etFecha);
        telefono = (EditText) findViewById(R.id.etTelefono);
        mail = (EditText) findViewById(R.id.etMail);
        nota = (EditText) findViewById(R.id.etNota);
        btn_siguiente = (Button) findViewById(R.id.btnSiguiente);

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ConfirmarDatos.class);

                i.putExtra("name", nombre.getText().toString());
                i.putExtra("date", fecha.getText().toString());
                i.putExtra("phone", telefono.getText().toString());
                i.putExtra("mail", mail.getText().toString());
                i.putExtra("note", nota.getText().toString());
                startActivity(i);

            }
        });

    }
}