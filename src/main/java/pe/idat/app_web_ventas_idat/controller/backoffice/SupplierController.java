package pe.idat.app_web_ventas_idat.controller.backoffice;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.idat.app_web_ventas_idat.model.bd.Supplier;
import pe.idat.app_web_ventas_idat.service.SupplierService;
import java.util.List;


@AllArgsConstructor
@Controller
@RequestMapping("/backoffice/supplier")
public class SupplierController {

    private SupplierService supplierService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Supplier> listarProveedores(){
        return supplierService.listarProveedores();
    }
}
