package com.solutions.ef.functions;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class EFunctions {
    public static void setText(@NonNull TextView tv, @Nullable String string){
        if(string == null){
            tv.setText("");
        }else {
            tv.setText(string);
        }

    }
}
