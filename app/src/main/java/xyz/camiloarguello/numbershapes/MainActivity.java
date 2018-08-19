package xyz.camiloarguello.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void checkNumber(View view){

        EditText userNumber = findViewById(R.id.inputNumberField);

        Number n = new Number();
        n.number = Integer.parseInt(userNumber.getText().toString());
        
        Log.i("---- NUMBER ---", String.valueOf(n.isTriangular()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
