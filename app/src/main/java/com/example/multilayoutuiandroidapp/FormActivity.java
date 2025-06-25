package com.example.multilayoutuiandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FormActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    EditText etName, etEmail, etPhone;
    Button btnSubmit, btnClear;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnClear.setOnClickListener(v -> {
            etName.setText("");
            etEmail.setText("");
            etPhone.setText("");
        });

        dbHelper = new DBHelper(this);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();

            boolean inserted = dbHelper.insertData(name, email, phone);
            if (inserted) {
                Toast.makeText(FormActivity.this, "Data saved successfully", Toast.LENGTH_SHORT).show();
                etName.setText("");
                etEmail.setText("");
                etPhone.setText("");
            } else {
                Toast.makeText(FormActivity.this, "Failed to save data", Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_form); // Highlight current tab

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
                return true;
            } else if (id == R.id.nav_form) {
                startActivity(new Intent(this, FormActivity.class));
                return true;
            } else if (id == R.id.nav_dashboard) {
                startActivity(new Intent(this, DashboardActivity.class));
                return true;
            }
            return false;
        });

    }
}
