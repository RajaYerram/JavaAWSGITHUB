package com.prox.project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Items {

	public int itemID;
	public String itemName;
	public String Manufacturer;
	public int buyCost;
	public int sellCost;
	
	

	public Items(int itemID, String itemName, String manufacturer, int buyCost, int sellCost) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.Manufacturer = manufacturer;
		this.buyCost = buyCost;
		this.sellCost = sellCost;
		File f=new File("C:\\StoreFront\\Items");
		boolean f2=true;
		if(!f.exists())
			f2=f.mkdirs();
		if(f2)
		{
			try {
				File f1=new File("C:\\StoreFront\\Items\\"+itemID+".txt");
				f1.createNewFile();

				BufferedWriter bw = null;
				FileWriter fw = null;

				try {

					String contentName = "Item Name: "+itemName;
					String contentManufacturer="Manufacturer: "+manufacturer;
					String contenBuycost="Buying Cost: "+buyCost;
					String contentSellCost = "Selling Cost: "+sellCost;
					
					fw = new FileWriter(f1);
					bw = new BufferedWriter(fw);
					bw.write(contentName);
					bw.newLine();
					bw.write(contentManufacturer);
					bw.newLine();
					bw.write(contenBuycost);
					bw.newLine();
					bw.write(contentSellCost);

					bw.close();

				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
	
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.Manufacturer = manufacturerName;
	}

	public String getManufacturerName(String manufacturerName) {
		return manufacturerName;
	}

	public int getBuyCost() {
		return buyCost;
	}

	public void setBuyCost(int buyCost) {
		this.buyCost = buyCost;
	}

	public int getSellCost() {
		return sellCost;
	}

	public void setSellCost(int sellCost) {
		this.sellCost = sellCost;
	}

}
