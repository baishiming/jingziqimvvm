package com.example.jingziqimvvm.viewmodel;

import com.example.jingziqimvvm.model.Board;
import com.example.jingziqimvvm.model.Player;


import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableField;

/**
 * @author bsm
 * @name jingziqimvvm
 * @class name：com.example.jingziqimvvm
 * @class describe
 * @time 2020/3/19 11:37
 */
public class JingZiQiViewModel {

    private Board model;

    public final ObservableArrayMap<String,String> cells = new ObservableArrayMap();
    public final ObservableField<String> winner = new ObservableField();

    public JingZiQiViewModel() {
        this.model = new Board();
    }

    public void onResetSelected(){
        model.restart();
        winner.set(null);
        cells.clear();
    }

    public void onClickedCellAt(int row,int col){
        Player player = model.mark(row,col);
        if(player!=null){
            cells.put(""+row + col,player == null ? null : player.toString());
            winner.set(model.getWiner() == null? null : model.getWiner().toString());
        }
    }


}
