package rimp.rild.com.android.android_2_touch_mail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        /**
        イベントリスナを仕掛けておく
         イベントリスナは イベントハンドラメソッドを実行する
         */
        mButton = (TextView) findViewById(R.id.button_first);

        mButton.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
