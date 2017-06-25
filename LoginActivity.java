package com.example.harevost.forraccoondf;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private EditText accountEdit;
    private EditText passwordEdit;

    private Button loginButton;
    private Button cancelButton;
    private Button hintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        accountEdit = (EditText) findViewById(R.id.edit_account);
        passwordEdit = (EditText) findViewById(R.id.edit_password);

        loginButton = (Button) findViewById(R.id.button_login);
        cancelButton = (Button) findViewById(R.id.button_cancel);
        hintButton = (Button) findViewById(R.id.button_hint);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                String trueAccount = "RaccoonDF";
                String truePassword = "0120";

                if (account.equals(trueAccount) && password.equals(truePassword)) {
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Account or password is invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "RaccoonDF 0120", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
