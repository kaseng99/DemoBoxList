package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvColour;
    ArrayList<Box> alColourList;
    CustomAdapter caColour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvColour = findViewById(R.id.listViewBox);

        alColourList = new ArrayList<>();

        Box item1 = new Box("Blue");
        Box item2 = new Box("Orange");
        Box item3 = new Box("Brown");

        alColourList.add(item1);
        alColourList.add(item2);
        alColourList.add(item3);

        caColour = new CustomAdapter(MainActivity.this,R.layout.row, alColourList);

        lvColour.setAdapter(caColour);
    }
}
