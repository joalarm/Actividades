package labs.example.actividad1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class mostrar_texto extends Activity {

	private String [] mensaje;
	private TextView texto;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_texto);
        
        Intent intent = getIntent();
        mensaje = intent.getStringArrayExtra(MainActivity.MENSAJE);
        texto = (TextView) findViewById(R.id.textView1);
        texto.setText(mensaje[0]);
        texto = (TextView) findViewById(R.id.textView3);
        texto.setText(mensaje[1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mostrar_texto, menu);
        return true;
    }

    
}
