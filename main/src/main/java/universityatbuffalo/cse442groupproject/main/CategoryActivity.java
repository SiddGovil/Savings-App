package universityatbuffalo.cse442groupproject.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity {
    float inputfood;
    Button buttonforfood;
    EditText foodinput;

    float inputcloth;
    Button buttonforcloth;
    EditText clothinput;

    float inputother;
    Button buttonforother;
    EditText otherinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        foodinput = findViewById(R.id.foodbox);
        clothinput = findViewById((R.id.clothbox));
        otherinput = findViewById(R.id.otherbox);
        buttonforcloth = findViewById(R.id.clothbutton);
        buttonforcloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inputcloth = Float.valueOf(clothinput.getText().toString());

                }
                catch(NumberFormatException error){
                    inputcloth = 0;
                    showToast("Error");
                }
                showToast(String.valueOf(inputcloth));
            }
        });

        buttonforother = findViewById(R.id.otherbutton);
        buttonforother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inputother = Float.valueOf(otherinput.getText().toString());
                }
                catch(NumberFormatException error){
                    inputother = 0;
                    showToast("Error");
                }
                showToast(String.valueOf(inputother));
            }
        });
        buttonforfood = findViewById(R.id.foodbutton);
        buttonforfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    inputfood = Float.valueOf(foodinput.getText().toString());
                }
               catch(NumberFormatException error){
                    inputfood = 0;
                    showToast("Error");
               }
                showToast(String.valueOf(inputfood));
            }
        });
    }

    private void showToast(String text){
        Toast.makeText(CategoryActivity.this, text, Toast.LENGTH_SHORT).show();

    }
}
