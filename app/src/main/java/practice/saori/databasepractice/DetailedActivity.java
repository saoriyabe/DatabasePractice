package practice.saori.databasepractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {
    private TextView nameDetailed;
    private TextView phoneNumberDetailed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        nameDetailed = findViewById(R.id.nameTextView);
        phoneNumberDetailed = findViewById(R.id.phoneNumberTextView);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String name = bundle.getString("name");
            String phoneNumber = bundle.getString("phoneNumber");
            nameDetailed.setText(name);
            phoneNumberDetailed.setText(phoneNumber);
        }
    }
}
