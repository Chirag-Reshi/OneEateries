package com.backend.oneeateries.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@Getter @Setter
public class MenuItem {
    @Id
    private String itemID;
    private String itemName;
    private String description;
    private String price;

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}