package epicodus.madlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_sickNote:
                if (checked) {
                    Intent intent = new Intent(MainActivity.this, Madlab1.class);
                    startActivity(intent);
                }
                    break;
            case R.id.radio_ironMan:
                if (checked) {
                    Intent intent = new Intent(MainActivity.this, Madlab2.class);
                    startActivity(intent);
                }
                break;
        }
    }
}
