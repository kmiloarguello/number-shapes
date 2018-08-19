package xyz.camiloarguello.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkNumber(View view){

        // Get user input
        EditText userNumber = findViewById(R.id.inputNumberField);

        // Instance of class Number to create interaction of triangle and square number
        Number n = new Number();

        // parsing string into a number to check it.
        n.number = Integer.parseInt(userNumber.getText().toString());

        // Answer of program
        if(n.isSquare()){
            if (n.isTriangular()) {
                makeToast("It's a triangular and a square number.");
            }else{
                makeToast("It's a square number, but not a triangular.");
            }
        }else{
            if (n.isTriangular()) {
                makeToast("It's a triangular number but not a square.");
            }else{
                makeToast("It's neither a triangular nor square number.");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void makeToast(String message){
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }
}
