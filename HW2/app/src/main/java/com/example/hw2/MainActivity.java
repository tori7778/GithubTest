package com.example.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu11, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item) {
        int itemThatWasClickedId = Item.getItemId();
        if (itemThatWasClickedId == R.id.gotoactivity2) {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(Item);
    }
}
