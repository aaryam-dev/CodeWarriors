package com.example.codestructures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {


    // 1- AdapterView

    RecyclerView recyclerView;

    // 2- Data Source
    List<Item> itemList;

    // 3- Adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemList = new ArrayList<>();
        Item item1 = new Item(1, R.drawable.plus, "STL C++/Java Collections", "Lift up your sword and shield.");
        Item item2 = new Item(2, R.drawable.bigo, "Asymptotic Analysis O()", "The enemies' strength should be \nanalyzed - O()");
        Item item3 = new Item(3, R.drawable.recursion, "Recursion", "Learn. Practice. Solve. Repeat.");
        Item item4 = new Item(4, R.drawable.array, "Arrays", "To the front-line.");
        Item item5 = new Item(5, R.drawable.search, "Searching", "Enemy could be anywhere. \nStay focused.");
        Item item6 = new Item(6, R.drawable.sort, "Sorting", "Sort out the issues.");
        Item item7 = new Item(7, R.drawable.hashmap, "HashMap", "Can't fight anymore? \nUse HashMap.");
        Item item8 = new Item(8, R.drawable.stack, "Stacks", "Last In First Out. Defeat them all.");
        Item item9 = new Item(9, R.drawable.queue, "Queues", "Enemy warriors come and go.");
        Item item10 = new Item(10, R.drawable.linkedlist, "Linked Lists", "Keep your soldiers close.");
        Item item11 = new Item(11, R.drawable.tree, "Trees", "Win after win.");
        Item item12 = new Item(12, R.drawable.bst, "Binary Search Trees (BST)", "Inorder traversal is in ascending \norder.");
        Item item13 = new Item(13, R.drawable.graph, "Graphs", "Congrats. You made it!");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);
        itemList.add(item11);
        itemList.add(item12);
        itemList.add(item13);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter((ArrayList<Item>) itemList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setClickListener(this);
    }

    @Override
    public void onCLick(View v, int pos) {
        Toast.makeText(this,
                "Welcome to: " + itemList.get(pos).getItemName(),
                Toast.LENGTH_SHORT).show();


        if (pos == 0) {
            Intent intent1 = new Intent(MainActivity.this, MainActivity1.class);
            startActivity(intent1);

        } else if (pos == 1) {
            Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent2);

        } else if (pos == 2) {
            Intent intent3 = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent3);

        } else if (pos == 3) {
            Intent intent4 = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(intent4);

        } else if (pos == 4) {
            Intent intent5 = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(intent5);
        }
        else if (pos == 5) {
            Intent intent6 = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(intent6);

        }
        else if (pos == 6) {
            Intent intent7 = new Intent(MainActivity.this, MainActivity7.class);
            startActivity(intent7);

        }
        else if (pos == 7) {
            Intent intent8 = new Intent(MainActivity.this, MainActivity8.class);
            startActivity(intent8);

        }
        else if (pos == 8) {
            Intent intent9 = new Intent(MainActivity.this, MainActivity9.class);
            startActivity(intent9);

        }
        else if (pos == 9) {
            Intent intent10 = new Intent(MainActivity.this, MainActivity10.class);
            startActivity(intent10);

        }
        else if (pos == 10) {
            Intent intent11 = new Intent(MainActivity.this, MainActivity11.class);
            startActivity(intent11);

        } else if (pos == 11) {
            Intent intent12 = new Intent(MainActivity.this, MainActivity12.class);
            startActivity(intent12);

        }
        else if (pos == 12) {
            Intent intent13 = new Intent(MainActivity.this, MainActivity13.class);
            startActivity(intent13);

        }

        }


    }






