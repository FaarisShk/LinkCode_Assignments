
public class ShopInfo {
	
	public Customer create() {
		Product prod = new Product(101,"Laptop",20000,2);
		Address addr = new Address("Pune","Mh",411005);
		Customer cust = new Customer(1,"Ganesh",12345,addr,prod);
		return cust;
	}
	
	public void display(Customer cust) {
		System.out.println("Customer ID: " + cust.getCustId());
		System.out.println("Cusotmer Name: " + cust.getCustname());
		System.out.println("Mobile No: " + cust.getMobno());
		System.out.println("----------ADDRESS-------------");
		System.out.println("City: " + cust.getAddr().getCity());
		System.out.println("State: " + cust.getAddr().getState());
		System.out.println("Pincode: " + cust.getAddr().getPinC());
		System.out.println("----------PRODUCT--------------");
		System.out.println("Product Id: " + cust.getProd().getProdId());
		System.out.println("Product name: " + cust.getProd().getProdName());
		System.out.println("Prodcut price: " + cust.getProd().getProdPrice());
		System.out.println("Product Quantity: " + cust.getProd().getProdQty());
		System.out.println("----------THANK YOU------------");
	}
}
