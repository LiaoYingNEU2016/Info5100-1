## Hw1

> Haotian 

### 1. Hiking

**problem1.1**.(Car2go) Rent a ReachNow to drive to mountain rainier on weekends with friends

> for me I prefer Car2go

##### things

1. Consumer
   * **Data** username, password, name, phone, passport, head portrait, mail, location
   * **behaviors** sign in & out,  search, reserve the car, pay for the renting fee, contact for help, car route record, review
2. PhoneId
   * **Data** name passport number, SSN number, expiration date
   * **behaviors** identification 
3. Driver lisence
   * **Data** name, birthday, male, type
   * **behaviors** identification
4. cars
   * **Data** model, manufactory date, fee, location, plate number, photo
   * **behaviors** 
5. Payment
   * **Data** card number, name, company, security number, expiry
   * **behaviors**
6. PhoneConnection
   * **Data** wifi&cellular, Car2go app
   * **behaviors** make the service in car2go available 



##### sequence

```java
Renting a car at Car2go:

Consumer Tom;
PhoneId TomID;
DriverLisence driverTom;
Cars car1, car2;
PhoneConnection TomPhone;
Payment Creditcard;

if (TomPhone.isAvailable) {
	Tom.register();//register the account
	Tom.signin();// signin the account
	if (TomID.qualified()) {
		if (driverTom.qualified()) {
			Tom.search("car details");
			while(!Tom.select("one car"))
			{
				Tom.search();
			}
			Tom.reserve("car1");// Tom select car1 and reserve it
			Tom.useCar("car1");// Tom start to drive the car
			if (Tom.endCar) { // Tom finish using the car
				Tom.bill(); // Tom's bill
				Creditcard.pay();// Tom pay for the bill
				Tom.review();// Tom review the experience
			}
		}
		
	}
	else
		{
			Tom is not a qualified driver;// Tom need driverlisence
		}
	}
else
	{
		Tom is not qualified to rent the car;//Tom need identification
	}

    if(Tom.needhelp()){
		Tom.call();// Tom contact with Car2go
	}
	
}

```





**problem1.2.** On the way, fill the gas

##### things

1. Consumers
   * **Data** name, male, location
   * **behaviors** search for the gas station, select gas station, select way to pay, leave the gas station.
2. Payment
   * **Data** card number, password
   * **behaviors** pay for the gas
3. Cars
   * **Data** model, type of gas, amount of gas the car can fill
   * **behaviors** fill in the gas
4. Gas_station
   * **Data**  station ID, location, amount of gas they have
   * **behaviors** provide the gas for cars
5. Phone
   * **Data** wifi&cellular, map



```java
On the way, fill the gas

Consumer Jack;
Payment Jack_card;
Cars Jack_car;
Gas_Station gs1, gs2;
Phone Jack_phone;

if (Jack_phone.net()) { // Jack‘s phone is availble
	gs1 = Jack.search("gas station1");
	gs2 = Jack.search("gas station2")
    if (Jack.select(gs1))
    {
    	Jack_phone.map(gs1);// find the route to gas station
    	Jack.go(gs1);// Jack drive to gas station
    }
    else
    {
    	Jack_phone.map(gs2);
    	Jack.go(gs2);
    }
    if (Jack_car.Amountgas != null) {
    	Jack_car.fill();// Jack fill the gas in
    	if(Jack.selectPayment() == card){
    		Jack_card.pay();// Jack pay for the bill by the card
    	}
    	else{
    		Jack.payCash();//Jack pay by cash
    	}
    	Jack.leave(); // Jack leave the gas station
    }
    else{
    	jack do not need fill the gas.
    }
}
else
{
	Jack could not find a gas station;
}
```



**program1.3**  On the way, eat at restaurant for lunch

**things** 

1. consumers
   * **things** name, male, phone ID, phone number. location
   * **behaviors** search, select, payment, leave, review.
2. Restaurant
   * **things** name, location, type
   * **behaviors** provide menu, food,  dicrect  
3. Food
   * **things** price, size, flavor
   * **behaviors** 
4. CreditCard 
   * **things** card number, expiry, name, address, security number
   * **behaviors**  

```java
Eat at restaurant 

Consumer Ann;
Restaurant KFC, pizzahut;
Food pizza, pasta, drink;
Creditcard Ann_card;

sequence:

Ann.search_food("location, type of food"): many restaurant;
if(Ann.select()=null){  //
	Ann do not select any food;
	Ann.leave; 
}
else{
	menu KFC.menu("food"): name,size, price;
	pizza = Ann.want();// Ann select what food she like
	Ann.pay("name, Ann_card, pizza" ): Ann finished paying the bill;// Ann pay for the bill
	Ann.review// Ann make a review to the service
	Ann.leave();// Ann leave the restaurant
}
```



