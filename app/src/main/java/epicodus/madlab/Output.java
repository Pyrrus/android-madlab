package epicodus.madlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Output extends AppCompatActivity {

    @Bind(R.id.madLabTextView) TextView mMadLabTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        ButterKnife.bind(this);

        Intent intent = getIntent();

        String madLab = intent.getStringExtra("madLab");

        mMadLabTextView.setText(madLab);
    }
}
