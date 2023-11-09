package com.xworkz.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		Collection<ProductDTO> collection = new ArrayList<ProductDTO>(Arrays.asList(
				new ProductDTO(1, "Juice", 10, LocalDate.of(2010, 11, 10), LocalDate.of(2010, 2, 10), 10, "good tasty",
						"200ml", 5, 20, 10, 3, 3, 2, 2, "Harshi", "250gms", "sugar,dioxide,corbon", "Fruti",
						LocalDate.of(2021, 10, 18), "karnataka", false, "India", "fgh45678", "jkl78", false,
						"No Warranty", LocalDate.of(2013, 10, 11), LocalDate.of(2022, 8, 18),
						LocalDate.of(2022, 8, 24)),
				new ProductDTO(2, "Horlics", 300, LocalDate.of(2023, 11, 10), LocalDate.of(2025, 2, 10), 10,
						"good health", "1kg", 5, 50, 20, 10, 5, 10, 5, "Vikas", "1.2kg", "sugar,dioxide,corbon",
						"Mothers-horlics", LocalDate.of(1995, 10, 18), "Delhi", true, "India", "bnm678", "vb4567", true,
						"No Warranty", LocalDate.of(2023, 8, 11), LocalDate.of(2023, 8, 15), LocalDate.of(2023, 8, 21)),
				new ProductDTO(3, "Boost", 500, LocalDate.of(2023, 11, 14), LocalDate.of(2027, 2, 15), 10, "good tasty",
						"1kg", 5, 56, 35, 5, 10, 3, 3, "Vijay", "250gms", "sugar,dioxide,corbon", "Fruti",
						LocalDate.of(2021, 10, 18), "karnataka", false, "India", "fgh45678", "jkl78", false,
						"No Warranty", LocalDate.of(2013, 10, 11), LocalDate.of(2022, 8, 18),
						LocalDate.of(2022, 8, 24)),
				new ProductDTO(4, "Mobile", 40000, LocalDate.of(2023, 5, 14), LocalDate.of(1947, 10, 12), 10,
						"good Processing", "200gms", 5, 20, 11, 9, 1, 0, 0, "Iphone", "380gms", "charger,headphone etc",
						"cell", LocalDate.of(2021, 10, 18), "India", true, "India", "hji4567", "cv34567", true,
						"1 year", LocalDate.of(2023, 11, 12), LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 22)),
				new ProductDTO(5, "PowerBank", 1000, LocalDate.of(2023, 10, 18), LocalDate.of(2023, 12, 10), 10,
						"Fast charging", "500grms", 5, 80, 40, 20, 15, 3, 2, "Samsung", "580grms", "Nilium corbide",
						"PowerBank", LocalDate.of(2022, 1, 18), "TamilNadu", true, "India", "jkl741", "rrt45678", true,
						"1 year", LocalDate.of(2023, 12, 10), LocalDate.of(2023, 5, 17), LocalDate.of(2023, 5, 26)),
				new ProductDTO(6, "Laptop", 38000, LocalDate.of(2021, 11, 10), LocalDate.of(2029, 2, 10), 10,
						"Bad laptop", "1.2kg", 5, 100, 40, 30, 20, 5, 5, "Dell", "1.3kg", "Hilium sulphar", "lap",
						LocalDate.of(2022, 1, 15), "Delhi", false, "India", "asd4567", "45dfg78", true, "1 year",
						LocalDate.of(2023, 10, 11), LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 27)),
				new ProductDTO(7, "Bag", 1000, LocalDate.of(2010, 11, 10), LocalDate.of(2029, 2, 10), 10,
						"good quality", "200gms", 5, 50, 30, 10, 5, 5, 0, "Dell", "250gms", "Rubber material", "Bag",
						LocalDate.of(2023, 10, 18), "Himachal Pradesh", true, "India", "ghj4567", "vb345", true,
						"1 year", LocalDate.of(2023, 10, 18), LocalDate.of(2022, 11, 18), LocalDate.of(2022, 11, 28)),
				new ProductDTO(8, "Fan", 1999, LocalDate.of(2012, 9, 14), LocalDate.of(2023, 12, 14), 10, "fan rotar",
						"1.5kg", 5, 25, 15, 5, 10, 0, 0, "Lg", "1.6kg", "Steel material", "fan",
						LocalDate.of(2023, 05, 9), "karnataka", false, "India", "fg5678", "o788", true, "1 year",
						LocalDate.of(2023, 11, 11), LocalDate.of(2023, 11, 18), LocalDate.of(2023, 11, 30)),
				new ProductDTO(9, "Shoe", 4000, LocalDate.of(2019, 11, 14), LocalDate.of(2023, 1, 16), 10,
						"sports shou", "400gms", 5, 50, 25, 10, 5, 5, 5, "Nike", "500gms", "Lather and rabber",
						"Shoues", LocalDate.of(2023, 04, 15), "Rajasthan", true, "India", "fgh45678", "df345678", true,
						"2 years", LocalDate.of(2023, 10, 11), LocalDate.of(20223, 10, 18), LocalDate.of(2023, 12, 28)),
				new ProductDTO(10, "Cloths", 5000, LocalDate.of(2010, 11, 10), LocalDate.of(2010, 4, 10), 10,
						"good quality", "200ml", 5, 55, 30, 5, 10, 10, 0, "Royal", "250gms", "cotton Fabrics",
						"fabrics", LocalDate.of(2021, 10, 18), "karnataka", true, "India", "bn4567", "jk456", true,
						"1year", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 12, 18), LocalDate.of(2023, 12, 30))));

		Comparator<ProductDTO> a = (a1, a2) -> {
			return a1.getName().compareTo(a2.getName());
		};
		Comparator<ProductDTO> aa = (a1, a2) -> {
			return a2.getName().compareTo(a1.getName());
		};
		Comparator<ProductDTO> b = (a1, a2) -> {
			return Double.compare(a1.getPrice(), a2.getPrice());
		};
		Comparator<ProductDTO> bb = (a1, a2) -> {
			return Double.compare(a2.getPrice(), a1.getPrice());
		};
		Comparator<ProductDTO> c = (a1, a2) -> {
			return a1.getManfDate().compareTo(a2.getManfDate());
		};
		Comparator<ProductDTO> cc = (a1, a2) -> {
			return a2.getManfDate().compareTo(a1.getManfDate());
		};
		Comparator<ProductDTO> d = (a1, a2) -> {
			return a1.getExpDate().compareTo(a2.getExpDate());
		};
		Comparator<ProductDTO> dd = (a1, a2) -> {
			return a2.getExpDate().compareTo(a1.getExpDate());
		};
		Comparator<ProductDTO> e = (a1, a2) -> {
			return Double.compare(a1.getDiscount(), a2.getDiscount());
		};
		Comparator<ProductDTO> ee = (a1, a2) -> {
			return Double.compare(a2.getDiscount(), a1.getDiscount());
		};
		Comparator<ProductDTO> f = (a1, a2) -> {
			return a1.getDescription().compareTo(a2.getDescription());
		};
		Comparator<ProductDTO> ff = (a1, a2) -> {
			return a2.getDescription().compareTo(a1.getDescription());
		};
		Comparator<ProductDTO> g = (a1, a2) -> {
			return a1.getQuantity().compareTo(a2.getQuantity());
		};
		Comparator<ProductDTO> gg = (a1, a2) -> {
			return a2.getQuantity().compareTo(a1.getQuantity());
		};
		Comparator<ProductDTO> h = (a1, a2) -> {
			return Integer.compare(a1.getTotalPeopleRated(), a2.getTotalPeopleRated());
		};
		Comparator<ProductDTO> hh = (a1, a2) -> {
			return Integer.compare(a2.getTotalPeopleRated(), a1.getTotalPeopleRated());
		};
		Comparator<ProductDTO> i = (a1, a2) -> {
			return Integer.compare(a1.getPeopleRatedOne(), a2.getPeopleRatedOne());
		};
		Comparator<ProductDTO> ii = (a1, a2) -> {
			return Integer.compare(a2.getPeopleRatedOne(), a1.getPeopleRatedOne());
		};
		Comparator<ProductDTO> j = (a1, a2) -> {
			return Integer.compare(a1.getPeopleRatedTwo(), a2.getPeopleRatedTwo());
		};
		Comparator<ProductDTO> jj = (a1, a2) -> {
			return Integer.compare(a2.getPeopleRatedTwo(), a1.getPeopleRatedTwo());
		};
		Comparator<ProductDTO> k = (a1, a2) -> {
			return Integer.compare(a1.getPeopleRatedThree(), a2.getPeopleRatedThree());
		};
		Comparator<ProductDTO> kk = (a1, a2) -> {
			return Integer.compare(a2.getPeopleRatedThree(), a1.getPeopleRatedThree());
		};
		Comparator<ProductDTO> l = (a1, a2) -> {
			return Integer.compare(a1.getPeopleRatedFour(), a2.getPeopleRatedFour());
		};
		Comparator<ProductDTO> ll = (a1, a2) -> {
			return Integer.compare(a2.getPeopleRatedFour(), a1.getPeopleRatedFour());
		};
		Comparator<ProductDTO> m = (a1, a2) -> {
			return Integer.compare(a1.getPeopleRatedFour(), a2.getPeopleRatedFive());
		};
		Comparator<ProductDTO> mm = (a1, a2) -> {
			return Integer.compare(a2.getPeopleRatedFour(), a1.getPeopleRatedFive());
		};
		Comparator<ProductDTO> n = (a1, a2) -> {
			return a1.getPacker().compareTo(a2.getPacker());
		};
		Comparator<ProductDTO> nn = (a1, a2) -> {
			return a2.getPacker().compareTo(a1.getPacker());
		};
		Comparator<ProductDTO> o = (a1, a2) -> {
			return a1.getTemWeight().compareTo(a2.getTemWeight());
		};
		Comparator<ProductDTO> oo = (a1, a2) -> {
			return a2.getTemWeight().compareTo(a1.getTemWeight());
		};
		Comparator<ProductDTO> p = (a1, a2) -> {
			return a1.getIncluded().compareTo(a2.getIncluded());
		};
		Comparator<ProductDTO> pp = (a1, a2) -> {
			return a2.getIncluded().compareTo(a1.getIncluded());
		};
		Comparator<ProductDTO> q = (a1, a2) -> {
			return a1.getGenericName().compareTo(a2.getGenericName());
		};
		Comparator<ProductDTO> qq = (a1, a2) -> {
			return a2.getGenericName().compareTo(a1.getGenericName());
		};
		Comparator<ProductDTO> r = (a1, a2) -> {
			return a1.getAsin().compareTo(a2.getAsin());
		};
		Comparator<ProductDTO> rr = (a1, a2) -> {
			return a2.getAsin().compareTo(a1.getAsin());
		};
		Comparator<ProductDTO> s = (a1, a2) -> {
			return a1.getCountryOfOrigin().compareTo(a2.getCountryOfOrigin());
		};
		Comparator<ProductDTO> ss = (a1, a2) -> {
			return a2.getCountryOfOrigin().compareTo(a1.getCountryOfOrigin());
		};
		Comparator<ProductDTO> t = (a1, a2) -> {
			return a1.getModelNo().compareTo(a2.getModelNo());
		};
		Comparator<ProductDTO> tt = (a1, a2) -> {
			return a2.getModelNo().compareTo(a1.getModelNo());
		};
		Comparator<ProductDTO> u = (a1, a2) -> {
			return a1.getSerialNo().compareTo(a2.getSerialNo());
		};
		Comparator<ProductDTO> uu = (a1, a2) -> {
			return a2.getSerialNo().compareTo(a1.getSerialNo());
		};
		Comparator<ProductDTO> v = (a1, a2) -> {
			return a1.getWarranty().compareTo(a2.getWarranty());
		};
		Comparator<ProductDTO> vv = (a1, a2) -> {
			return a2.getWarranty().compareTo(a1.getWarranty());
		};
		Comparator<ProductDTO> w = (a1, a2) -> {
			return a1.getPrimeDelivery().compareTo(a2.getPrimeDelivery());
		};
		Comparator<ProductDTO> ww = (a1, a2) -> {
			return a2.getPrimeDelivery().compareTo(a1.getPrimeDelivery());
		};
		Comparator<ProductDTO> x = (a1, a2) -> {
			return a1.getDeliveryExpectedDate().compareTo(a2.getDeliveryExpectedDate());
		};
		Comparator<ProductDTO> xx = (a1, a2) -> {
			return a2.getDeliveryExpectedDate().compareTo(a1.getDeliveryExpectedDate());
		};
		Comparator<ProductDTO> y = (a1, a2) -> {
			return a1.getReturnBy().compareTo(a2.getReturnBy());
		};
		Comparator<ProductDTO> yy = (a1, a2) -> {
			return a2.getReturnBy().compareTo(a1.getReturnBy());
		};

		System.out.println("\n");
		collection.stream().sorted(a).forEach(ref1 -> System.out.println(ref1.getName()));
		System.out.println("\n");
		collection.stream().sorted(aa).forEach(ref2 -> System.out.println(ref2.getName()));
		System.out.println("\n");
		collection.stream().sorted(b).forEach(ref3 -> System.out.println(ref3.getPrice()));
		System.out.println("\n");
		collection.stream().sorted(bb).forEach(ref4 -> System.out.println(ref4.getPrice()));
		System.out.println("\n");
		collection.stream().sorted(c).forEach(ref5 -> System.out.println(ref5.getManfDate()));
		System.out.println("\n");
		collection.stream().sorted(cc).forEach(ref6 -> System.out.println(ref6.getManfDate()));
		System.out.println("\n");
		collection.stream().sorted(d).forEach(ref7 -> System.out.println(ref7.getExpDate()));
		System.out.println("\n");
		collection.stream().sorted(dd).forEach(ref8 -> System.out.println(ref8.getExpDate()));
		System.out.println("\n");
		collection.stream().sorted(e).forEach(ref9 -> System.out.println(ref9.getDiscount()));
		System.out.println("\n");
		collection.stream().sorted(ee).forEach(ref10 -> System.out.println(ref10.getDiscount()));
		System.out.println("\n");
		collection.stream().sorted(f).forEach(ref11 -> System.out.println(ref11.getDescription()));
		System.out.println("\n");
		collection.stream().sorted(ff).forEach(ref12 -> System.out.println(ref12.getDescription()));
		System.out.println("\n");
		collection.stream().sorted(g).forEach(ref13 -> System.out.println(ref13.getQuantity()));
		System.out.println("\n");
		collection.stream().sorted(gg).forEach(ref14 -> System.out.println(ref14.getQuantity()));
		System.out.println("\n");
		collection.stream().sorted(h).forEach(ref15 -> System.out.println(ref15.getTotalPeopleRated()));
		System.out.println("\n");
		collection.stream().sorted(hh).forEach(ref16 -> System.out.println(ref16.getTotalPeopleRated()));
		System.out.println("\n");
		collection.stream().sorted(i).forEach(ref17 -> System.out.println(ref17.getPeopleRatedOne()));
		System.out.println("\n");
		collection.stream().sorted(ii).forEach(ref18 -> System.out.println(ref18.getPeopleRatedOne()));
		System.out.println("\n");
		collection.stream().sorted(j).forEach(ref19 -> System.out.println(ref19.getPeopleRatedTwo()));
		System.out.println("\n");
		collection.stream().sorted(jj).forEach(ref20 -> System.out.println(ref20.getPeopleRatedTwo()));
		System.out.println("\n");
		collection.stream().sorted(k).forEach(ref21 -> System.out.println(ref21.getPeopleRatedThree()));
		System.out.println("\n");
		collection.stream().sorted(kk).forEach(ref22 -> System.out.println(ref22.getPeopleRatedThree()));
		System.out.println("\n");
		collection.stream().sorted(l).forEach(ref23 -> System.out.println(ref23.getPeopleRatedFour()));
		System.out.println("\n");
		collection.stream().sorted(ll).forEach(ref24 -> System.out.println(ref24.getPeopleRatedFour()));
		System.out.println("\n");
		collection.stream().sorted(m).forEach(ref25 -> System.out.println(ref25.getPeopleRatedFive()));
		System.out.println("\n");
		collection.stream().sorted(mm).forEach(ref26 -> System.out.println(ref26.getPeopleRatedFive()));
		System.out.println("\n");
		collection.stream().sorted(n).forEach(ref27 -> System.out.println(ref27.getPacker()));
		System.out.println("\n");
		collection.stream().sorted(nn).forEach(ref28 -> System.out.println(ref28.getPacker()));
		System.out.println("\n");
		collection.stream().sorted(o).forEach(ref29 -> System.out.println(ref29.getTemWeight()));
		System.out.println("\n");
		collection.stream().sorted(oo).forEach(ref30 -> System.out.println(ref30.getTemWeight()));
		System.out.println("\n");
		collection.stream().sorted(p).forEach(ref31 -> System.out.println(ref31.getIncluded()));
		System.out.println("\n");
		collection.stream().sorted(pp).forEach(ref32 -> System.out.println(ref32.getIncluded()));
		System.out.println("\n");
		collection.stream().sorted(q).forEach(ref33 -> System.out.println(ref33.getGenericName()));
		System.out.println("\n");
		collection.stream().sorted(qq).forEach(ref33 -> System.out.println(ref33.getGenericName()));
		System.out.println("\n");
		collection.stream().sorted(r).forEach(ref34 -> System.out.println(ref34.getAsin()));
		System.out.println("\n");
		collection.stream().sorted(rr).forEach(ref34 -> System.out.println(ref34.getAsin()));
		System.out.println("\n");
		collection.stream().sorted(s).forEach(ref35 -> System.out.println(ref35.getCountryOfOrigin()));
		System.out.println("\n");
		collection.stream().sorted(ss).forEach(ref35 -> System.out.println(ref35.getCountryOfOrigin()));
		System.out.println("\n");
		collection.stream().sorted(t).forEach(ref36 -> System.out.println(ref36.getModelNo()));
		System.out.println("\n");
		collection.stream().sorted(tt).forEach(ref37 -> System.out.println(ref37.getModelNo()));
		System.out.println("\n");
		collection.stream().sorted(u).forEach(ref38 -> System.out.println(ref38.getSerialNo()));
		System.out.println("\n");
		collection.stream().sorted(uu).forEach(ref39 -> System.out.println(ref39.getSerialNo()));
		System.out.println("\n");
		collection.stream().sorted(v).forEach(ref40 -> System.out.println(ref40.getWarranty()));
		System.out.println("\n");
		collection.stream().sorted(vv).forEach(ref41 -> System.out.println(ref41.getWarranty()));
		System.out.println("\n");
		collection.stream().sorted(w).forEach(ref42 -> System.out.println(ref42.getPrimeDelivery()));
		System.out.println("\n");
		collection.stream().sorted(ww).forEach(ref43 -> System.out.println(ref43.getPrimeDelivery()));
		System.out.println("\n");
		collection.stream().sorted(x).forEach(ref44 -> System.out.println(ref44.getDeliveryExpectedDate()));
		System.out.println("\n");
		collection.stream().sorted(xx).forEach(ref45 -> System.out.println(ref45.getDeliveryExpectedDate()));
		System.out.println("\n");
		collection.stream().sorted(y).forEach(ref48 -> System.out.println(ref48.getReturnBy()));
		System.out.println("\n");
		collection.stream().sorted(yy).forEach(ref49 -> System.out.println(ref49.getReturnBy()));

		System.out.println("\n");
		collection.stream().sorted(a.thenComparing(b).thenComparing(c)).forEach(ref50 -> System.out.println(ref50));
		System.out.println("\n");
		collection.stream().sorted(g.thenComparing(h).thenComparing(i)).forEach(ref52 -> System.out.println(ref52));
		System.out.println("\n");
		collection.stream().sorted(d.thenComparing(e).thenComparing(f)).forEach(ref51 -> System.out.println(ref51));
		System.out.println("\n");
		collection.stream().sorted(j.thenComparing(k).thenComparing(l)).forEach(ref53 -> System.out.println(ref53));
		System.out.println("\n");
		collection.stream().sorted(m.thenComparing(n).thenComparing(o)).forEach(ref54 -> System.out.println(ref54));
		System.out.println("\n");
		collection.stream().sorted(p.thenComparing(q).thenComparing(r)).forEach(ref55 -> System.out.println(ref55));
		System.out.println("\n");
		collection.stream().sorted(s.thenComparing(t).thenComparing(u)).forEach(ref56 -> System.out.println(ref56));
		System.out.println("\n");
		collection.stream().sorted(v.thenComparing(w).thenComparing(x)).forEach(ref57 -> System.out.println(ref57));
		System.out.println("\n");
		collection.stream().sorted(y.thenComparing(a).thenComparing(b)).forEach(ref58 -> System.out.println(ref58));
		System.out.println("\n");
		collection.stream().sorted(d.thenComparing(h).thenComparing(f)).forEach(ref59 -> System.out.println(ref59));
		System.out.println("\n");

		collection.stream().sorted(aa.thenComparing(bb)).forEach(ref60 -> System.out.println(ref60.getName()+"=="+ref60.getPrice()));
		System.out.println("\n");
		collection.stream().sorted(hh.thenComparing(ii)).forEach(ref61 -> System.out.println(ref61.getTotalPeopleRated()+"=="+ref61.getPeopleRatedFive()));
		System.out.println("\n");
		collection.stream().sorted(cc.thenComparing(dd)).forEach(ref62 -> System.out.println(ref62.getManfDate()+"=="+ref62.getExpDate()));
		System.out.println("\n");
		collection.stream().sorted(hh.thenComparing(kk)).forEach(ref63 -> System.out.println(ref63.getTotalPeopleRated()+"=="+ref63.getPeopleRatedThree()));
		System.out.println("\n");
		collection.stream().sorted(hh.thenComparing(ll)).forEach(ref64 -> System.out.println(ref64.getTotalPeopleRated()+"=="+ref64.getPeopleRatedFour()));
		System.out.println("\n");
		collection.stream().sorted(pp.thenComparing(qq)).forEach(ref65 -> System.out.println(ref65.getIncluded()+"=="+ref65.getGenericName()));
		System.out.println("\n");
		collection.stream().sorted(ss.thenComparing(tt)).forEach(ref66 -> System.out.println(ref66.getCountryOfOrigin()+"=="+ref66.getModelNo()));
		System.out.println("\n");
		collection.stream().sorted(uu.thenComparing(vv)).forEach(ref67 -> System.out.println(ref67.getSerialNo()+"=="+ref67.getWarranty()));
		System.out.println("\n");
		collection.stream().sorted(ww.thenComparing(xx)).forEach(ref68 -> System.out.println(ref68.getPrimeDelivery()+"=="+ref68.getDeliveryExpectedDate()));
		System.out.println("\n");
		collection.stream().sorted(tt.thenComparing(yy)).forEach(ref69 -> System.out.println(ref69.getModelNo()+"=="+ref69.getReturnBy()));

	}

}
