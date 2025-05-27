package pe.idat.app_web_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.idat.app_web_ventas_idat.model.bd.Category;
import pe.idat.app_web_ventas_idat.repository.CategoryRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<Category> listarCategorias(){
        return categoryRepository.findAll();
    }
}
