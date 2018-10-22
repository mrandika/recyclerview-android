package org.andika.recyclerku;

import java.util.ArrayList;

public class ItemDummy {
    public static String[][] data = new String[][] {
            {
                "https://mrandika.github.io/img/profile.jpg",
                    "Item 1",
                    "Ini adalah test Item pertama"
            },
            {
                "https://mrandika.github.io/img/profile.jpg",
                    "Item 2",
                    "Ini adalah test Item kedua"
            },
            {
                "https://mrandika.github.io/img/profile.jpg",
                    "Item 3",
                    "Ini adalah test Item ketiga"
            }
    };

    public static ArrayList<ItemModel>getAllData() {
        ItemModel model = null;
        ArrayList<ItemModel> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            model = new ItemModel();
            model.setImage(data[i][0]);
            model.setText(data[i][1]);
            model.setDesc(data[i][2]);

            list.add(model);
        }
        return list;
    }
}
