package app.sunshine.com.example.android.appdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register extends Activity {

    TextView Gotologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Gotologin = (TextView) findViewById(R.id.link_login);

        Gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Register.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
