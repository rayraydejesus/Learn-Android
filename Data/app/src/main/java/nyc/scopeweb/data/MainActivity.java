package nyc.scopeweb.data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
    }

    public void userLogOut(View view){
        preferenceConfig.writeLoginStatus(false);
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}
