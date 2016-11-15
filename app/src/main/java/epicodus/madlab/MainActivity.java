package epicodus.madlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                String output = "";
                if (mSillyWord.getText().toString().equals("")) {
                    output += "Please Enter a Silly Word\n";
                }
                if (mLastName.getText().toString().equals("")) {
                    output += "Please Enter a Last Name\n";
                }
                if (mIllness.getText().toString().equals("")) {
                    output += "Please Enter an Illness\n";
                }
                if (mNoun.getText().toString().equals("")) {
                    output += "Please Enter a Noun\n";
                }
                if (mAdjective1.getText().toString().equals("")) {
                    output += "Please Enter an Adjective\n";
                }
                if (mAdjective2.getText().toString().equals("")) {
                    output += "Please Enter an Adjective\n";
                }
                if (mSillyWord2.getText().toString().equals("")) {
                    output += "Please Enter a Silly Word\n";
                }
                if (mPlace.getText().toString().equals("")) {
                    output += "Please Enter a Place\n";
                }
                if (mNumber.getText().toString().equals("")) {
                    output += "Please Enter a Number\n";
                }
                if (mAdjective3.getText().toString().equals("")) {
                    output += "Please Enter an Adjective\n";
                }
                if(output.equals("")) {
                        String madLab = "Dear School Nurse:\n" +
                                mSillyWord.getText().toString() + " " + mLastName.getText().toString() + " will not be attending school today. He/she has come down with a case of " + mIllness.getText().toString() + " and has horrible " + mNoun.getText().toString() + " and a/an " + mAdjective1.getText().toString() + " fever. We have made an appointment with the " + mAdjective2.getText().toString() + " Dr. " + mSillyWord2.getText().toString() + ", who studied for many years in " + mPlace.getText().toString() + "  and has " + mNumber.getText().toString() +  " degrees in pediatrics. He will send you all the information you need. Thank you!\n" +
                                "Sincerely\n" +
                                "Mrs. " + mAdjective3.getText().toString() + ". ";
                        Intent intent = new Intent(MainActivity.this, Output.class);
                        intent.putExtra("madLab", madLab);
                        startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, output, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mSillyWord.setText("");
        mLastName.setText("");
        mAdjective1.setText("");
        mAdjective2.setText("");
        mSillyWord2.setText("");
        mPlace.setText("");
        mNumber.setText("");
        mAdjective3.setText("");
    }
}
