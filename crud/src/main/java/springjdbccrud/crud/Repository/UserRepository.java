package springjdbccrud.crud.Repository;

import org.springframework.data.repository.CrudRepository;

import springjdbccrud.crud.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
