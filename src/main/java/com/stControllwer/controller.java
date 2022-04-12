package com.stControllwer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
		@GetMapping("/m")
		public String m() {
			return "hello welcome in azure controller";
		}
}
