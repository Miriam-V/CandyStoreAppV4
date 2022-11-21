package com.example.candystoreappv0;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar items here.
        int id = item.getItemId();
        switch (id) {
            case R.id.action_add:
                Log.w("MainActivity", "Add Selected");
                Intent insertIntent = new Intent(this, insertActivity.class);
                this.startActivity(insertIntent); // call to intent?
                return true;
            case R.id.action_delete:
                Log.w("MainActivity", "Delete Selected");
                Intent deleteIntent = new Intent(this, DeleteActivity.class);
                this.startActivity(deleteIntent);
                return true;
            case R.id.action_update:
                Log.w("MainActivity", "Update Selected");
                Intent updateIntent = new Intent( this, UpdateActivity.class );
                this.startActivity( updateIntent );
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}