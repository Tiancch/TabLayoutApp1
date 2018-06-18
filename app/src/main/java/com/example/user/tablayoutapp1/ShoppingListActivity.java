package com.example.user.tablayoutapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class ShoppingListActivity extends AppCompatActivity {

    ListView mListView;
    String[] countryNames = {"Australia","Brazil","Canada","India","Mexico","Portugal","USA"};
    int[] countryFlags = {R.drawable.australia_flag, R.drawable.brazil_flag,R.drawable.canada_flag,R.drawable.india_flag,R.drawable.mexico_flag,R.drawable.portugal_flag,R.drawable.usa_flag};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.shopping_list);

            mListView = (ListView) findViewById(R.id.lvShoppingList);
            MyAdapter myAdapter = new MyAdapter(ShoppingListActivity.this, countryNames, countryFlags);
            mListView.setAdapter(myAdapter);
            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    Intent mIntent = new Intent(ShoppingListActivity.this, DetailActivity.class);
                    mIntent.putExtra("countryName", countryNames[i]);
                    mIntent.putExtra("countryFlag", countryFlags[i]);
                    startActivity(mIntent);
                }
            });

        }
    }

