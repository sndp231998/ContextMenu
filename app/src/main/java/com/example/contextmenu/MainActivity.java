package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    String[] array={"Name","Father Name","Mother Name"};
//    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView=findViewById(R.id.text_view);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.example_menu,menu);

    }

    @Override
    public boolean onContextItemSelected( MenuItem item) {
       switch(item.getItemId()){
           case R.id.option1:
               Toast.makeText(this,"Option 1 selected",Toast.LENGTH_LONG).show();
               return true;

           case R.id.option2:
               Toast.makeText(this,"Option 2 selected",Toast.LENGTH_LONG).show();
               return true;

           default:
               return super.onContextItemSelected(item);
       }

    }
}


