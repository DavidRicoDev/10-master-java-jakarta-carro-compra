package es.davidrico.jakarta.carrocompra.servicios;

import es.davidrico.jakarta.carrocompra.modelos.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService{
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000));
    }

    @Override
    public Optional<Producto> porId(Long id) {
        return listar().stream().filter(p -> p.getId().equals(id)).findAny();
    }
}
