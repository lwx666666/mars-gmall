package com.mars.gmall.pms;

import com.mars.gmall.pms.entity.Brand;
import com.mars.gmall.pms.entity.Product;
import com.mars.gmall.pms.service.BrandService;
import com.mars.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
	private ProductService productService;

    @Autowired
    private BrandService brandService;

	@Test
	public void productTest() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }

    @Test
    public void brandTest() {
//        Brand brand = new Brand();
//        brand.setName("mars-test001");
//        brandService.save(brand);
        System.out.println(brandService.getById(53).getName());
    }
}
