package com.example.hw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu22,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item) {
        int itemThatWasClickedId = Item.getItemId();
        if (itemThatWasClickedId == R.id.backtoactivity1) {
            Intent intent =new Intent(this,MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(Item);
    }
}
