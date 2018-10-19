package universityatbuffalo.cse442groupproject.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BudgetActivity extends AppCompatActivity {
    float inputbugdet;
    Button submitButton;
    EditText budgetinput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        budgetinput = findViewById(R.id.budgettext);
        submitButton = findViewById(R.id.submitbutton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inputbugdet = Float.valueOf(budgetinput.getText().toString());
                }
                catch(NumberFormatException error){
                    inputbugdet = 0;
                    showToast("Error");
                }
                showToast(String.valueOf(inputbugdet));
            }
        });

    }

        private void showToast(String text){
            Toast.makeText(BudgetActivity.this, text, Toast.LENGTH_SHORT).show();
            //return text;
        }
}
