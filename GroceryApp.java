package miniProjectOnlineGroceryApp;

import java.util.*;

// creating class for items
class Item {
	
	// declaration part
	private int p_id;
	private String product;
	private int Quantity;
	private double price;
	private double Amount;
	
	public Item(int id, String p, int q, double rs, double a) {
		this.p_id = id;
	    this.product = p;
	    this.Quantity = q;
	    this.price = rs;
	    this.Amount = a;
	    }
	
	// setter 
	public void setQuantity(int quantity) {
		this.Quantity = quantity;
		}
	
	public void setAmount(double a) {
	    this.Amount = a;
	    }
	
	// getters 
	public int getp_id() {
		return p_id;	
		}
	
	public String getproduct() {
		return product;
		}
	
	public int getQuantity() {
		return Quantity;
		}
	
	public double getprice() {
		return price;
		}
	
	public double getAmount() {
		return Amount;
		}
	
	}

//creating class for cart
class Cart {
	
	// to create list
	private List<Item> items;
	
	public  Cart() {
		items = new ArrayList<>();
		}
	
	// add items in cart
	public void addItem(Item item) {
		
		// to check first the item is already exists in the cart
		for (Item existingItem : items) {
			
			// to add duplicate quantity and amount
			if (existingItem.getp_id() == item.getp_id()) {
				existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
				}
			if (existingItem.getp_id() == item.getp_id()) {
				existingItem.setAmount(existingItem.getAmount() + item.getAmount());
				return;
				}
			
			}
		
		// If the item is not already in the cart, to add
		items.add(item);
		}
	
	// get or display the added items
	List<Item> getItems() {
		return items;
		}
	
	}


// main class
public class GroceryApp {


