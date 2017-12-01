package app.sunshine.com.example.android.appdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends Activity {

    TextView GotoSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        GotoSignUp = (TextView) findViewById(R.id.link_signup);

        GotoSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,Register.class);
                startActivity(intent);
            }
        });
    }
}