**problem1.4**  Buy the ticket to get into the park

**things**

1. consumers
   * **things** name, phoneId, age, quantity
   * **behaviors** drive to the ticket office, select tickets, buy tickets, get tickets, go into the park.
2. tickeOffice
   * **things** office hours, amount of available tickets
3. ticket
   * **things** name, type, available time, photo, phone number
4. Credit card
   * **things** card number, expiry, name, address, security number



Sequence

```java
Buy the tickets to get into the park

Consumer Tina;
TicketOffice mountain_A;
Tickets adult1; child1;
Creditcard Tina_card;

if (Tina.has_tickets) {// if Tina already has some tickets
	if (Tina.tickets_availble) { // if these tickets are available
		Tina.getinto();  // Tina can get into the park
	}
}
else
{
	if (mountain_A.available()) { // if the office is open
		if(Tina.quantity <= mountain_A.quantity)//if there enough tickets
		{
			Tina.selectTickets("type, quantity");// Tina select the type and amount of the tickets
			if(Tina.select_payment == "Creditcard")// Tina use credit card
			{
				Tina.payment("Tina_card");// Tina pay the tickets by card 
				Tina.getinto();
			}
			else if (Tina.selectTickets == "Cash") {
				Tina.payment("Tina.cash"); //Tina pay the tickets by cash
				Tina.getinto();
				
			}else
			{
				Tina could not pay for the tickets;
				Tina.leave();
			}
		}
	}
	else{
		Tina could not buy the tickets;
		Tina.leave();
	}
	
}
```



**problem1.5**  Book a hotel or check in the hotel.

**things**

1. consumers

   * **things** name, Phone ID, phone number, amount of people, other choice, time
   * **behaviors** search, select, pay, review, cancel

2. website

   * **things** url, photo, name

3. hotel

   * **things** name, location, time, price, type, quantity
   * **behaviors** whever available

4. Credit Card

   **things** card number, expiry, name, address, security number

5. Phone

   * **things** wifi/cellular, phone numver
   * **behaviors** provide internet

```java
Book a hotel at a website


Consumer Tim;
Website Airbnb;
Hotel Wanda, Hilton;
Creditcard Tim_card;
Phone Tim_phone;

if (Tim_phone.net()) { //if Tim's net is available
	Tim.search("hotel website"); //Tim find Airbnb to book hotels
	Airbnb.search("hotel name, location, Tim.want, type, prive");
	while(Tim.select()== null) // if Tim is still search hotels
	{
		Airbnb.nextPage();//until Tim select Wanda
	}
	Wanda = Tim.want; //Tim select Wanda
	if (Wanda.space != null && Wanda.time != null) { //there be enough room for Tim
		Tim.book_hotel("name, quantity, time, type, Phone Id");
		if(Tim_card.identify())
		{
			Tim.payment("Tim_card.message, Wanda.price");
			Tim.finish();// Tim finish the process of booking
			Tim.review();// Tim could make a review
		}
	}
}
else
{
	Tim could not book a hotel;
}
```



2. Organise a career fair(Suppose you are the organiser)

**things** 

1. consumers
   * **things** name, male, target, want
   * **behaviors** search for the jobs, provide his resume, having the test, job interview, get the job, failed the test and leave
2. Resume
   * **things** name, male, target, transcript, work exprience, hobby
   * **behaviors** 
