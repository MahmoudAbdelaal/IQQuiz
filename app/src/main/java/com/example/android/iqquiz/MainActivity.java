package com.example.android.iqquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    double result;
    String score;
    boolean isRadioButtonAnswerCorrect = false;
    boolean isCheckButtonAnswerCorrect = false;
    boolean isCheckButtonAnswerCorrect1 = false;

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.ICKTEA:
            case R.id.WLONUD:
            case R.id.XOLEIN:
                isRadioButtonAnswerCorrect = false;
                break;
            case R.id.ARHCLO:
                if (checked) {
                    isRadioButtonAnswerCorrect = true;
                }
        }
    }

    public void onCheckboxClicked(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.check_1:
            case R.id.check_3:
            case R.id.check_4:
            case R.id.check_5:
            case R.id.check_6:
            case R.id.check_7:
                if (checked)
                    isCheckButtonAnswerCorrect = false;
                break;
            case R.id.check_2:
                if (checked)
                    isCheckButtonAnswerCorrect = true;
                break;
            case R.id.check_8:
                if (checked)
                    isCheckButtonAnswerCorrect1 = true;
                break;
        }
    }


    public void order2(View view) {

        EditText name_edit_view = (EditText) findViewById(R.id.name_edit_view);
        String valuename0 = name_edit_view.getText().toString();

        EditText Edit_Text_One = (EditText) findViewById(R.id.Edit_Text_One);
        int valueNameTwo = Integer.parseInt(Edit_Text_One.getText().toString());

        if (valueNameTwo == 42) {
            result = result + 3;
        }


        EditText Edit_Text_Two = (EditText) findViewById(R.id.Edit_Text_Two);
        String valueNameOne = Edit_Text_Two.getText().toString();

        if (Objects.equals(valueNameOne, "KP")) {
            result = result + 3;
        }

        EditText Edit_Text_Three = (EditText) findViewById(R.id.Edit_Text_Three);
        double valueName = Double.parseDouble(Edit_Text_Three.getText().toString());

        if (valueName == 0.18) {
            result = result + 3;
        }

        if (isRadioButtonAnswerCorrect) {
            result = result + 3;
        }

        EditText Edit_Text_Four = (EditText) findViewById(R.id.Edit_Text_Four);
        String valueNamefour = Edit_Text_Four.getText().toString();
        if (Objects.equals(valueNamefour, "ABDGKP")) {
            result = result + 3;
        }

        EditText Edit_Text_Five = (EditText) findViewById(R.id.Edit_Text_Five);
        int valueNameFive = Integer.parseInt(Edit_Text_Five.getText().toString());
        if (valueNameFive == 8){
            result = result + 3;
        }

        if (isCheckButtonAnswerCorrect) {
            result = result +1.5;
        }

        if (isCheckButtonAnswerCorrect1) {
            result = result +1.5;
        }

        EditText Edit_Text_Eight = (EditText) findViewById(R.id.Edit_Text_Eight);
        int ValueNameSix = Integer.parseInt(Edit_Text_Eight.getText().toString());
        if (ValueNameSix == 34826){
            result = result + 3;
        }

        EditText Edit_Text_Nine = (EditText) findViewById(R.id.Edit_Text_Nine);
        String ValueNameSeven = Edit_Text_Nine.getText().toString();

        if (ValueNameSeven == "TUESDAY"){
            result = result + 3;
        }

        EditText Edit_Text_Ten = (EditText) findViewById(R.id.Edit_Text_Ten);
        double ValueNameEight = Double.parseDouble(Edit_Text_Ten.getText().toString());
        if (ValueNameEight == 20.7){
            result = result + 3;
        }

        if (result <= 2) {
            score = "Very Low";
        } else if (result <= 5) {
            score = "low";
        } else if (result <= 9) {
            score = "Borderline low";
        } else if (result <= 12) {
            score = "Low average";
        } else if (result <= 16) {
            score = "Middle average";
        } else if (result <= 18) {
            score = "High average";
        } else if (result <= 20) {
            score = "Very high average";
        } else if (result <= 23) {
            score = "Expert";
        } else if (result <= 26) {
            score = "High expert";
        } else if (result <= 30) {
            score = "Very highly exceptional";
        }
        displayMessage("HI : " + valuename0 +"\nYour Score : " + score +"\nYour Right Answer : "+ result/3 + "\n the result " + result );
    }

    private void displayMessage(String message) {
        TextView answerTextView = (TextView) findViewById(R.id.score);
        answerTextView.setText(message);
    }

    public void order3(View view) {
        displayMessage("");
        result = 0;
        isCheckButtonAnswerCorrect = false;
        isRadioButtonAnswerCorrect = false;
    }


}