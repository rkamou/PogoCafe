package models;

import java.io.Serializable;

public class CounterIndexEntities implements Serializable {
    public Integer countCategories;
    public Integer countItems;
    public Integer countUsers;
    public Integer countCheckOuts;


    public CounterIndexEntities() {
        countCategories = 0;
        countItems = 0;
        countUsers = 0;
        countCheckOuts = 0;
    }

}
