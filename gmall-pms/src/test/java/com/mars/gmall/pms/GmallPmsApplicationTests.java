package com.mars.gmall.pms;

import com.mars.gmall.pms.entity.Brand;
import com.mars.gmall.pms.entity.Product;
import com.mars.gmall.pms.service.BrandService;
import com.mars.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
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
        log.info(brandService.getById(53).getName());
//        Brand brand = new Brand();
//        brand.setName("mars-test001");
//        brandService.save(brand);
    }
}
