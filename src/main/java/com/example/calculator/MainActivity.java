package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // a public method to get the input numbers
    public boolean getNumbers()
    {

        // Edit Text num1 to e1
        e1 = (EditText)findViewById(R.id.num1);

        // Edit Text num2 to e2
        e2 = (EditText)findViewById(R.id.num2);

        // Text View result to t1
        t1 = (TextView)findViewById(R.id.result);

        // getting input from num1 Text Box
        String s1 = e1.getText().toString();

        // getting input from num2 Text Box
        String s2 = e2.getText().toString();

        // Check for null values
        if ((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals("")))
        {
            String result = "Empty Field";
            t1.setText(result);
            return false;
        }

        else if(s1.equals(null)||s1.equals(""))
        {
            t1.setText(s2);
            return false;
        }
        else if (s2.equals(null)||s2.equals(""))
        {
            t1.setText(s1);
            return false;
        }

        //if not null
        else
            {
            // converting string to int.
            num1 = Integer.parseInt(e1.getText().toString());

            // converting string to int.
            num2 = Integer.parseInt(e2.getText().toString());
             }
        return true;
    }

    // Perform addition
    public void doSum(View v)
    {
        // get the input numbers
        if (getNumbers())
        {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

    // Perform subtraction
    public void doSub(View v)
    {
        // get the input numbers
        if (getNumbers())
        {
            int sub = num1 - num2;
            t1.setText(Integer.toString(sub));
        }
    }

    // Perform multiplication
    public void doMul(View v)
    {
        // get the input numbers
        if (getNumbers())
        {
            int mul = num1 * num2;
            t1.setText(Integer.toString(mul));
        }
    }
}