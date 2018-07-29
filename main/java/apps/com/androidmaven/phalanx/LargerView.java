package apps.com.androidmaven.phalanx;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oluwatobi on 7/16/2037.
 */

public class LargerView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.larger_view);
        String title = getIntent().getExtras().getString("me");
        TextView textView = (TextView) findViewById(R.id.myTitle);
        textView.setText(title);

        ImageView imageView = (ImageView)findViewById(R.id.backFrom);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
