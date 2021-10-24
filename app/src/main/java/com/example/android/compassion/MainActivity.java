package com.example.android.compassion;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StaggeredGridLayoutManager staggeredGridLayoutManager;
    CardContentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RecycleView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        adapter = new CardContentAdapter(cardlist());
        recyclerView.setAdapter(adapter);


        //Navigation Drawer

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenNav, R.string.CloseNav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }


    //Notification Override
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notif_menu, menu);
        return true;
    }


    //Input List
    public ArrayList<CardContent> cardlist() {

        ArrayList<CardContent> list = new ArrayList<>();

        list.add(new CardContent("newspons", "Reagale", R.drawable.new_spons));
        list.add(new CardContent("bday", "Johanna", "Birthday in 2 months"));
        list.add(new CardContent("article", "How to use Amazon Smile and give as you live", R.drawable.title_img));
        list.add(new CardContent("weather", "Weybridge", "Peru"));
        list.add(new CardContent("anni", "Sergio", "3 years of sponsorship", R.drawable.title_img));
        list.add(new CardContent("newpic", "Sergio", R.drawable.pic1));
        list.add(new CardContent("thankyou", "5 gifts given this year"));
        list.add(new CardContent("pray", "Sergio", "Give thanks that Sergio recieves regular home visits from caring project staff."));
        list.add(new CardContent("video", "Join our Togo Ghans Insight Trip", R.drawable.title_img));

        return list;
    }

}