package com.sena.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestActor {
@Autowired
BookRepository repo;


@GetMapping("/ping")
public String  hola(){
    return "On line";
}

@GetMapping("/libros")
public List<Book>  listarLibros(){
    return repo.findAll();
}   

}
