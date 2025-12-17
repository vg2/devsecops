package za.co.entelect.bootcamp.devsecops.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LibraryController {

    private final BookRepository repository;

    public LibraryController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listBooks", repository.findAll());
        model.addAttribute("newBook", new Book()); // For the form
        return "index"; // Looks for index.html
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute("newBook") Book book) {
        repository.save(book);
        return "redirect:/";
    }
}