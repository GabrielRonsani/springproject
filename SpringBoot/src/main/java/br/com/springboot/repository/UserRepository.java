package br.com.springboot.repository;

import br.com.springboot.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, Long> {



}
