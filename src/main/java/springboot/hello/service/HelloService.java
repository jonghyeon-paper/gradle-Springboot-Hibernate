package springboot.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.hello.entity.Users;
import springboot.hello.repository.UserRepository;

@Service
public class HelloService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Users> getUserList() {
		return (List<Users>) userRepository.findAll();
	}
	
	public void addUserList() {
		// save a couple of customers
		userRepository.save(new Users("jack", "Jack Bauer", "1234!@#$", true));
		userRepository.save(new Users("chloe", "Chloe O'Brian", "1234!@#$", true));
		userRepository.save(new Users("kim", "Kim Bauer", "1234!@#$", true));
		userRepository.save(new Users("david", "David Palmer", "1234!@#$", true));
		userRepository.save(new Users("michelle", "Michelle Dessler", "1234!@#$", true));
	}

}
