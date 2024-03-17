package com.example.codestructures;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity13 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    MyViewPagerAdapter myViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        // Create an adapter for your ViewPager
        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), getLifecycle());

        // adding fragments

        myViewPagerAdapter.addFragment(new fragment13a());
        myViewPagerAdapter.addFragment(new fragment13b());




        viewPager.setAdapter(myViewPagerAdapter);


        // Connecting TabLayout with ViewPager
        new TabLayoutMediator(
                tabLayout,
                viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        if(position==0)
                        {
                            tab.setText("Explanation");
                        }
                        else{

                            tab.setText("Code");
                        }

                    }
                }
        ).attach();


    }
}
