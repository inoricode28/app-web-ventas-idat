package pe.idat.app_web_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.idat.app_web_ventas_idat.model.bd.Category;
import pe.idat.app_web_ventas_idat.model.bd.Product;
import pe.idat.app_web_ventas_idat.model.bd.Supplier;
import pe.idat.app_web_ventas_idat.model.request.ProductRequest;
import pe.idat.app_web_ventas_idat.model.response.ResultadoResponse;
import pe.idat.app_web_ventas_idat.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> listarProductos(){
        return productRepository.findAll();
    }

    public ResultadoResponse guardarProducto(ProductRequest productRequest){
        String mensaje = "Producto registrado correctamente";
        Boolean respuesta = true;
        try {
            Product product = new Product();
            if(productRequest.getProductid() > 0){
                product.setProductid(productRequest.getProductid());
            }
            product.setProductname(productRequest.getProductname());
            product.setUnitprice(productRequest.getUnitprice());
            Boolean discontinued = false;
            if(productRequest.getDiscontinued()!=null){
                discontinued = true;
            }
            product.setDiscontinued(discontinued);
            Category category = new Category();
            category.setCategoryid(productRequest.getCategoryid());
            Supplier supplier = new Supplier();
            supplier.setSupplierid(productRequest.getSupplierid());
            product.setCategory(category);
            product.setSupplier(supplier);
            productRepository.save(product);
            
        }catch (Exception ex){
            mensaje = "Producto no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
