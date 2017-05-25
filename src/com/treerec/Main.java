package com.treerec;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        TreeItem mieszko = new TreeItem("Mieszko I");
        TreeItem bolek = new TreeItem("Bolesław Chrobry");
        TreeItem sygryda = new TreeItem("Sygryda Storråda");

        TreeItem bezprym = new TreeItem("bezprym");
        TreeItem regelinda = new TreeItem("Regelinda");
        TreeItem mieszko2 = new TreeItem("Mieszko II Lambert");

        TreeItem kazik = new TreeItem("Kazimierz Odnowiciel");
        TreeItem gertruda = new TreeItem("Gertruda");

        HashSet<TreeItem> mieszkoChildren = new HashSet<TreeItem>();
        mieszkoChildren.add(bolek);
        mieszkoChildren.add(sygryda);
        mieszko.setChildren(mieszkoChildren);

        HashSet<TreeItem> bolekChildren = new HashSet<TreeItem>();
        bolekChildren.add(mieszko2);
        bolekChildren.add(regelinda);
        bolekChildren.add(bezprym);
        bolek.setChildren(bolekChildren);

        HashSet<TreeItem> mieszko2Children = new HashSet<TreeItem>();
        mieszko2Children.add(kazik);
        mieszko2Children.add(gertruda);
        mieszko2.setChildren(mieszko2Children);

        printTreeItem(mieszko);

    }

    public static void printTreeItem(TreeItem item) {
        System.out.println(item.getData());

        if(item.getChildren() != null) {
            Iterator iterator = item.getChildren().iterator();
            while(iterator.hasNext()) {
                printTreeItem((TreeItem) iterator.next());
            }
        }
    }
}
