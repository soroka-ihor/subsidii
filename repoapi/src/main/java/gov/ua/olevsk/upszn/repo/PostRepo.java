package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Integer> {
    List<Post> findById(int id);
}
