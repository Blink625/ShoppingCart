package com.ethoca.ShoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);

		List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);

		List<Integer> evens = values.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());

		for (int i : evens) {
			System.out.println(i);
		}

	}

}
