package pe.idat.app_web_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.idat.app_web_ventas_idat.model.bd.Supplier;
import pe.idat.app_web_ventas_idat.repository.SupplierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierService {

    private SupplierRepository supplierRepository;

    public List<Supplier> listarProveedores(){
        return supplierRepository.findAll();
    }
}
