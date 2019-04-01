package com.example.greenflag;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class AddProfile extends AppCompatActivity {

    static final String piname = AddProfile.class.getSimpleName();
    static final String piusername = AddProfile.class.getSimpleName();
    static final String pipassword = AddProfile.class.getSimpleName();
    static final String piage = AddProfile.class.getSimpleName();
    static final String pipostal = AddProfile.class.getSimpleName();
    TextInputLayout textInputLayoutName;
    TextInputLayout textInputLayoutUsername;
    TextInputLayout textInputLayoutPassword;
    TextInputLayout textInputLayoutAge;
    TextInputLayout textInputLayoutPostal;
    Button btn_save, btn_change_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        textInputLayoutName = findViewById(R.id.til_name);
        textInputLayoutUsername = findViewById(R.id.til_username);
        textInputLayoutPassword = findViewById(R.id.til_password);
        textInputLayoutAge = findViewById(R.id.til_age);
        textInputLayoutPostal = findViewById(R.id.til_postal_address);
        btn_save = findViewById(R.id.btn_save);
        btn_change_photo = findViewById(R.id.btn_change_photo);

        btn_save.setOnClickListener(view -> save());
        btn_change_photo.setOnClickListener(view -> changePhoto());

        MainActivity activity = new MainActivity();
    }

    private void save() {
        Log.d(piname, "saveTask: "+textInputLayoutName.getEditText().getText().toString());
        MainActivity.profileList.add(textInputLayoutName.getEditText().getText().toString());
        finish();
    }

    private void changePhoto(){

    }


}
