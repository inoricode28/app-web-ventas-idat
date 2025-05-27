package pe.idat.app_web_ventas_idat.controller.backoffice;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.idat.app_web_ventas_idat.model.bd.Product;
import pe.idat.app_web_ventas_idat.model.request.ProductRequest;
import pe.idat.app_web_ventas_idat.model.response.ResultadoResponse;
import pe.idat.app_web_ventas_idat.service.ProductService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/backoffice/product")
public class ProductController {
    private ProductService productService;

    @GetMapping("")
    public String frmManProduct(Model model){
        model.addAttribute("listaproduct",
                productService.listarProductos());
        return "/backoffice/product/frmproduct";
    }

    @GetMapping("listar")
    @ResponseBody
    public List<Product>listarProductos(){
        return productService.listarProductos();
    }

    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarProducto(@RequestBody ProductRequest productRequest){
        return productService.guardarProducto(productRequest);
    }

}
