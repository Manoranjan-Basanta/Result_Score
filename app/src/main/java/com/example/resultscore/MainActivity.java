package com.example.resultscore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.BreakIterator;

import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

public class MainActivity extends AppCompatActivity {
   TextView liverPercentage,lipidPercentage,kidneyPercentage,lungFunction,diabetes,txtColor;
    double percentageIncrease=80;
     double liverPercentage1=33;
     double lipidPercentage1=55;
     double kidneyPercentage1=33;
     double lungFunction1=60;
     double diabetes1=54;
    private static final String DEFAULT_PROGRESS_COLOR = "#3F51B5";
    private static final String DEFAULT_PROGRESS_BACKGROUND_COLOR = "#00A36C";
   // private static final Object DEFAULT_STROKE_WIDTH_DP = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularProgressIndicator circularProgressIndicator=findViewById(R.id.circular_progress);
        circularProgressIndicator.setMaxProgress(100);
        circularProgressIndicator.setCurrentProgress(30);
        circularProgressIndicator.setProgress(40, 100);
        CircularProgressIndicator circularProgressIndicator10=findViewById(R.id.circular_progress1);
       // circularProgressIndicator.setTextColor();
       circularProgressIndicator.setProgressColor(30);
      circularProgressIndicator.getProgressBackgroundColor();


      //  String stringValue = Double.toString(percentageIncrease);
      //  String stringValue1 = String.format("%.0f%%", percentageIncrease);
       // circularProgressIndicator.setText(stringValue1);


       // circularProgressIndicator.setProgressBackgroundColor();
      //  circularProgressIndicator.getProgressBackgroundColor();

        String hexColor = "#00A36C";
        int colorInt = Color.parseColor(hexColor);
        circularProgressIndicator.setProgressBackgroundColor(colorInt);
        circularProgressIndicator.getProgressBackgroundColor();
        circularProgressIndicator.setShouldDrawDot(true);


        CircularProgressIndicator circularProgressIndicator1=findViewById(R.id.circular_progress1);
        circularProgressIndicator1.setMaxProgress(100);
        circularProgressIndicator1.setCurrentProgress(33);
        String hexColor1="#E64C3C";
        int colorInt1=Color.parseColor(hexColor1);
        circularProgressIndicator1.setProgressBackgroundColor(colorInt1);
        circularProgressIndicator1.getProgressBackgroundColor();


        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CircularProgressIndicator circularProgressIndicator2=findViewById(R.id.circular_progress2);
        circularProgressIndicator2.setMaxProgress(100);
        circularProgressIndicator2.setCurrentProgress(33);

        String hexColor2="#F0C419";
        int colorInt2=Color.parseColor(hexColor2);
        circularProgressIndicator2.setProgressBackgroundColor(colorInt2);
        circularProgressIndicator2.getProgressBackgroundColor();


        CircularProgressIndicator circularProgressIndicator3=findViewById(R.id.circular_progress3);
        circularProgressIndicator3.setMaxProgress(100);
        circularProgressIndicator3.setCurrentProgress(33);

        String hexColor3="#F0C419";
        int colorInt3=Color.parseColor(hexColor3);
        circularProgressIndicator3.setProgressBackgroundColor(colorInt3);
        circularProgressIndicator3.setCurrentProgress(33);



        CircularProgressIndicator circularProgressIndicator4=findViewById(R.id.circular_progress4);
        circularProgressIndicator4.setMaxProgress(100);
        circularProgressIndicator4.setCurrentProgress(33);

        String hexColor4="#35BE83";
        int colorInt4=Color.parseColor(hexColor4);
        circularProgressIndicator4.setProgressBackgroundColor(colorInt4);
        circularProgressIndicator4.setCurrentProgress(33);

     CircularProgressIndicator circularProgressIndicator5=findViewById(R.id.circular_progress5);
     circularProgressIndicator5.setMaxProgress(100);
     circularProgressIndicator5.setCurrentProgress(33);


     String hexColor5="#35BE83";
     int colorInt5=Color.parseColor(hexColor5);
     circularProgressIndicator5.setProgressBackgroundColor(colorInt5);


        liverPercentage=(TextView) findViewById(R.id.txt_liver_percentage);
        String stringValue = Double.toString(liverPercentage1);
        String stringValue1 = String.format("%.0f%%", liverPercentage1);
        liverPercentage.setText(stringValue1);


        lipidPercentage=(TextView) findViewById(R.id.txt_lipid_percentage);
        String stringValue2=Double.toString(lipidPercentage1);
        String stringValue3=String.format("%.0f%%",lipidPercentage1);
        lipidPercentage.setText(stringValue3);


        kidneyPercentage=(TextView) findViewById(R.id.txt_kidney_function);
        String stringValue4=Double.toString(kidneyPercentage1);
        String stringValue5=String.format("%.0f%%",kidneyPercentage1);
        kidneyPercentage.setText(stringValue3);

        lungFunction=(TextView) findViewById(R.id.txt_lungs_percentage);
        String stringValue6=Double.toString(lungFunction1);
        String stringValue7=String.format("%.0f%%",lungFunction1);
        lungFunction.setText(stringValue7);



        diabetes=(TextView) findViewById(R.id.txt_diabetes_percentage);
        String stringValue8=Double.toString(diabetes1);
        String stringValue9=String.format("%.0f%%",diabetes1);
        kidneyPercentage.setText(stringValue9);







    }
    private void init(@NonNull Context context, @Nullable AttributeSet attrs) {

        int progressColor = Color.parseColor(DEFAULT_PROGRESS_COLOR);
        int progressBackgroundColor = Color.parseColor(DEFAULT_PROGRESS_BACKGROUND_COLOR);
        int textColor = progressColor;
    }
}