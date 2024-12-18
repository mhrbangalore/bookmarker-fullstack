package com.mohan.bookmarks_api_backend;

import org.springframework.boot.SpringApplication;

public class TestBookmarksApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarksApiBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
