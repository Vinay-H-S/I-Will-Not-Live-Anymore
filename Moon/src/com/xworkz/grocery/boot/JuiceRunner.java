package com.xworkz.grocery.boot;

import com.xworkz.grocery.app.repository.JuiceRepository;
import com.xworkz.grocery.app.repository.JuiceRepositoryimpl;
import com.xworkz.moon.app.service.JuiceService;
import com.xworkz.moon.app.service.JuiceServiceimpl;

public class JuiceRunner {

	public static void main(String[] args) {
		JuiceRepository juiceRepository = new JuiceRepositoryimpl();

		JuiceService juiceService = new JuiceServiceimpl(juiceRepository);
		juiceService.validateAndSave("Bindu Jeera");
	


	}

}
