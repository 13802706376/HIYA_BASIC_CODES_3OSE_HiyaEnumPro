package com.hiya.se.enun;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumClient
{
    public static void main(String[] args)
    {
        for (HiyaEnun e : HiyaEnun.values())
        {
            System.out.println(e.toString());
        }

        HiyaEnun valTue = HiyaEnun.TUE;
        switch (valTue)
        {
        case MON:
            System.out.println("今天是星期一");
            break;
        case TUE:
            System.out.println("今天是星期二");
            break;
        // ... ...
        default:
            System.out.println(valTue);
            break;
        }

        // compareTo(E o)
        switch (valTue.compareTo(HiyaEnun.MON))
        {
        case -1:
            System.out.println("TUE 在 MON 之前");
            break;
        case 1:
            System.out.println("TUE 在 MON 之后");
            break;
        default:
            System.out.println("TUE 与 MON 在同一位置");
            break;
        }

        // getDeclaringClass()
        System.out.println("getDeclaringClass(): " + valTue.getDeclaringClass().getName());

        // name() 和 toString()
        System.out.println("name(): " + valTue.name());
        System.out.println("toString(): " + valTue.toString());

        // ordinal()， 返回值是从 0 开始
        System.out.println("ordinal(): " + valTue.ordinal());

        System.out.println("EnumTest.FRI 的 value = " + HiyaEnunParams.getByName("fgetrert"));
        HiyaEnunParams.NORMAL.getName();
        HiyaEnunParams.NORMAL.getDisplayName();

        EnumSet<HiyaEnunParams> stateSet = EnumSet.allOf(HiyaEnunParams.class);
        for (HiyaEnunParams s : stateSet)
        {
            System.out.println(s);
        }

        EnumMap<HiyaEnunParams, String> stateMap = new EnumMap<HiyaEnunParams, String>(HiyaEnunParams.class);
        stateMap.put(HiyaEnunParams.NORMAL, "is On");
        stateMap.put(HiyaEnunParams.SHOP_AGENT_NOT_EXIST, "is off");
        for (HiyaEnunParams s : HiyaEnunParams.values())
        {
            System.out.println(s.name() + ":" + stateMap.get(s));
        }
        
        System.out.println(HiyaSignleEnun.INSTANCE.nameList);
        System.out.println(HiyaSignleEnun.INSTANCE2.nameList);
        System.out.println(HiyaSignleEnun.INSTANCE2.getNameList());
        

    }

}
