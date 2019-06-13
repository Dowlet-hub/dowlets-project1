package selfPractices;

import java.util.Scanner;

public class CarInsurancePremium {

	public static void main(String[] args) {

		// DO NOT CHANGE
				double premium = 0;
				int accidentsAmount = 0;
				int days = 0;
				int milesToWorkOrSchool = 0;
				int daysToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
				System.out.println("Enter your name");
				name = scan.nextLine();
				System.out.println("Do you have a US driver license?");
				String hasDriverLicense = scan.next();
				if (hasDriverLicense.equalsIgnoreCase("no")) {
					System.out.println("Invalid data!");
					System.exit(0);
				}
				System.out.println("Enter your zip code");
				int zipCode = scan.nextInt();
				premium = (zipCode==20910 ||zipCode==20740)? premium+60 : (zipCode==22102 ||zipCode==22103)?
		premium+30: premium+50; 

				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership = scan.next();
				premium = (vehicleOwnership.equalsIgnoreCase("Owned"))? premium+10: premium+20;

				System.out.println("How is this vehicle primarily used?");
				vehicleUsage = scan.next();
				premium = (vehicleUsage.equalsIgnoreCase("Business"))? premium+50:(vehicleUsage.equalsIgnoreCase("Pleasure"))? premium+10 : (vehicleUsage.equalsIgnoreCase("Commute"))? premium+20: premium; 

				if (vehicleUsage.equalsIgnoreCase("Commute")){
				System.out.println("Days Driven To Work And/Or School");
				daysToWorkOrSchool = scan.nextInt();
				premium = premium + 5*daysToWorkOrSchool;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool =scan.nextInt();
				premium = premium + milesToWorkOrSchool;
				}

				System.out.println("How old are you?");
				int age = scan.nextInt();
				if (age<16) {
					System.out.println("Invalid data!");
					System.exit(0);
				}else if (age>=16 && age<18) {
					premium = premium*20;
				}else if (age>=18 && age<=21) {
					premium = premium*6;
				}else if (age>21 && age<25) {
					premium = premium*2;
				}
		   
				System.out.println("How many years you've been driving?");
				days = scan.nextInt();
				if (days<=0 || age-days<=16) {
					System.out.println("Invalid data!");
					System.exit(0);
				} else {
					premium = premium - (days*5);
				}
				

				System.out.println("Have you had any accidents in the last 5 years?");
				String isAccident = scan.next();
				if (isAccident.equalsIgnoreCase("yes")){
					System.out.println("How many?");
					accidentsAmount = scan.nextInt();
					premium = premium + 0.2*premium*accidentsAmount;
				}
				

				System.out.println("Have you had continuous insurance for the past 12 months?");
				continuousInsurance = scan.next();
				premium = continuousInsurance.equalsIgnoreCase("no")? premium*2: premium;

				System.out.println("What is the highest level of education you have completed?");
				scan.nextLine();
				education= scan.nextLine();
				if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("masters") || education.equalsIgnoreCase("Bachelors")) {
				premium = premium - (premium*0.05);	
				} else if (education.equalsIgnoreCase("Doctors")){
					premium = premium - (premium*0.1);
				}else if (education.equalsIgnoreCase("Less than High School")){
				premium = premium + (premium*0.05);
				}

				System.out.println(name +", here's your quote!");
				System.out.println("Start Your Policy Today For: $"+ premium);
				
				referenceNumber = name.substring(0,2)+""+ age+ name.charAt(name.length()-2)+""+name.charAt(name.length()-1 )+""+zipCode+education.replace(" ", "");
				
				
				System.out.println("Reference number: "+ referenceNumber.toUpperCase());
				
				

			}

		}

