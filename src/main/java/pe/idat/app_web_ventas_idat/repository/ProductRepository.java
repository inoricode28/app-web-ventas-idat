package pe.idat.app_web_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.idat.app_web_ventas_idat.model.bd.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
