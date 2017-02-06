package com.prox.project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class CartCheckout {
	String DateTime;
	HashMap<Integer, Integer> items = new HashMap<>();
	int FinalPrice;
	static int taxId = 0;
	int itemid, buycost, sellcost, quantity;
	String itemName, manufacturer;
	Items items2 = new Items(itemid, itemName, manufacturer, buycost, sellcost);

	public CartCheckout(int itemid,int quantity)
	{
		taxId++;
		this.itemid=itemid;
		this.quantity=quantity;
		int counter=0;
		String  Value="";
		String Name="";
		File f=new File("C:\\StoreFront\\CartCheckout");
		boolean f2=true;
		if(!f.exists())
			f2=f.mkdirs();
		File file=new File("C:\\StoreFront\\Items\\"+this.itemid+".txt");
		if(!file.exists())
		{
			System.out.println("Item Not Found");
		}
		else
		{
		if(f2)
		{
			File f1=new File("C:\\StoreFront\\CartCheckout\\"+taxId+".txt");
			while(f1.exists())
			{
				taxId++;
				f1=new File("C:\\StoreFront\\CartCheckout\\"+taxId+".txt");
			}
			while(!f1.exists()){
				try {
					f1.createNewFile();
					BufferedWriter bw = null;
					FileWriter fw = null;
					file=new File("C:\\StoreFront\\Items\\"+this.itemid+".txt");
					try {
						System.out.println("Transaction Id: "+String.valueOf(taxId));
						Scanner sc = new Scanner(file);
						fw = new FileWriter(f1);
						bw = new BufferedWriter(fw);
						bw.write("Transaction Id: "+String.valueOf(taxId));
						bw.newLine();
						while(sc.hasNextLine()){
							++counter;
							if(counter==3)
							{
								sc.nextLine();
							}
							else
							{
								String line = sc.nextLine();
								String[] details = line.split(": ");
								Name = details[0];
								Value= details[1];
								bw.write(Name+": "+Value);
								bw.newLine();
								System.out.println(Name+": "+Value);
							}
						}
						FinalPrice=Integer.parseInt(Value)*this.quantity;
						bw.write("Final Price"+" "+FinalPrice);

						System.out.println("Final Price: "+FinalPrice);
						bw.newLine();
						Date DateTime = new Date();
						bw.write("Date and Time:"+" "+DateTime);
						System.out.println("Date and Time is:"+DateTime);
						bw.close();
						sc.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
		}
		}
	}

}
