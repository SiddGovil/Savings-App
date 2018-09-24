package universityatbuffalo.cse442groupproject.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity {
    int inputfood;
    Button buttonforfood;
    EditText foodinput;

    int inputcloth;
    Button buttonforcloth;
    EditText clothinput;

    int inputother;
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
                inputcloth = Integer.valueOf(clothinput.getText().toString());
                showToast(String.valueOf(inputcloth));
            }
        });

        buttonforother = findViewById(R.id.otherbutton);
        buttonforother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputother = Integer.valueOf(otherinput.getText().toString());
                showToast(String.valueOf(inputother));
            }
        });
        buttonforfood = findViewById(R.id.foodbutton);
        buttonforfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputfood = Integer.valueOf(foodinput.getText().toString());
                showToast(String.valueOf(inputfood));
            }
        });
    }

    private void showToast(String text){
        Toast.makeText(CategoryActivity.this, text, Toast.LENGTH_SHORT).show();

    }
}
