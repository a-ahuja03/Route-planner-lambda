package routeplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AllRoutes {
	List<RoutePojo> list=new ArrayList<>();

public static void main(String[] args)throws IOException{
		Scanner sc=new Scanner(System.in);
	
		 BufferedReader br = new BufferedReader(new FileReader("A:\\assignment\\RoutePlannerUsingLambda\\routes.csv"));
			
		      ArrayList<RoutePojo> al = new ArrayList<RoutePojo>(); 
		      
		      String line = " ";
		      
		      while((line =br.readLine())!= null)
		      {
		    	String [] route = line.split(",");
		       
		    	al.add(new RoutePojo(route[0],route[1],Integer.parseInt(route[2].trim()),route[3],route[4]));
			
		      }
		   
			al.forEach(r -> System.out.printf("%-15s %-15s %-15s %-15s %-15s \n",r.getFromcity(),r.getTocity(),r.getTravelledkms(),r.getTime(),r.getRuppess()));
		     System.out.println("Entre the city");
			String from = sc.next();
			System.out.println("*********Flights And Thire Routes********");

			List<RoutePojo> fromcity = al.stream().filter(a->a.getFromcity().equalsIgnoreCase(from)).collect(Collectors.toList());
			fromcity.forEach(r -> System.out.printf("%-15s %-15s %-15s %-15s %-15s \n",r.getFromcity(),r.getTocity(),r.getTravelledkms(),r.getTime(),r.getRuppess()));
			System.out.println("*********Sorted Flights************");
			fromcity.stream().sorted((r1,r2)->r1.getTocity().compareTo(r2.getTocity())).collect(Collectors.toList()).forEach(r -> System.out.printf("%-15s %-15s %-15s %-15s %-15s \n",r.getFromcity(),r.getTocity(),r.getTravelledkms(),r.getTime(),r.getRuppess()));
			
		}}	
