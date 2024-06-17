package es.davidrico.jakarta.carrocompra.servicios;

import es.davidrico.jakarta.carrocompra.modelos.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> porId(Long id);
}
