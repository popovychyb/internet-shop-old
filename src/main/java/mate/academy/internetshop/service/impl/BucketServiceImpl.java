package mate.academy.internetshop.service.impl;

import mate.academy.internetshop.dao.BucketDao;
import mate.academy.internetshop.dao.ProductDao;
import mate.academy.internetshop.lib.Service;
import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.service.BucketService;

@Service
public class BucketServiceImpl implements BucketService {
    private BucketDao bucketDao;
    private ProductDao productDao;

    @Override
    public Bucket addItem(Long bucketId, Long productId) {
        Bucket bucket = bucketDao.get(bucketId);
        Product product = productDao.get(productId).get();
        bucket.getProducts().add(product);
        return bucketDao.update(bucket);
    }
}
