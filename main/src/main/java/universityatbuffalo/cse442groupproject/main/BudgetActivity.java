package universityatbuffalo.cse442groupproject.main;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.Vector;

public class BudgetActivity extends AppCompatActivity {
    float inputbugdet;
    float amountspent;
    int rating;
    String inputlocation;
    Button submitButton;
    Button spendingHistory;
    Button saveButton;
    EditText budgetinput;
    EditText locationinput;
    EditText amountinput;
    EditText ratinginput;
    EditText budgetinp;
    EditText budgetclear;
    float result = 0;
    float result2 = 0;
    float result3 =0;
    Button clearbutton;
    Button spentbutton;
    Button spentclearbutton;
    EditText spentinput;
    EditText spentclear;
    EditText remainder;
    int i = 0;
    int z = 0;
    Button remainderbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        getWindow().getDecorView().setBackgroundColor(Color.GRAY);
        clearbutton = findViewById(R.id.clearbutton);
        budgetinput = findViewById(R.id.budgettext);
       // submitButton = findViewById(R.id.submitbutton);
       // spentbutton = findViewById(R.id.spententer);
       // spentclearbutton = findViewById(R.id.clearenter);
        remainder = findViewById(R.id.remainderfield);
        remainderbutton = findViewById(R.id.remainderbutton);
        //content = budgetclear.getText().toString();
        budgetinp =(EditText)findViewById(R.id.budgettext);
        spentinput = findViewById(R.id.spentmoney);
//        while (budgetinp.getText().toString()=="") {
//            budgetinp.setText(budgetinp.getText().toString());
//            remainder.setText(budgetinp.getText().toString());
//        }


//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = i + 1;
//                if (i == 1) {
//                   // budgetinp = (EditText) findViewById(R.id.budgettext);
//                    budgetinp.setText(budgetinp.getText().toString());
//                }
////                try {
////                    inputbugdet = Float.valueOf(budgetinput.getText().toString());
////                }
////                catch(NumberFormatException error){
////                    inputbugdet = 0;
////                    showToast("Error");
////                }
//                //  budgetinp.getText().clear();
////                budgetclear = budgetinp;
//                result = Integer.parseInt(budgetinp.getText().toString());
////                while (z == 0) {
////                    remainder.setText(result + "");
//////                    if (z == 0) {
//////                        remainder.setText(result + "");
//////                    }
////
////
////                }
//            }});


        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                budgetinp.getText().clear();
                spentinput.getText().clear();
                remainder.getText().clear();;
                i = 0;
                z = 0;
            }
        });

//      spentclearbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                spentinput.getText().clear();
//                z = 0;
//            }
//        });


//        spentbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                z = z + 1;
//                if (z==1) {
//                spentinput = findViewById(R.id.spentmoney);
//                spentinput.setText(spentinput.getText().toString());}
//                result2 = Integer.parseInt(spentinput.getText().toString());
//                while (budgetinp.getText().toString()=="") {
//                    remainder.setText(result2+"");
//                }
////                 (i==0 & z==1) {
////                    remainder.setText(result2+"");
////                }
////
////
////
//
//            }
//        });

        remainderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (budgetinp.getText().toString().isEmpty() == false && spentinput.getText().toString().isEmpty()==false) {
                  //  result = Integer.parseInt(budgetinp.getText().toString());
                    result = Float.parseFloat(budgetinp.getText().toString());
                    result2 = Float.parseFloat(spentinput.getText().toString());
                  //  result2 = Integer.parseInt(spentinput.getText().toString());
                    result3 = result - result2;
                   // showToast(Integer.toString(result3));
                    float b = 2f;
                    result3 = Math.round(result3*100.0f);
                    result3 = result3/100.0f;
                    remainder.setText(result3+"");
                    System.out.println(result3);

                }
            }
        });

        spendingHistory = findViewById(R.id.spendinghistory);
        spendingHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(BudgetActivity.this,HistoryActivity.class);
                startActivity(k);
            }
        });
    }

        private void showToast(String text){
            Toast.makeText(BudgetActivity.this, text, Toast.LENGTH_SHORT).show();
            //return text;
        }



}
