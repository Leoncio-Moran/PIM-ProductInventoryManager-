/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author S-Developers
 */
public class UserService {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<String> getUser() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("data/Users.json")));
            return Arrays.asList(gson.fromJson(json, String[].class));
        } catch (Exception e) {}
        
        return Collections.emptyList();
    }
}
