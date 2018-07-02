//package ftc.shift.sample.api;
//
//
//import ftc.shift.sample.models.Book;
//import ftc.shift.sample.books.CardService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Collection;
//
//@RestController
//public class BooksController {
//
//    private CardService service = new CardService();
//
//    @GetMapping("/cards/{id}")
//    public @ResponseBody
//    Book readCard(@PathVariable String id) {
//        Book book = service.provideCard(id);
//        if (null == book){
//            throw new ResourceNotFoundException();
//        }
//        return book;
//    }
//
//    @GetMapping("/cards")
//    public @ResponseBody
//    Collection<Book> listCard() {
//        return service.provideCards();
//    }
//
//    @PostMapping("/cards")
//    public @ResponseBody
//    Book createCard(@RequestBody Book book) {
//        return service.createCard(book);
//    }
//
//    @DeleteMapping("/cards/{id}")
//    public @ResponseBody
//    void deleteCard(@PathVariable String id) {
//        service.deleteCard(id);
//    }
//
//    @PutMapping("/cards/{id}")
//    public @ResponseBody
//    Book updateCard(@PathVariable String id, @RequestBody Book book) {
//        return service.updateCard(book);
//    }
//
//}