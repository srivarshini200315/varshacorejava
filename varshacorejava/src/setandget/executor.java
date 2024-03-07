package setandget;

public class executor {

	public static void main(String[] args) {
		customer c1=new customer();
		c1.setCid(112);
		c1.setCname("Chaitanya");
		c1.setAddress("Puducherry");
        System.out.println("customer id:"+c1.getCid()+" customer name:"+c1.getCname()+" customer Address:"+c1.getAddress());
	}

}
