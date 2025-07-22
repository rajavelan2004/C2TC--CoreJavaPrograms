package Day1.basics;


public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("Aravind");
		c1.setCity("Puducherry");
		System.out.println("The cid is "+c1.getCid());
		System.out.println("The cname is "+c1.getCname());
		System.out.println("The city name is "+c1.getCity());
		System.out.println(c1);
		//Customer 2
		Customer c2=new Customer();
		c2.setCid(69);
		c2.setCname("Santhosh");
		c2.setCity("Mumbai");
		System.out.println("The cid is "+c2.getCid());
		System.out.println("The cname is "+c2.getCname());
		System.out.println("The city is "+c2.getCity());
		System.out.println(c2);
		
		

	}


}
