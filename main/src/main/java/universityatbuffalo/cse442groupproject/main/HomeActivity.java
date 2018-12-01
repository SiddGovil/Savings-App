package universityatbuffalo.cse442groupproject.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button mainpage;
    Button update;
    EditText pinText;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        logo = findViewById(R.id.imageView2);
        pinText = findViewById(R.id.pin);
        mainpage = findViewById(R.id.loginbutton);
        update = findViewById(R.id.updatepin);
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pinTemp = pinText.getText().toString();
                if(pinTemp.isEmpty()) {
                    showToast("Must Create PIN first");
                }else {
                    SharedPreferences sharedPreferences = getSharedPreferences("Login", MODE_PRIVATE);
                    String password = sharedPreferences.getString("password", "");
                    if(password == pinTemp) {
                        Intent q = new Intent(HomeActivity.this, MainActivity.class);
                        startActivity(q);
                    }
                    else{
                        showToast("Incorrect Password");
                    }
                }
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
                Intent i = new Intent(HomeActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }
    private void showToast(String text){
        Toast.makeText(HomeActivity.this, text, Toast.LENGTH_SHORT).show();
        //return text;
    }

}
