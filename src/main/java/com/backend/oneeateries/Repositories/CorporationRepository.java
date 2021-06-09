package com.backend.oneeateries.Repositories;

import com.backend.oneeateries.Model.Corporation;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.types.ObjectId;

@Service
public class CorporationRepository {


    //List of Corporation
    public List<Corporation> corporationList = new ArrayList<Corporation>();
    //Adding Corporation to the List
    public String addCorporation(Corporation corporation){
        //a unique 24-byte hexadecimal string
        corporation.setCorporationID(ObjectId.get().toHexString());
        return corporation.toString();
    }
    //Get Corporation by ID
    public Corporation corporationById(String corporationID){
        return corporationList
                .stream()                                                 //Need for processing data
                .filter(cor -> cor.getCorporationID().equals(corporationID))// Filtering a Corporation using id
                .collect(Collectors.toList()).get(0);                     // used to process stream
    }

}