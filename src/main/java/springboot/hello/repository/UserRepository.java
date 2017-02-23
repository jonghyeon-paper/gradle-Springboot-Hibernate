package springboot.hello.repository;

import org.springframework.data.repository.CrudRepository;

import springboot.hello.entity.Users;

public interface UserRepository extends CrudRepository<Users, String> {

}
