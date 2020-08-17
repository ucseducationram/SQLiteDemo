package ucs.tech.areaofrect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    String s1,s2,s3,s4,s5,sub;
    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(TextView) findViewById(R.id.t6);

        s1 = getIntent().getExtras().getString("name");
        s2 = getIntent().getExtras().getString("add");
        s3 = getIntent().getExtras().getString("mob");
        s4 = getIntent().getExtras().getString("email");
        s5 = getIntent().getExtras().getString("gender");
        sub = getIntent().getExtras().getString("subject");

        t1.setText("Name : "+s1);
        t2.setText("Address : "+s2);
        t3.setText("Mobile : "+s3);
        t4.setText("Email : "+s4);
        t5.setText("gender :"+s5);
        t6.setText("Subject :"+sub);
    }
}