//package ftc.shift.sample.books;
//
//import ftc.shift.sample.models.Book;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//public class CardService {
//
//    private Map<String, Book> cardCache = new HashMap<>();
//
//    public CardService() {
//        cardCache.put("1", new Book("1", "Накопительная карта", "VISA", "*1114"));
//        cardCache.put("2", new Book("2", "Зарплатная карта", "MASTERCARD", "*8888"));
//    }
//
//    Book provideCard (String id) {
//        return cardCache.get(id);
//    }
//
//    Book updateCard (Book book) {
//        cardCache.put(book.getId(), book);
//        return book;
//    }
//
//    void deleteCard (String id) {
//        cardCache.remove(id);
//    }
//
//
//    Book createCard (Book book) {
//        book.setId(String.valueOf(System.currentTimeMillis()));
//        cardCache.put(book.getId(), book);
//        return book;
//    }
//
//    Collection<Book> provideCards () {
//        return cardCache.values();
//    }
//
//}