3. interviewers
   * **things** name, question, attitude(whether satisfied with consumers' answers)
   * **behaviors** ask questions and get answers, decide whether receive the consumer.
4. Test 
   * **things** name, questions, answers
   * **behaviors** 
5. Job
   * **things** name, location, content, salary, amount



**sequence**

```java
Organise a career fair

Consumer John;
Resume John_re;
Interviewers Mike;
Test Kn_test;
Job Ama_SE;

public class Career_fair{
	public static void find_job(){
		while(John.search() != null){. // John has a target
			if (John_re.target in Job.scope) {
				if (John.salary >= Job.salary) {//if the salary is satisfied		
					if (Job.amount >0 ) {
						John.up_resume(John_re); //john upload his resume
						if(Mike.select_re(John_re) == true){ 
							John.have_test(Kn_test);
							if (John.Testscore >= 80) {
								John.interview("Mike, Ama_SE");// John have a interview
								Mike.question("John, Ama_SE");//
								if(Mike_satisfy(John_answers))
								{
									John.getJob("Ama_SE");
								}
								else{
									John.leave();
								}
								
							}
							else{
								John.leave();
							}

					}
					John_resume is not good enough;
				}
				The job is full
				John.leave();	
			}
			The salarty do not satisfy John;
			}
			The company do not have the job John wants;
		}
		John find the job is available;
	} 
}
```



3. Order Pizza from Pizza Hut

**things**

1. consumers

   **things** name, phone number, male,  location

   **behaviors** search the Internet, select food, pay for the food, cancel, make a call, review.

2. website

   **things** photo, url, name, open time, close time

   **behaviors** receive the order.

3. internet

   * **things** 
   * **behaviors** provide net connection for ordering the pizza

4. payment

   * **things** card number, expiry, name, address, security number

5. food

   * **things** name, size, flavor,



**sequence**

```java
Order Pizza from Pizza Hut


public class Order_pizza{

Consumer Peter;
Website Pizza_Hut;
Internet TT;
Payment Peter_credit;
Food Pizza_One, Swing_One;

public static void order(){
	if (TT.available) {
		Pizza_Hut = Peter.search("Pizza Hut")// Peter input pizza hut 
		if (Peter.eat_time >= Pizza_hut.open_time && Peter.eat_time <= Pizza_hut.close_time ) {
			Pizza_hut.show_menu();
			Peter.select("Pizza_hut.menu"); //Peter select Pizza_One, swing One
			if (Pizza_One.qua >= Peter.want(Pizza_One) && Swing_One.qua >= Peter.want(Swing_One)) {
				Peter.payment("Peter_credit.name,card number, price");
				Pizza_Hut.receive_order("Peter.want");				
			}
			else{
				Peter has to choose other food;
              //the quantity is not satisfied
			}
		}
		else{
			Peter could not order pizza from Pizza_Hut;
          // It is not the right time;
		}
	}
	else{
		Peter could not find the website;
      // the Internet is not available
	}

}	
}
```



4. Design a code sharing platform (eg: Github).

**things** 

1. Client
   * **things** username, password, project, file, mail, 
   * **behaviors** sign up, sign in, create a repository, upload file, edit file, delete dile, download file, clone others' file, look for help

2. file

   * **things** name, content, created time, type

3. Manager

   * **things** name, server Id

4. repository

   * **things** name, storage, type

5. Internet

   * **things** IP address, 


* **behaviors** provide net connection


**sequence**

```Java
Design a code sharing platform


public class Platform{
	Client Jany, Merphy;
	File a_txt,b_txt;
	Repository Jany_repo, Merphy_repo;
	Manager Robort1;
	Internet Net_1;

	public static void platform{
		if (Net_1.isAvailable) { 
			Jany.sign_up("username, password, mail, phone");
			Jany.sign_in("username, password");
			Jany.create_repo("name, storage, type"); //Jany create a repository, named repo_1
			Jany.create_file("file.name, file.content, time");//Jany create file a_txt
			Jany.upload("a_txt");

			Merphy.sign_up("username, password, mail, phone");
			Merphy.sign_in("username, password");
			Merphy.follow("Jany.username")//Merphy follow Jany's repository
			Merphy.create_file("file.name, file.content, time")//Merphy create file b_txt
			Merphy.clone_file("Jany_repo");//Merphy clone the Jany's repository
			Merphy.edit_file("a_txt");//Merphy edit the a_txt
			Merphy.upload("a_txt");
			Merphy.create_file("b_txt");
			Merphy.edit_file("b_txt");
			Merphy.upload("b_txt");
			if (Merphy.need_help == true) {
				Merphy.call("Robort1.Id, Robort1.phone");//Merphy looks for help
			}
		}
		else{
			the platform is not available;
		}
	}
}
```





5. Design a soft-drink/snacks vending machine.

**things** 

1. Consumers
   * **things**  
   * **behaviors** select food, pay for the food, get the change.
2. Internet
   * **things** Ip address, speed, type
   * **behaviors** provide the net connection for the machine
3. Machine
   * **things** ID, status, capacity, food
   * **behaviors** get the money, return the change.
4. Food
   * **things** name, ID, price, quantity
5. Payment
   * **things** card number, expiry, name, address, security number



```java
Design a snacks vending machine
public class Snack_machine{
	Consumer Jerry;
	Machine A001;
	Internet ATT;
	Food hamburger_1, hamburger_2;
	Payment Jerry_card;

	public static void Buy_snack{
		if (A001.status == true) {
			Jerry.select("Food Id");//He choose the hamburger_1

			while (Jerry.finish() != true) {
				Jerry.want = Jerry.select("Food_Id");
			}
			if (hamburger_1.quantity > machine.quantity(hamburger_1)) {
			A001.receive("hamburger_1, hamburger_2");
			A001.sum_price("hamburger_1, hamburger_2");
			if (Jerry.select_payment() = "cash"){
				Jerry.pay_cash();
			}
			else {
				Jerry.pay(Jerry_card, price);
			}
			A001.get_Money();//the machine receive the money
			A001.re_Money();// return the change
			Jerry.get_Food();//Jerry get the food
			}
		}
		else{
			Jerry has to choose another machine;
		}
	}

}

```

