package com.bookshop.springbootrestdatabookshopmaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = "current_cart")
public class CartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id is the primary auto generated key
	@Column(name = "accountid")
	private int accountId;

	@Column(name = "cost")
	private int cost;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "booktitle")
	private String bookTitle;

	@Column(name = "bookid")
	private int bookId;
	
	
//	@ManyToOne
//	@JoinColumn(name ="accountid")
//	private AccountEntity accountentity;
//	
//	@ManyToOne
//	@JoinColumn(name ="bookId")
//	@JoinColumn(name ="bookTitle")
//	@JoinColumn(name = "cost")
//	private BookEntity bookentity;

	
}
