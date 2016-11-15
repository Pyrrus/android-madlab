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

public class Madlab2 extends AppCompatActivity {

    @Bind(R.id.madlibButton) Button mMadlibButton;
    @Bind(R.id.material) EditText mMaterial;
    @Bind(R.id.bodyPart1) EditText mBodyPart1;
    @Bind(R.id.verb1) EditText mVerb1;
    @Bind(R.id.verbS1) EditText mVerbs1;
    @Bind(R.id.adjective1) EditText mAdjective1;
    @Bind(R.id.pluralNoun) EditText mNoun;
    @Bind(R.id.bodyPart2) EditText mBodyPart2;
    @Bind(R.id.verb2) EditText mVerb2;
    @Bind(R.id.personInRoom) EditText mPersonInRoom;
    @Bind(R.id.verbS2) EditText mVerbs2;
    @Bind(R.id.place) EditText mPlace;
    @Bind(R.id.verbS3) EditText mVerbs3;
    @Bind(R.id.verbS4) EditText mVerbs4;
    @Bind(R.id.adjective2) EditText mAdjective2;
    @Bind(R.id.item) EditText mItem;
    @Bind(R.id.verbIng) EditText mVerbIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlab2);
        ButterKnife.bind(this);

        mMadlibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = "";
                if (material.getText().toString().equals("")) {
                    output += "Please Enter a Material\n";
                }
                if (bodyPart1.getText().toString().equals("")) {
                    output += "Please Enter a Body Part\n";
                }
                if (mVerb1.getText().toString().equals("")) {
                    output += "Please Enter an Verb\n";
                }
                if (mVerbs1.getText().toString().equals("")) {
                    output += "Please Enter a Verb Ending in 's'\n";
                }
                if (mAdjective1.getText().toString().equals("")) {
                    output += "Please Enter an Adjective\n";
                }
                if (mNoun.getText().toString().equals("")) {
                    output += "Please Enter a Plural Noun\n";
                }
                if (mPersonInRoom.getText().toString().equals("")) {
                    output += "Please Enter a Person in room\n";
                }
                if (mVerbs2.getText().toString().equals("")) {
                    output += "Please Enter a Verb Ending in 's'\n";
                }
                if (mPlace.getText().toString().equals("")) {
                    output += "Please Enter a Place\n";
                }
                if (mVerbs3.getText().toString().equals("")) {
                    output += "Please Enter a Verb Ending in 's'\n";
                }
                if (mVerbs4.getText().toString().equals("")) {
                    output += "Please Enter a Verb Ending in 's'\n";
                }
                if (mAdjective2.getText().toString().equals("")) {
                    output += "Please Enter an Adjective\n";
                }
                if (mItem.getText().toString().equals("")) {
                    output += "Please Enter a Item of Clothing\n";
                }
                if (mVerbIng.getText().toString().equals("")) {
                    output += "Please Enter an Verb ending in 'ing'\n";
                }
                if(output.equals("")) {
                    String madLab = "";
                    Intent intent = new Intent(Madlab2.this, Output.class);
                    intent.putExtra("madLab", madLab);
                    startActivity(intent);
                } else {
                    Toast.makeText(Madlab2.this, output, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
