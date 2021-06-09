package com.backend.oneeateries.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter @Setter
public class Corporation {
    @Id
    private String corporationID;
    private String corporationName;
    @Override
    public String toString(){
        return "Corporation{" +
                "corporationID='" + corporationID + '\''+
                ", corporationName='" + corporationName +
                '}';
    }
}