package com.jcooper.asg6_favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button buttonCall1, buttonCall2, buttonCall3;
    Button buttonText1, buttonText2, buttonText3;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetUpCallButtons();
        SetUpTextButtons();
    }


    private void SetUpTextButtons()
    {
        buttonText1 = (Button) findViewById(R.id.buttonText1);
        buttonText2 = (Button) findViewById(R.id.buttonText2);
        buttonText3 = (Button) findViewById(R.id.buttonText3);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);


        buttonText1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2182088336"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
                textViewStatus.setText("Message 1 Sending...");
            }
        });

        buttonText2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183339494"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
                textViewStatus.setText("Message 2 Sending...");
            }
        });

        buttonText3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2189691121"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
                textViewStatus.setText("Message 3 Sending...");
            }
        });
    }










    private void SetUpCallButtons()
    {
        buttonCall1 = (Button) findViewById(R.id.buttonCall1);
        buttonCall2 = (Button) findViewById(R.id.buttonCall2);
        buttonCall3 = (Button) findViewById(R.id.buttonCall3);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);

        buttonCall1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Intent callIntent = new Intent(Intent.ACTION_VIEW);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                    textViewStatus.setText("Calling1...");
                }
            }
        });

        buttonCall2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Intent callIntent = new Intent(Intent.ACTION_VIEW);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                    textViewStatus.setText("Calling2...");
                }
            }
        });

        buttonCall3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Intent callIntent = new Intent(Intent.ACTION_VIEW);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                    textViewStatus.setText("Calling3...");
                }
            }
        });
    }
}
