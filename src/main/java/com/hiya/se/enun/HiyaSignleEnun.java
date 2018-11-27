package com.hiya.se.enun;

import java.util.ArrayList;
import java.util.List;

public enum HiyaSignleEnun
{
    INSTANCE,INSTANCE2;
    
    public List<String> nameList;
    
     HiyaSignleEnun()
    {
         nameList = new ArrayList<>();
         nameList.add("WADE");
    }

    public List<String> getNameList()
    {
        return nameList;
    }

    public void setNameList(List<String> nameList)
    {
        this.nameList = nameList;
    }
}
