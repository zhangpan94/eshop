package cn.yuso.core.service.product;

import cn.yuso.core.bean.product.Brand;
import cn.yuso.core.dao.product.BrandDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 品牌事务
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandDao {
    @Override
    @Transactional(readOnly = true)
    public List<Brand> getBrandListWithPage() {

        return null;
    }
}
