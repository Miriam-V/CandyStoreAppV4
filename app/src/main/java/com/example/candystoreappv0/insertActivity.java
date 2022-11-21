package com.example.candystoreappv0;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

// will hold methods for when we hit our button
public class insertActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbManager = new DatabaseManager(this); // reference to dbManager?
        setContentView(R.layout.activity_insert); // Wires to activity_insert.xml
    }

    public void insert(View view) {
    // Wire to the EditTexts in activity_insert.xml --- Retrieve Name and Price

        Log.w("InsertActivity", "Insert Button Pushed"); // log entry to make sure everything is working

        EditText nameET = findViewById(R.id.input_name); // reference to the input_name EditText in activity_insert.xml
        EditText priceEt = findViewById(R.id.input_price); // reference to the input_price EditText in activity_insert.xml
        String name = nameET.getText().toString(); // String value to "get" the text from nameET
        String priceString = priceEt.getText().toString(); // String value to "get" the text from priceET

        // Insert into Database
        try {
            double price = Double.parseDouble(priceString);
            Candy candy = new Candy(0,name,price);
            dbManager.insert(candy);
            Toast.makeText(this, "Candy Added", Toast.LENGTH_SHORT).show();
        }
        catch (NumberFormatException nfe) {
            Toast.makeText(this, "Price Error", Toast.LENGTH_SHORT).show();
        }


        // Clear Data
        nameET.setText("");
        priceEt.setText("");
    }

    public void goBack(View view) {

        this.finish();

    }
}
