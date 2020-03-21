package com.example.jingziqimvvm.view;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.example.jingziqimvvm.R;
import com.example.jingziqimvvm.databinding.ActivityMainBinding;
import com.example.jingziqimvvm.model.Board;
import com.example.jingziqimvvm.model.Player;
import com.example.jingziqimvvm.viewmodel.JingZiQiViewModel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getName();
    private JingZiQiViewModel viewModel = new JingZiQiViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewDataBinding.setViewModel(viewModel);
        viewModel.onResetSelected();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_jingziqi,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_reset){
            viewModel.onResetSelected();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
