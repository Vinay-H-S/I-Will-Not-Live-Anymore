package com.xworkz.collection;

import java.time.LocalDate;
import java.util.Objects;

public class CountryDTO {

	private int id;
	private String name;
	private String capitalCity;
	private long population;
	private boolean independent;
	private LocalDate independenceDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;
	private String nationalSport;
	private String primeMinisterName;

	public CountryDTO() {
		super();
	}

	public CountryDTO(int id, String name, String capitalCity, long population, boolean independent,
			LocalDate independenceDate, int noOfStates, String primaryReligion, String nationalAnimal,
			String nationalBird, String nationalSport, String primeMinisterName) {
		super();
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
		this.independent = independent;
		this.independenceDate = independenceDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;
		this.nationalSport = nationalSport;
		this.primeMinisterName = primeMinisterName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public LocalDate getIndependenceDate() {
		return independenceDate;
	}

	public void setIndependenceDate(LocalDate independenceDate) {
		this.independenceDate = independenceDate;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getPrimaryReligion() {
		return primaryReligion;
	}

	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}

	public String getNationalSport() {
		return nationalSport;
	}

	public void setNationalSport(String nationalSport) {
		this.nationalSport = nationalSport;
	}

	public String getPrimeMinisterName() {
		return primeMinisterName;
	}

	public void setPrimeMinisterName(String primeMinisterName) {
		this.primeMinisterName = primeMinisterName;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", capitalCity=" + capitalCity + ", population=" + population
				+ ", independent=" + independent + ", independenceDate=" + independenceDate + ", noOfStates="
				+ noOfStates + ", primaryReligion=" + primaryReligion + ", nationalAnimal=" + nationalAnimal
				+ ", nationalBird=" + nationalBird + ", nationalSport=" + nationalSport + ", primeMinisterName="
				+ primeMinisterName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalCity, id, independenceDate, independent, name, nationalAnimal, nationalBird,
				nationalSport, noOfStates, population, primaryReligion, primeMinisterName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		return Objects.equals(capitalCity, other.capitalCity) && id == other.id
				&& Objects.equals(independenceDate, other.independenceDate) && independent == other.independent
				&& Objects.equals(name, other.name) && Objects.equals(nationalAnimal, other.nationalAnimal)
				&& Objects.equals(nationalBird, other.nationalBird)
				&& Objects.equals(nationalSport, other.nationalSport) && noOfStates == other.noOfStates
				&& population == other.population && Objects.equals(primaryReligion, other.primaryReligion)
				&& Objects.equals(primeMinisterName, other.primeMinisterName);
	}

	

}