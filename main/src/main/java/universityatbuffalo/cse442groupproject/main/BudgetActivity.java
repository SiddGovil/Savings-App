package universityatbuffalo.cse442groupproject.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class BudgetActivity extends AppCompatActivity {
    int inputbugdet;
    int inputrating;
    Button submitButton;
    Button spendingHistory;
    //EditText ratinginput;
    EditText budgetinput;
    Spinner ratingvalues;
    String[] values = new String[]{"1", "2", "3", "4", "5"};
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, values);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);


        budgetinput = findViewById(R.id.budgettext);
        submitButton = findViewById(R.id.submitbutton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputbugdet = Integer.valueOf(budgetinput.getText().toString());
                showToast(String.valueOf(inputbugdet));
            }
    });
        //ratinginput = findViewById(R.id.ratingtext);

        spendingHistory = findViewById(R.id.historybutton);
        spendingHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
               ratingvalues = findViewById(R.id.ratingvalues);
               ratingvalues.setAdapter(adapter);
//                inputrating = Integer.valueOf(ratinginput.getText().toString());
//                showToast(String.valueOf(inputrating));
            }
            });

    }

        private void showToast(String text){
            Toast.makeText(BudgetActivity.this, text, Toast.LENGTH_SHORT).show();
            //return text;
        }
}
