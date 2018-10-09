package com.anik.textsuggestion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnSingleItem,btnMultipleItem;
    AutoCompleteTextView txtSingleText;
    MultiAutoCompleteTextView txtMultipleText;
    String[] languages={"Android ","java","IOS","SQL","JDBC","Web services"};

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialization
        btnSingleItem=findViewById(R.id.single_item);
        btnMultipleItem=findViewById(R.id.multiple_item);
        txtSingleText =findViewById(R.id.autoCompleteTextView1);
        txtMultipleText =findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter adapter = new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);

        txtSingleText.setAdapter(adapter);
        txtSingleText.setThreshold(1);  //take only one item

        txtMultipleText.setAdapter(adapter);
        txtMultipleText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        btnSingleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String single_text= txtSingleText.getText().toString();
                Toast.makeText(MainActivity.this, ""+single_text, Toast.LENGTH_SHORT).show();
            }
        });


        btnMultipleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String multiple_text= txtMultipleText.getText().toString();
                Toast.makeText(MainActivity.this, ""+multiple_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
