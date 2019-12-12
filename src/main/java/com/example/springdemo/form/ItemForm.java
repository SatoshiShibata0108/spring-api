package com.example.springdemo.form;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ItemForm implements Serializable {

    @NotNull
    private Integer itemId;

    public void setItemId(Integer id){
        this.itemId = id;
    }

    public Integer getItemId(){
        return itemId;
    }
}
