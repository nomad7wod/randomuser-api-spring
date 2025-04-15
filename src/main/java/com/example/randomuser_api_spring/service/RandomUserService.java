package com.example.randomuser_api_spring.service;

import com.example.randomuser_api_spring.model.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

@Service
public class RandomUserService {

    private final String API_URL = "https://randomuser.me/api/?results=10";

    public List<UserDTO> getUsuarios() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(API_URL, String.class);

        JSONObject json = new JSONObject(response);
        JSONArray results = json.getJSONArray("results");

        List<UserDTO> usuarios = new ArrayList<>();

        for (int i = 0; i < results.length(); i++){
            JSONObject user = results.getJSONObject(i);

            String nombre = user.getJSONObject("name").getString("first") + " " + user.getJSONObject("name").getString("last");

            String genero = user.getString("gender");

            String ubicacion = user.getJSONObject("location").getString("city") + " " + user.getJSONObject("location").getString("country");


            String correo = user.getString("email");

            String fechaNacimiento = user.getJSONObject("dob").getString("date");

            String fotografia = user.getJSONObject("picture").getString("large");

            usuarios.add(new UserDTO(nombre, genero, ubicacion, correo, fechaNacimiento, fotografia));
        }

        return usuarios;


    }
}
