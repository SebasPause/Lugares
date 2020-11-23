package com.example.mislugares.presentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.mislugares.R;

public class VistaLugarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_lugares);
    }

    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.vista_lugar,menu);
        return true;
    }

    //Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_editar) {
            lanzarEditar(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void lanzarEditar(View view){
        Intent intent = new Intent(this,EdicionLugarActivity.class);
        startActivity(intent);
    }

}