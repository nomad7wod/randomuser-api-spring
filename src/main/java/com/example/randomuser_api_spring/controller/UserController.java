package com.example.randomuser_api_spring.controller;

import com.example.randomuser_api_spring.model.UserDTO;
import com.example.randomuser_api_spring.service.RandomUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/personas")
@Tag(name = "Usuarios", description = "API para obtener a los 10 usuarios")

public class UserController {

    private final RandomUserService randomUserService;

    @Autowired
    public UserController(RandomUserService randomUserService) {
        this.randomUserService = randomUserService;
    }
    @Operation(summary = "Obtener un listado de 10 personas ")
    @GetMapping
    public List<UserDTO> getUsuarios(){
        return randomUserService.getUsuarios();
    }


}
