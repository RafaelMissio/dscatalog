package br.com.missio.dscataslog.resources;

import br.com.missio.dscataslog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResources {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Books"));
        list.add(new Category(2L, "Computers"));
        list.add(new Category(3L, "Electronics"));
        list.add(new Category(4L, "Games"));

        return ResponseEntity.ok().body(list);
    }

}
