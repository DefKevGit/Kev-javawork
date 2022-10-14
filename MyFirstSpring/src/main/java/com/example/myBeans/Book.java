package com.example.myBeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book 
{
	@Min(3)
	public int id;
	@Size(min=5,max=50)
	@NotNull
	public String title;
	@Max(3)
	public int price;
	@NotNull
	public String author;
	@Min(5)
	public int qty;
	public Book(@Min(3) int id, @Size(min = 5, max = 50) @NotNull String title, @Max(3) int price,
			@NotNull String author, @Min(5) int qty) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", qty=" + qty + "]";
	}
	
}
