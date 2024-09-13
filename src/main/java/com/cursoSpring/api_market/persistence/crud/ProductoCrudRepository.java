package com.cursoSpring.api_market.persistence.crud;

import com.cursoSpring.api_market.domain.Product;
import com.cursoSpring.api_market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //List<Product> findByCategory(int categoryId);
}
