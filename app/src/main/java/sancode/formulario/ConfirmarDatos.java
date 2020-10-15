package sancode.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvNombre, tvFecha, tvTelefono, tvMail, tvNota;
    Button btn_editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("name");
        String fecha = parametros.getString("date");
        String telefono = parametros.getString("phone");
        String mail = parametros.getString("mail");
        String nota = parametros.getString("note");




        tvNombre    = (TextView) findViewById(R.id.tvNombre);
        tvFecha     = (TextView) findViewById(R.id.tvFecha);
        tvTelefono  = (TextView) findViewById(R.id.tvTelefono);
        tvMail      = (TextView) findViewById(R.id.tvMail);
        tvNota      = (TextView) findViewById(R.id.tvNota);
        btn_editar  = (Button) findViewById(R.id.btnEditar);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvFecha.setText(fecha);
        tvMail.setText(mail);
        tvNota.setText(nota);

        btn_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(Intent.ACTION_EDIT);
                startActivity(editIntent);
            }
        });
    }


}