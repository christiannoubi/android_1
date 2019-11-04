package mobile.project.de.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_TEXT = "";
    public static final String EXTRA_NUMBER = "extra_number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendeText(View view) {
        Intent textAnzeigen = new Intent(this, TextAnzeigenActivity.class);
        EditText textFeld = findViewById(R.id.editText);
        String text = textFeld.getText().toString();
        textAnzeigen.putExtra(EXTRA_TEXT, text);
        startActivity(textAnzeigen);
    }


    public void sommeNumber(View view) {
        Intent sum = new Intent(this, SummeActivity.class);
        EditText summand1 = findViewById(R.id.summan_1);
        EditText summand2 = findViewById(R.id.summan_2);
        int summand1Value = Integer.parseInt(summand1.getText().toString());
        int summand2Value = Integer.parseInt(summand2.getText().toString());
        sum.putExtra(EXTRA_NUMBER, summand1Value + summand2Value);
        startActivity(sum);
    }

}
