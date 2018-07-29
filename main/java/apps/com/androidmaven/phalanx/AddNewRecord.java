package apps.com.androidmaven.phalanx;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Oluwatobi on 7/16/2037.
 */

public class AddNewRecord extends AppCompatActivity {
    EditText title, content, cost;
    Button newRecord;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_health_record);
        title  = (EditText) findViewById(R.id.treatmentTitle);
        content = (EditText) findViewById(R.id.treatmentContent);
        cost = (EditText) findViewById(R.id.treatmentCost);


        progressDialog  = new ProgressDialog(this);
        progressDialog.setMessage("Registering a new patient");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);

        newRecord  = (Button) findViewById(R.id.addTreatment);
        newRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.dismiss();
                progressDialog.cancel();
                Toast.makeText(AddNewRecord.this, "Adding new record successful", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }
}
