package mobile.project.de.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by christiannoubi on 31.10.19.
 */

public class TextAnzeigenActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_anzeigen);

        Intent textAnzeigen = getIntent();
        String text = textAnzeigen.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textBlock = findViewById(R.id.textView);
        textBlock.setText(text);
    }
}
