package com.codevscolor.recyclergridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<ImageObject> list = new ArrayList<>();

        list.add(new ImageObject(R.drawable.imageone,"image 1"));
        list.add(new ImageObject(R.drawable.imagetwo,"image 2"));
        list.add(new ImageObject(R.drawable.imagethree,"image 3"));
        list.add(new ImageObject(R.drawable.imagefour,"image 4"));
        list.add(new ImageObject(R.drawable.imagefive,"image 5"));
        list.add(new ImageObject(R.drawable.imagesix,"image 6"));
        list.add(new ImageObject(R.drawable.imageseven,"image 7"));
        list.add(new ImageObject(R.drawable.imageeight,"image 8"));
        list.add(new ImageObject(R.drawable.imagenine,"image 9"));
        list.add(new ImageObject(R.drawable.imageten,"image 10"));

        // 2. set layoutManger
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        // 3. create an adapter
        RecyclerAdapter mAdapter = new RecyclerAdapter(list,this);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
