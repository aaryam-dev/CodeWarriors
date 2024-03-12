package com.example.codestructures;

import android.view.View;

public interface ItemClickListener {

    default void onCLick(View v, int pos){

    }
}
