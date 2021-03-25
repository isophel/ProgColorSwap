package must.ac.ug.csce.Isophel.IsophelProgColorSwap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button tapmebtn = new Button(this);
        tapmebtn.setText("Tap Me!");
        tapmebtn.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
       int  ButtonWidth = tapmebtn.getMeasuredWidth();


        TextView taptext = new TextView(this);
        taptext.setText("Tap here to Change Colour!");

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams. MATCH_PARENT ,
                LinearLayout.LayoutParams. WRAP_CONTENT ) ;

        LinearLayout.LayoutParams blayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams. WRAP_CONTENT ,
                LinearLayout.LayoutParams. WRAP_CONTENT ) ;
        layoutParams.setMargins( 150 , 20 , 30 , 0 ) ;
        blayoutParams.setMarginStart(400);

        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        linear.addView(taptext,layoutParams);
        linear.addView(tapmebtn,blayoutParams);
        setContentView(linear);

        final Random random= new Random();
        tapmebtn.setOnClickListener(v -> {
            float red= random.nextFloat();

            float green= random.nextFloat();
            float blue= random.nextFloat();
            taptext.setText("r"+String.valueOf(red)+"   g"+String.valueOf(green+" b"+String.valueOf(blue)  ));
            taptext.setTextColor(Color.rgb(red,green,blue));


        });





    }
}