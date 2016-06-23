package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int itemnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        setTitle("Edit Item");
        String itemname = getIntent().getStringExtra("nameToEdit");
        itemnumber = getIntent().getIntExtra("position", 0);
        EditText etEditText = (EditText) findViewById(R.id.mltEditItem);
        etEditText.setText(itemname);
        etEditText.setSelection(etEditText.getText().length());

    }

    public void onEditSave(View v) {
        EditText etEditText1 = (EditText) findViewById(R.id.mltEditItem);
        Intent data = new Intent();
        data.putExtra("newItemName", etEditText1.getText().toString());
        data.putExtra("itemposition", itemnumber);
        setResult(RESULT_OK, data);
        finish();
    }
}
