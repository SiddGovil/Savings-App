package universityatbuffalo.cse442groupproject.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class HistoryActivity  extends AppCompatActivity {

    EditText et;
    EditText ratingET;
    EditText amountET;
    Button bt;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        et = findViewById(R.id.testEdit);
        ratingET = findViewById(R.id.ratingText);
        amountET = findViewById(R.id.amountText);
        bt =  findViewById(R.id.testButton);
        lv =  findViewById(R.id.listViewTest);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(HistoryActivity.this,android.R.layout.simple_list_item_1, arrayList );
        lv.setAdapter(adapter);

        onButtonClick();
    }

    public void onButtonClick() {
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                        String location1 = et.getText().toString();
                        float amount1 = Float.parseFloat(amountET.getText().toString());
                        int rating1 = Integer.parseInt(ratingET.getText().toString());
                        if (rating1 >= 1 && rating1 <= 5 && amount1 > 0 ) {

                            String result = location1 + " " + amount1 + " " + rating1;
                            arrayList.add(result);
                            adapter.notifyDataSetChanged();
                        }
                        else {
                            showToast("Enter a rating between 1 and 5, and an amount larger than 0");
                        }
                        }catch(NumberFormatException e){
                     showToast("Error");
                    }

            }
        });
    }
    private void showToast(String text){
        Toast.makeText(HistoryActivity.this, text, Toast.LENGTH_SHORT).show();
        //return text;
    }
}
