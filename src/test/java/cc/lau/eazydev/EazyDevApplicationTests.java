package cc.lau.eazydev;

import cc.lau.eazydev.biz.entity.admin.AdminUser;
import cc.lau.eazydev.core.utils.JsonUtil;
import org.junit.Test;

import java.lang.reflect.Field;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EazyDevApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		AdminUser adminUser = new AdminUser();
		for (Field field : adminUser.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			System.out.println(JsonUtil.toJson(field.getType()));
			System.out.println(JsonUtil.toJson(field.getGenericType()));
		}

	}

}
