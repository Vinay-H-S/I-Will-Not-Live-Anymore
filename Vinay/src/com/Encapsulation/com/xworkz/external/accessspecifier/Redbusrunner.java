package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class Redbusrunner {
	public static void main(String[] args) {
		

		Redbus bus=new Redbus();
		bus.setfounder("phanindra sama");
		bus.setname("RedBus");
		bus.setTotalBus(55);
		bus.isInstal(true);
		bus.setcolor("red");
		bus.setbusno("KA41H3241");
		bus.setdrivername("mohan");
		bus.setroute("koppa");
		bus.setstsrtingPoint("koppa");
		bus.setdestination("bengaluru");
		bus.setTotalTime(10);
		bus.setamount(1400);
		bus.settimeTaken("12");
		bus.setseatNo(12);
		
		
		System.out.println(bus.getfounder());
		System.out.println(bus.getName());
		System.out.println(bus.gettotalBus());
		System.out.println(bus.isinstal());
		System.out.println(bus.getcolor());
		System.out.println(bus.getbusNo());
		System.out.println(bus.getdriverName());
		System.out.println(bus.getRoute());
		System.out.println(bus.getStartingPoint());
		System.out.println(bus.getdestination());
		System.out.println(bus.gettotalTime());
		System.out.println(bus.getamount());
		System.out.println(bus.gettimeTaken());
		System.out.println(bus.getseatNo());
		}
		
		
	}
	}
	

}
