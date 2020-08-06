
package com.opt.logindemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.lang.*;
import static java.lang.Math.*;
import  java.lang.Math.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.io.*;

enum USCurrency   {
    PENNY (1),
    NICKLE(5),
    DIME (10),
    QUARTER(25);
    private final int value;
    USCurrency(int value)   {
        this.value = value;
    }
    public int getValue()    {return value;}
}

class NotInRangeException extends IOException{
	NotInRangeException(){
		super("Not in valid Range");
	}
}

class Employee{
	String fName;
	String lName;
	public Employee(String fn,String ln) {
		fName=fn;
		lName=ln;
	}
	
	public String getfName() {return fName;}
	public String getlName() {return lName;}
	public String toString() {
		return fName+" "+lName;
	}
}


class Test1{
	int val=10;
	private AtomicInteger value=new AtomicInteger(val);
	static int age;
	public static void main(String... c) throws IOException  {
		String s=null;
		s="1232";
		System.out.println(s);
        Scanner sc=new Scanner(System.in);
        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.println("Enter day");
        String day=sc.next();
        System.out.println("Enter number");
        String number=sc.next();
        int num=Integer.parseInt(number);
        if(num<=500&& num>=0 ){
            
            for(int i=0;i<days.length;i++){
                if(days[i].equals(day)){
                    int j=i;
                    while(num!=0){
                        
                            if(j==6){
                                j=0;
                                break;
                            }
                            j++;
                            num--;
                      }
                        System.out.println(days[j]);
                        return;
                    }
                }
        }else{
            System.out.println("Cant less than 0 and greater than 500");
        }
		
//		USCurrency u=USCurrency.PENNY;
//		System.out.println(u.getValue());
//		List<Employee> emp=Arrays.asList(new Employee("John","Smith"),new Employee("Peter","Sam"),new Employee("Thomas","Wale"));
//		emp.stream().sorted(Comparator.comparing(Employee::getfName).reversed().thenComparing(Employee::getlName));
//		System.out.println(emp);
//		
//		
//		
//		Test1 t=new Test1();
//		Test1 t2=new Test1();
//		Test1 t3=new Test1();
//		t.method();
//		t2.method();
//		t3.method();
//		Stream ints=Stream.of(1,2,3);
//		//System.out.println(ints.findAny());
//		Optional<Integer> opi=ints.findAny();
//		opi.ofNullable(null).ifPresent(System.out::print);
//		System.out.println(opi);
//		ToIntFunction<Integer> toint=p-> p;
//		IntStream s=stream.mapToInt(toint);
//		System.out.println(s.skip(1).sum());
		
		//Question 58 Set 2- Java Level 2
//		List<String> strings=new ArrayList<>();
//		strings.add("Oracle");
//		strings.add("Java");
//		strings.add("1Z0-808");
//		strings.add("Oracle");
//		strings.add("Test 1");
//		
//		Map<Boolean,List<String>> map=strings.stream().collect(Collectors.partitioningBy(s->s.length()>4));
//		
//		System.out.println(map);
		
//		Stream<Double> strings=Stream.of(1.0,1.1);
//		
//		Stream<Integer> int1s=strings.flatMap(s->Stream.of(s.intValue()));
//		System.out.println(int1s.collect(Collectors.toSet()));
		
//		List<Integer> strings=new ArrayList<>();
//		strings.add(10);
//		strings.add(20);
//		strings.add(30);
//		strings.add(40);
//		strings.add(50);
//		
//		Consumer<Integer> cons=System.out::print;
//		Consumer<Integer> con=e->System.out.println(" "+e*2+" ");
//		cons.andThen(con);
//		ints.forEach(cons);
		
//		Function<Double, Integer> nul=d->d.intValue();
//		Function<Integer, String> f=e->e.toString();
//		Function<Double, String> func=f.compose(nul);
//		System.out.println(func.apply(122.6).length());
		
//		Locale CAN=Locale.CHINESE;
//		System.out.println(CAN);
		
		
		//Date Time questions
//		LocalDate ld1=LocalDate.of(2015, 2, 27).plusDays(3);
//		LocalDate ld2=LocalDate.of(2015, 11, 29);
//		
//		long l=ld1.until(ld2, ChronoUnit.DAYS); // Check distance between 2 date
//		System.out.println(l);
//		System.out.println(ld1.getMonth());
//		
//		//Finding Last day of the year 2015
//		LocalDate ld3=LocalDate.ofYearDay(2015, 365);
//		System.out.println("Last day of the year 2015"+ld3);
//		
//		
//		//Change Date format
//		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MMM/uuuu");
//		DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/uuuu");
//		System.out.println(ld1.format(format));
//		System.out.println(ld2.format(format2));
//		
//		//Change day
//		ld1=ld1.with(ChronoField.DAY_OF_YEAR,9);
//		System.out.println(ld1);
//		System.out.println(Period.ZERO.getUnits());
//		
//		
//		
//		LocalTime lt=LocalTime.of(1, 2,15); //HOUR, MINUTE, SECOND
//		System.out.println(lt.getLong(ChronoField.valueOf("MINUTE_OF_DAY"))); 
//		System.out.println(lt.isSupported(ChronoField.YEAR));
//		System.out.println(lt.isSupported(ChronoUnit.MILLIS));
//		
//		
//		LocalDateTime ldt=LocalDateTime.of(2015, 11,28,9,21);//YEAR, MONTH, DAY, HOUR, MINUTE,
//		ldt=ldt.truncatedTo(ChronoUnit.DAYS);
//		System.out.println(ldt.toLocalDate());
//		System.out.println(ldt.toLocalTime());
//		
//		Period p=Period.ofMonths(13);
//		System.out.println(p.normalized());
//		
//		//Year and add MONTHS and DAYS
//		Year y=Year.of(2015);
//		LocalDate ym=y.atMonthDay(MonthDay.of(4, 10));
//		System.out.println(ym +"\n"+y);
//	}
//	
//	public void method() {
//		while(++age<3) {
//			System.out.print("A");
//		}
//	}
	}
}



