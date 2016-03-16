package com.example.andresvil.menuazul;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    int[] icons = {R.drawable.monitoreo, R.drawable.estadisticas, R.drawable.mascota, R.drawable.curso,
            R.drawable.retos, R.drawable.preguntas, R.drawable.agenda, R.drawable.recordatorio,
            R.drawable.configuracion, R.drawable.salir};

    String[] menuItems = {"Monitoreo", "Estadísticas", "Mascota", "Curso", "Retos", "Preguntas al Doctor",
                    "Agenda", "Recordatorio", "Configuración", "Salir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row_layout);
        listView.setAdapter(adapter);

        for(int i = 0; i < menuItems.length; i++)
        {
            MenuItems mi = new MenuItems(icons[i], menuItems[i]);
            adapter.add(mi);
        }

        listView.setOnItemClickListener(this);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Selected: " + menuItems[position], Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected: " + menuItems[position], Toast.LENGTH_SHORT).show();
    }
}
