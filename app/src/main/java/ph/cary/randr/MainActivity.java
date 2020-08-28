package ph.cary.randr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view) {
        TextView textView = findViewById(R.id.tvNumber);
        Random rand = new Random();
        int color = Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

        textView.setTextColor(color);
        textView.setText("" + rand.nextInt(1000)+ "");
    }
}