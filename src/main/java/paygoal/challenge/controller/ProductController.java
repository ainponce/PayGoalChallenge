package paygoal.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import paygoal.challenge.model.Product;
import paygoal.challenge.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/crearProducto")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product producto = productService.createProduct(product);

        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/eliminarProducto/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        Product producto = productService.getProduct(id);

        if (producto != null) {
            productService.deleteProduct(id);
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/actualizarProducto")
    public ResponseEntity<Product> updateProduct(@RequestBody Product updatedProduct) {
        Product updatedProductResult = productService.updateProduct(updatedProduct);

        if (updatedProductResult != null) {
            return ResponseEntity.ok(updatedProductResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/ordenarPorPrecio")
    public ResponseEntity<List<Product>> getAllProductsOrderedByPrice() {
        List<Product> products = productService.findAllByOrderByPriceAsc();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/obtenerProducto/{idOrName}")
    public ResponseEntity<Product> getProduct(@PathVariable String idOrName) {
        Product producto = null;

        try {
            Long id = Long.parseLong(idOrName);
            producto = productService.getProduct(id);
        } catch (NumberFormatException e) {
            producto = productService.getProductByName(idOrName);
        }

        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
