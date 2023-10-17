package com.training.adi;
import java.util.*;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {

	    List<Product> productsList = new ArrayList<>();
	    productsList.add(new Product(101,"Bat","Sports",1000));
	    productsList.add(new Product(101,"Bat","Sports",1000));
	    productsList.add(new Product(102,"Ball","Sports",90));
	    productsList.add(new Product(103,"Wits","Sports",1500));
	    productsList.add(new Product(104,"pads","Sports",1100));
	    productsList.add(new Product(105,"Car","Toys",900));
	    productsList.add(new Product(106,"Bike","Toys",6000));
	    productsList.add(new Product(107,"Arduino","Electronics",400));
	    productsList.add(new Product(108,"Raspi","Electronics",6500));
	    Stream <Product> productStream = productsList.stream();
	    Stream <Product> productsGtFiveHundredStream = productStream.filter(x->x.getPrice()>500);
	    System.out.println("After Removing Duplicates");
	    productsGtFiveHundredStream.distinct().forEach(System.out::println);
	    
	}
}
