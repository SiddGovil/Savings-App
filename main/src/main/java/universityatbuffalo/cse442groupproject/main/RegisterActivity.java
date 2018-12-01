package universityatbuffalo.cse442groupproject.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        SharedPreferences sp = getSharedPreferences("Login", Context.MODE_PRIVATE);
        final SharedPreferences.Editor Ed = sp.edit();
        final EditText etNew = (EditText) findViewById(R.id.newPin);
        final Button btPin = (Button) findViewById(R.id.createPin);
        btPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNew.getText().toString().isEmpty() == false && etNew.getText().toString().length() == 4) {
                    Ed.putString("id", etNew.getText().toString());
                    Ed.commit();
                    showToast("New PIN Created");

                } else {
                    showToast("Must enter a 4 digit numeric PIN");
                }

            }
        });

    }

    private void showToast(String text) {
        Toast.makeText(RegisterActivity.this, text, Toast.LENGTH_SHORT).show();
        //return text;
    }
}
