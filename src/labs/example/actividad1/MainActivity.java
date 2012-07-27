package labs.example.actividad1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity {

	public final static String MENSAJE = "labs.example.actividad1.MENSAJE";
	private EditText mensaje;
	private String [] message = new String[2];
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void mostrarTexto(View view){
    	Intent hi = new Intent(this, mostrar_texto.class);
    	mensaje = (EditText) findViewById(R.id.editText1);
    	message[0] = mensaje.getText().toString();
    	mensaje = (EditText) findViewById(R.id.editText2);
    	message[1] = mensaje.getText().toString();
    	hi.putExtra(MENSAJE, message);
    	startActivity(hi);    	
    }
}
