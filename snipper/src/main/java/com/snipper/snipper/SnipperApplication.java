package com.snipper.snipper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SnipperApplication {
	 private List<CodeItem> code = new ArrayList<>(List.of(
            new CodeItem(1, "Python", "print('Hello, World!')"),
            new CodeItem(2, "Python", "def add(a, b):\n    return a + b")
            
    ));

	@GetMapping("/items")
    public List<CodeItem> getItems() {
        return code;
    }
	@PostMapping("/item")
    public List<CodeItem> addItem(@RequestBody CodeItem newItem) {
        code.add(newItem);
        return code;
    }


class CodeItem {
    private int id;
    private String language;
    private String code;

    // Getters and setters for id, language, and code
	public CodeItem(int id, String language, String code) {
        this.id = id;
        this.language = language;
        this.code = code;
    }
	public int getId() {
    return id;
}
}
 public static void main(String[] args) {
        SpringApplication.run(SnipperApplication.class, args);
    }

}
