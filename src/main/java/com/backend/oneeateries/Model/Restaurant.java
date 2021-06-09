package com.backend.oneeateries.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
public class Restaurant {
    @Id
    private String restaurantId;
    private String restaurantName;
    private String menuId;
    private String menuName;
    private List<MenuItem> menuItem;
    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId='" + restaurantId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuItem=" + menuItem +
                '}';
    }
}