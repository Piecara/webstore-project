package com.dwsj.webstore.product.repository;

/*
@Repository
public class ProductRepositoryImpl implements ProductRepository  {





    private Product createProduct(Object[] object) {
        Product product = new Product();
        product.setId(((BigDecimal)object[0]).intValue());
        product.setName(((String)object[1]));
        product.setCategory(((String)object[2]));
        product.setDescription((String)object[3]);
        product.setInStock(((BigDecimal)object[4]).intValue());
        product.setSold(((BigDecimal)object[5]).intValue());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
        EntityManager em = emf.createEntityManager();
        //TypedQuery<Product> query =  em.createQuery("SELECT p FROM Product p", Product.class);
        Query query = em.createNativeQuery("SELECT * FROM Product");

        List<Object[]> rows = query.getResultList();

        List<Product> resultList = new ArrayList<>();

        for (Object[] obj: rows){
            resultList.add(createProduct(obj));
        }
        return resultList;

    }



}
*/