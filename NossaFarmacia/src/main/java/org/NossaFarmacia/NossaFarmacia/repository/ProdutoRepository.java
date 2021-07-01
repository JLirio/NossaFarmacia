package org.NossaFarmacia.NossaFarmacia.repository;


	import java.util.List;

	import org.NossaFarmacia.NossaFarmacia.model.Produto;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository 
	public interface ProdutoRepository extends JpaRepository<Produto,Long>{
		
		
		public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
		
	}

