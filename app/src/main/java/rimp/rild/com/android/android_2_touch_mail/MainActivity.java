package rimp.rild.com.android.android_2_touch_mail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by rild on 16/07/06.
 */
public class MainActivity extends AppCompatActivity {
    TextView mButtonPickUp;
    TextView mButtonNoDinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonPickUp = (TextView) findViewById(R.id.button_pick_me_up);
        mButtonNoDinner = (TextView) findViewById(R.id.button_no_dinner);

        mButtonPickUp.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PickUpActivity.class);
            startActivity(intent);
        });

        mButtonNoDinner.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NoDinnerActivity.class);
            startActivity(intent);
        });
    }
}
