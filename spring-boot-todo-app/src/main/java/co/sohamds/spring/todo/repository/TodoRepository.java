package co.sohamds.spring.todo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import co.sohamds.spring.todo.domain.Todo;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

    List<Todo> findAll();

    void save(Todo todo);

    void deleteById(long id);

    Optional<Todo> findById(long id);
}