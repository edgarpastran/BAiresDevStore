package simple.store.model.dao;

import org.springframework.stereotype.Repository;

import simple.store.model.entity.Producto;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoDAO.
 */
@Repository
public class ProductoDAO extends GenericDAO {

	/**
	 * Instantiates a new producto dao.
	 */
	public ProductoDAO() {
		super(Producto.class);
	}

}