	public static void main(String[] args) {

		// declare variables for price of goods and other declarations
		int Milk = 27;
		int Curd = 33;
		int Bean = 58;
		int Oats = 40;
		int Nuts = 30;
		int Salt = 27;
		int Rice = 54;
		int Peas = 20;
		int Pear = 60;
		int Corn = 40;
		int Soap = 40;
		int Quantity;
		int TotalQ = 0;
		int sc;
		double Amount = 0;
	    double total = 0;
	    Item item = new Item(0, "", 0, 0, 0);
	    long num;
	    
	    // to display lobby
		System.out.println();
		System.out.println("   ==================================================================");
		System.out.println("   ******************WELCOME TO LUFFY GROCERY STORE******************");
		System.out.println("   ==================================================================");
		System.out.println("              product ID         product name         price          ");
		System.out.println("              ~~~~~~~~~~         ~~~~~~~~~~~~         ~~~~~          ");
		System.out.println("                1.                Milk                 27            ");
		System.out.println("                2.                Curd                 33            ");
		System.out.println("                3.                Bean                 58            ");
		System.out.println("                4.                Oats                 40            ");
		System.out.println("                5.                Nuts                 30            ");
		System.out.println("                6.                Rice                 54            ");
		System.out.println("                7.                Salt                 27            ");
		System.out.println("                8.                Peas                 20            ");
		System.out.println("                9.                Pear                 60            ");
		System.out.println("                10.               Corn                 40            ");
		System.out.println("                11.               Soap                 40            ");
		System.out.println("   =================================================================");
		
		// to get user input
		Cart cart = new Cart();
		Scanner sca = new Scanner(System.in);
		
		// to display
		System.out.println("");
		System.out.println("@@@ PLEASE login for further steps @@@");
		System.out.println("");
		
		//  outer while for sign up or login
		while (true) {
			System.out.print("Enter signup or login : ");
			String me = sca.next();
			
			if (me.equals("signup")) {
				System.out.println("");
		        System.out.print("Create user ID : ");
		        String Id = sca.next();
		        
		        //  inner while to get password and check
		        while (true) {
		        	System.out.print("Enter password : ");
		        	String firstpassword = sca.next();
		        	System.out.print("Re enter password : ");
		        	String secondpassword = sca.next();
		        	
		        	// to check passwords are same
		        	if (firstpassword.equals(secondpassword)) {
		        		System.out.println();
		        		System.out.println("You have sucessfully signed in");
		        		break;
		        		}
		        	else {
		        		System.out.println("Password missmatched");
		        		System.out.println();
		        		}
		        	
		        	} // inner while closing
		      
		        break;
		        
		        }
			else if (me.equals("login")) {
				System.out.println();
				System.out.print("Enter user ID : ");
				String id = sca.next();
				System.out.print("Enter password : ");
	        	String pass = sca.next();
	        	System.out.println();
	            System.out.println("You have sucessfully loged in");
	            break;
	            }
			else {
				System.out.println(" Invalid input");
	        	System.out.println();
	        	}
			
			} // outer while closing
		
	        
		// to display
		    System.out.println("");
		    System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("  |   Enter the product ID to add to cart; 0 to complete the selection  |");
	        System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("");
	        
	        
	        // outer while using for order 
	        while (true) {
	        	
	        	System.out.print("Enter the product ID to add to cart (OR) 0  :");
	        	sc = sca.nextInt();
	        	sca.nextLine();
	        	
	        	// switch for selection
	        	switch (sc) {
	        	
	        	case 1: // Milk
	        		System.out.print("Enter the desired quantity: ");
	        		Quantity = sca.nextInt();
	        		Amount = Quantity * Milk;
	        		item = new Item(sc, "Milk", Quantity, 27, Amount);
	        		cart.addItem(item);
	        		System.out.println("Milk added to your cart ");
	        		TotalQ = Quantity + TotalQ;
	        		total = Quantity * Milk + total;
	        		System.out.println("");
	        		break;
	        		
	        		case 2: // Curds
	        			System.out.print("Enter the desired quantity :");
	        			Quantity = sca.nextInt();
	        			Amount = Quantity * Curd;
	        			item = new Item(sc, "Curd", Quantity, 33, Amount);
	        			cart.addItem(item);
	        			System.out.println("Curd added to your cart ");
	        			TotalQ = Quantity + TotalQ;
	        			total = Quantity * Curd + total;
	        			System.out.println("");
	        			break;
	        			
	        			case 3: // Bean
	        				System.out.print("Enter the desired quantity :");
	        				Quantity = sca.nextInt();
	        				Amount = Quantity * Bean;
	        				item = new Item(sc, "Bean", Quantity, 58, Amount);
	        				cart.addItem(item);
	        				System.out.println("Bean added to your cart ");
	        				TotalQ = Quantity + TotalQ;
	        				total = Quantity * Bean + total;
	        				System.out.println("");
	        				break;
	        				
	        				case 4: // Oats
	        					System.out.print("Enter the desired quantity :");
	        					Quantity = sca.nextInt();
	        					Amount = Quantity * Oats;
	        					item = new Item(sc, "Oats", Quantity, 40, Amount);
	        					cart.addItem(item);
	        					System.out.println("Oats added to your cart ");
	        					TotalQ = Quantity + TotalQ;
	        					total = Quantity * Oats + total;
	        					System.out.println("");
	        					break;
	        					
	        					case 5: // Nuts
	        						System.out.print("Enter the desired quantity ");
	        						Quantity = sca.nextInt();	
	        						Amount = Quantity * Nuts;
	        						item = new Item(sc, "Nuts", Quantity, 30, Amount);
	        						cart.addItem(item);
	        						System.out.println("Nuts added to your cart ");
	        						TotalQ = Quantity + TotalQ;
	        						total = Quantity * Nuts + total;
	        						System.out.println("");
	        						break;
	        						
	        						case 6:  // Rice
	        							System.out.print("Enter the desired quantity :");
	        							Quantity = sca.nextInt();
	        							Amount = Quantity * Rice ;
	        							item = new Item(sc, "Rice", Quantity, 54, Amount);
	        							cart.addItem(item);
	        							System.out.println("Rice added to your cart ");
	        							TotalQ = Quantity + TotalQ;
	        							total = Quantity * Rice + total;
	        							System.out.println("");
	        							break;
	        							
	        							case 7: // Salt
	        								System.out.print("Enter the desired quantity :");
	        								Quantity = sca.nextInt();
	        								Amount = Quantity * Salt;
	        								item = new Item(sc, "Salt", Quantity, 27, Amount);
	        								cart.addItem(item);
	        								System.out.println("Salt added to your cart ");
	        								TotalQ = Quantity + TotalQ;
	        								total = Quantity * Salt + total;
	        								System.out.println("");
	        								break;
	        								
	        								case 8: // Peas
	        									System.out.print("Enter the desired quantity :");
	        									Quantity = sca.nextInt();
	        									Amount = Quantity * Peas;
	        									item = new Item(sc, "Peas", Quantity, 20, Amount);
	        									cart.addItem(item);
	        									System.out.println("Peas added to your cart ");
	        									TotalQ = Quantity + TotalQ;
	        									total = Quantity * Peas + total;
	        									System.out.println("");
	        									break;
	        									
	        									case 9: // Pear
	        										System.out.print("Enter the desired quantity :");
	        										Quantity = sca.nextInt();
	        										Amount = Quantity *  Pear;
	        										item = new Item(sc, "Pear", Quantity, 60, Amount);
	        										cart.addItem(item);
	        										System.out.println("Pear added to your cart ");
	        										TotalQ = Quantity + TotalQ;
	        										total = Quantity *  Pear + total;
	        										System.out.println("");
	        										break;
	        										
	        										case 10: // Corn
	        											System.out.print("Enter the desired quantity :");
	        											Quantity = sca.nextInt();
	        											Amount = Quantity * Corn;
	        											item = new Item(sc, "Corn", Quantity, 40, Amount);
	        											cart.addItem(item);
	        											System.out.println("Corn added to your cart");
	        											TotalQ = Quantity + TotalQ;
	        											total = Quantity * Corn + total;
	        											System.out.println("");
	        											break;
	        											
	        											case 11: // Soap
	        												System.out.print("Enter the desired quantity :");
	        												Quantity = sca.nextInt();
	        												Amount = Quantity * Soap;
	        												item = new Item(sc, "Soap", Quantity, 40, Amount);
	        												cart.addItem(item);
	        												System.out.println("Soap added to your cart"); 
	        												TotalQ = Quantity + TotalQ;
	        												total = Quantity * Soap + total;
	        												System.out.println("");
	        												break;
	        												
	        												default:
	        													break;
	        													
	        													} // switch closing
				
				//  if statement for parameters and to complete the selection
	        	if (sc >= 12) {
	        		System.out.println("Invalid input - please enter product ID");
	        		System.out.println();
	        		}
	        	else if (sc == 0) {
	        		System.out.println();
	        		System.out.println();
	        		System.out.println("Items in your cart:");
	        		System.out.println();
	        		System.out.println("   P_id  product name   Qty   Price   Amount  ");
	        		System.out.println();
	        		
	        		// using loop inside the if statement to get cart list after selection
	        		for (Item item1 : cart.getItems()) {
	        			System.out.println("    "+item1.getp_id() + "      "+item1.getproduct() + "          " + item1.getQuantity()+ "     " + item1.getprice() + "    " + item1.getAmount());
	        			System.out.println();
	        			}
	        		
	        		System.out.println(" --------------");
	        		System.out.println("|Total : "+total+"|");
	        		System.out.println(" --------------");
	        		System.out.println();
	        		
	        		break;
	        		
	        		}
	        	
	        	} // while closing
	        
	     // payment
	        while (true) {
	        	System.out.print(" Want to proceed with payment (yes/no) : ");
	        	String yo = sca.nextLine();
	        	
	        	if (yo.equals("yes")) {
	        		
        			System.out.println();
        			System.out.print(" Enter Address detais : ");
        			String adr = sca.nextLine();
	        			System.out.println();
	        			
	        			// 1 inner while
	        			while (true) {
	        				System.out.print("Enter mobile number : ");
	        				long mobile = sca.nextLong();
	        			    
	        			    if (String.valueOf(mobile).length() == 10) {
	        			        num = mobile;
	        			        break;
	        			    }
	        				else {
	        					System.out.println("Invalid input. Please enter exactly 10 digits mobile number.");
	        					System.out.println();
	        					}
	        				
	        				} // 1 inner while 

	        			System.out.println();
	        			while (true) {
	        			System.out.print(" Payment mode (cash/upi) : ");
	        			String paymentmethod1 = sca.next();
	        			
	        			if (paymentmethod1.equals("cash")) {
	        				System.out.println(" Payment mode : cash payment");
	        				System.out.println("Cash on delivery");
	        				System.out.println();
	        				break;
	        				}
	        			else if (paymentmethod1.equals("upi")) {
	        				System.out.println();
	        				System.out.println(" Payment mode : upi payment");
	        				System.out.println();
	        				
	        				while (true) { // 2 inner while
	        					System.out.print("Enter pay amount : ");
	        					double cash1 = sca.nextDouble();
	        					
	        					 if (cash1 == total) {
	        						System.out.println("Payment successfull");
	        						System.out.println();
	        						break;
	        						}
	        					else {
	        						System.out.println("Invalid amount. Please enter the exact total amount.");
	        						System.out.println();
	        						}
	        					
	        					} // 2 inner while closing
	        				
	        				 break;
	        				 
	        				}
	        			else {
	        				System.out.println("Invalid input - please enter 'cash' or 'upi'");
	        				System.out.println();
	        				}
	        			}
        			break;
        			} 
	        	else if (yo.equals("no")) {
	        		System.out.println("Exited");
	        		System.exit(1);
	        		} else {
	        			System.out.println("Invalid input - please enter 'yes' or 'no'");
	        			System.out.println();
	        			}
	        	
	        	} //  outer while closing
	        
	        System.out.println(" Your order placed");
	        System.out.println(" Your purchase will be deliver with in 2 hours");
	        System.out.println();
	        System.out.println(" >>>>>>>>>> THANK YOU :) <<<<<<<<<<");
	        
	        }
	}
