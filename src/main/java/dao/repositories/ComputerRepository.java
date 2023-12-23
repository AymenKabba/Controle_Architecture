package dao.repositories;

import dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface ComputerRepository extends JpaRepository<Computer, Long > {
    Map<Object, Object> findByProce(String proce);

    Map<Object, Object> findByPrice(float price);

    Map<Object, Object> delete(int id);
}
