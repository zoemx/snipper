package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//something like express
@RestController
public class snipperController {
    @GetMapping("/snippets")
    public List<CodeItem> getItems() {
        //return table
        return null;
    }
    }

