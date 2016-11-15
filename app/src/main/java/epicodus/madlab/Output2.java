package epicodus.madlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Output2 extends AppCompatActivity {

    @Bind(R.id.madLabTextView) TextView mMadLabTextView;
    @Bind(R.id.resetButton) Button mResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output2);

        ButterKnife.bind(this);

        Intent intent = getIntent();

        String madLab = intent.getStringExtra("madLab");

        mMadLabTextView.setText(madLab);

        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Output2.this, Madlab2.class);
                startActivity(intent1);
            }
        });

    }
}