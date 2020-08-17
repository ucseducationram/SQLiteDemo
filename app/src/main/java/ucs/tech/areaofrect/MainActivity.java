package ucs.tech.areaofrect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DataBaseHelper myDb;
    EditText txtName, txtSurName, txtMarks;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);

        txtName = (EditText) findViewById(R.id.idName);
        txtSurName = (EditText) findViewById(R.id.idSurname);
        txtMarks = (EditText) findViewById(R.id.idMarks);
        btnClick = (Button) findViewById(R.id.idBtn);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickMe();
            }
        });
    }
    private void ClickMe() {
        String name = txtName.getText().toString();
        String surname = txtSurName.getText().toString();
        String marks = txtMarks.getText().toString();
        Boolean result = myDb.insertData(name, surname, marks);
        if (result == true) {
            Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Data Insertion Failed", Toast.LENGTH_SHORT).show();
        }
    }

    public void display(View view) {
        Intent intent=new Intent(this,DisplaySql.class);
        startActivity(intent);
    }
}
