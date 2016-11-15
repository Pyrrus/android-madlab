package epicodus.madlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.madlibButton) Button mMadlibButton;
    @Bind(R.id.sillyword) EditText mSillyWord;
    @Bind(R.id.lastName) EditText mLastName;
    @Bind(R.id.illness) EditText mIllness;
    @Bind(R.id.noun) EditText mNoun;
    @Bind(R.id.adjective1) EditText mAdjective1;
    @Bind(R.id.adjective2) EditText mAdjective2;
    @Bind(R.id.sillyword2) EditText mSillyWord2;
    @Bind(R.id.place) EditText mPlace;
    @Bind(R.id.number) EditText mNumber;
    @Bind(R.id.adjective3) EditText mAdjective3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMadlibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String madLab = "Dear School Nurse:\n" +
                        mSillyWord + " " + mLastName + " will not be attending school today. He/she has come down with a case of " + mIllness + " and has horrible " + mNoun + " and a/an " + mAdjective1 + " fever. We have made an appointment with the " + mAdjective2 + " Dr. " + mSillyWord2 + ", who studied for many years in " + mPlace + "  and has " + mNumber +  " degrees in pediatrics. He will send you all the information you need. Thank you!\n" +
                        "Sincerely\n" +
                        "Mrs. " + mAdjective3 + ". ";
                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("madLab", madLab);
                startActivity(intent);
            }
        });
    }
}
