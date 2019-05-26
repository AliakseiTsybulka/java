package homework;
public class StoreProduct {
String label, category;
int price, stock;
boolean hasExpiration;
StoreProduct(String l, int p, String c, boolean h, int s){
	label = l;
	price = p;
	category = c;
	hasExpiration = h;
	stock = s;
}
StoreProduct(String l, int p, int s){
	label = l;
	price = p;
	category = "misc";
	stock = s;
}
StoreProduct(String l, int p){
	label = l;
	price = p;
	category = "misc";
}
void output() {
	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
}
}

/*1. Complete the StoreProduct.java class:

Include the following class variables:
* label
* price (as an integer)
* category
* hasExpiration (as a boolean)
* stock (represents how many the store has available)
All class variables should be declared case sensitive

Write three constructors:

* The main constructor( with all parameters)
* A secondary constructor that does not have a category and an expiration (category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, and stock (stock defaults to 0)

Hint: each variable must be object specific
Output:
 
 
Eggs 3 Produce true 10
Paper Towels 2 misc false 24
Paper Towels 2 null false 0
*/