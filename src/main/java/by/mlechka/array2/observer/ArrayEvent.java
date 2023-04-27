package by.mlechka.array2.observer;

import by.mlechka.array2.model.DataArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject{

    public ArrayEvent(DataArray dataArray){
        super(dataArray);
    }

    @Override
    public DataArray getSource(){
        return (DataArray) super.getSource();
    }

}
