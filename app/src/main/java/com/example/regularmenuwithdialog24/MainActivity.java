package com.example.regularmenuwithdialog24;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.login)
        {
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
            Dialog d = new Dialog(this);
            d.setContentView(R.layout.custom_dialog_login);
            EditText etName = d.findViewById(R.id.etLoginName);
            EditText etPass = d.findViewById(R.id.etLoginPass);
            Button btnSave = d.findViewById(R.id.btnLoginSave);
            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Save " + etName.getText().toString(), Toast.LENGTH_SHORT).show();
                    d.dismiss();
                }
            });

            d.show();

        }

        if(id == R.id.register)
        {
            Toast.makeText(this, "Register", Toast.LENGTH_SHORT).show();
        }

        if(id == R.id.logout)
        {
            Toast.makeText(this, "LogOut", Toast.LENGTH_SHORT).show();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}