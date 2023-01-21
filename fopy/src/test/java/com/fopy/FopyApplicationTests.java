package com.fopy;

import com.fopy.util.Googletrans;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FopyApplicationTests {

	@Test
	void 구글_텍스트_번역() {
		Googletrans googletrans = new Googletrans();
		googletrans.translation("Hello world");
	}

}
