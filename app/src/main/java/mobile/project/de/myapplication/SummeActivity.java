package mobile.project.de.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by christiannoubi on 31.10.19.
 */

public class SummeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summe);

        Intent sum = getIntent();
        int zahl = sum.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textBlock = findViewById(R.id.textView);
        textBlock.setText(String.valueOf(zahl));
    }
}
