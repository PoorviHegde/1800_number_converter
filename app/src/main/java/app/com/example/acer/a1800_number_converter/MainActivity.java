package app.com.example.acer.a1800_number_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

      String a ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        final EditText editText=(EditText)findViewById(R.id.editText);
        final EditText editText2=(EditText)findViewById(R.id.editText2);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            a= editText.getText().toString();
                a= a.replace('A','2');
                a= a.replace('B','2');
                a= a.replace('C','2');
                a= a.replace('D','3');
                a= a.replace('E','3');
                a= a.replace('F','3');
                a= a.replace('G','4');
                a= a.replace('H','4');
                a= a.replace('I','4');
                a= a.replace('J','5');
                a= a.replace('K','5');
                a= a.replace('L','5');
                a= a.replace('M','6');
                a= a.replace('N','6');
                a= a.replace('O','6');
                a= a.replace('P','7');
                a= a.replace('Q','7');
                a= a.replace('R','7');
                a= a.replace('S','7');
                a= a.replace('T','8');
                a= a.replace('U','8');
                a= a.replace('V','8');
                a= a.replace('W','9');
                a= a.replace('X','9');
                a= a.replace('Y','9');
                a= a.replace('Z','9');
            editText2.setText(a);









            }
        });




    }
















}
