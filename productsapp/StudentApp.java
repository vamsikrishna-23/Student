package com.svk.productsapp;


import com.svk.services.StudentServicesImpl;

public class StudentApp {
public static void main(String[] args) {
	StudentServicesImpl service = new StudentServicesImpl();
	service.menu();
}
}
