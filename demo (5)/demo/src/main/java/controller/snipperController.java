package controller;

public class snipperController {
    @GetMapping("/items")
    public List<CodeItem> getItems() {
        //return table
        return snippets;
    }
    }
}
