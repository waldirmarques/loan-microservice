package br.com.biblioteca.loan.feign;

import br.com.biblioteca.loan.loan.BookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(contextId = "GetBook", url = "http://localhost:9092/v1/api/book", name = "book-user")
public interface GetBook {

    @GetMapping(value = "/getBookSpecificId/{id}")
    BookDTO bookId(@PathVariable String id);

    @GetMapping(value = "/getAllLoanSpecificId/{id}")
    List<BookDTO> bookAllId(@PathVariable String id);
}
