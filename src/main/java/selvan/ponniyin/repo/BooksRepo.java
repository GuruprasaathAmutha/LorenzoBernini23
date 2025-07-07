package selvan.ponniyin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import selvan.ponniyin.dto.Books;

public interface BooksRepo extends JpaRepository<Books,Integer> {
}
