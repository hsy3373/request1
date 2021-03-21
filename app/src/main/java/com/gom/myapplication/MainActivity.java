package com.gom.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    private List<User> users = new ArrayList<>();
    private List<UserTest> usersTest = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        ;

        for (int i = 0; i < 100; i++) {
            users.add(new User("user" + i, (int)(Math.random()*10000)+1));
        }

        Collections.sort(users, new NoDescCompare());

        for(int i=0; i < users.size(); i++) {
            User user = users.get(i);
            usersTest.add( new UserTest(user, i+1));
        }


        setRecyclerView();
    }

    private void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                RecyclerView.VERTICAL,
                false
        ));
        userAdapter = new UserAdapter(this, usersTest);
        recyclerView.setAdapter(userAdapter);
    }

    static class NoDescCompare implements Comparator<User> {

        @Override
        public int compare(User arg0, User arg1) {
            // TODO Auto-generated method stub
            return arg0.getMoney() > arg1.getMoney() ? -1 : arg0.getMoney() < arg1.getMoney() ? 1:0;
        }

    }




}