package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DiseaseDTO {

	private String name;
	private int severity;
	private double mortalityRate;
	private boolean contagious;
	private char category;
	private long cases;
	private short incubationPeriod;
	private byte transmissionRisk;
	private float recoveryRate;
	private LocalDate diagnosisDate;
	private LocalDateTime lastUpdated;

	public DiseaseDTO(String string, int i, int j, boolean b, String string2, long l, int k, int m, float f, LocalDate localDate, LocalDateTime localDateTime) {
		super();
	}

	public DiseaseDTO(String name, int severity, double mortalityRate, boolean contagious, char category, long cases,
			short incubationPeriod, byte transmissionRisk, float recoveryRate, LocalDate diagnosisDate,
			LocalDateTime lastUpdated) {
		super();
		this.name = name;
		this.severity = severity;
		this.mortalityRate = mortalityRate;
		this.contagious = contagious;
		this.category = category;
		this.cases = cases;
		this.incubationPeriod = incubationPeriod;
		this.transmissionRisk = transmissionRisk;
		this.recoveryRate = recoveryRate;
		this.diagnosisDate = diagnosisDate;
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "DiseaseDTO [name=" + name + ", severity=" + severity + ", mortalityRate=" + mortalityRate
				+ ", contagious=" + contagious + ", category=" + category + ", cases=" + cases + ", incubationPeriod="
				+ incubationPeriod + ", transmissionRisk=" + transmissionRisk + ", recoveryRate=" + recoveryRate
				+ ", diagnosisDate=" + diagnosisDate + ", lastUpdated=" + lastUpdated + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cases ^ (cases >>> 32));
		result = prime * result + category;
		result = prime * result + (contagious ? 1231 : 1237);
		result = prime * result + ((diagnosisDate == null) ? 0 : diagnosisDate.hashCode());
		result = prime * result + incubationPeriod;
		result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mortalityRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(recoveryRate);
		result = prime * result + severity;
		result = prime * result + transmissionRisk;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiseaseDTO other = (DiseaseDTO) obj;
		if (cases != other.cases)
			return false;
		if (category != other.category)
			return false;
		if (contagious != other.contagious)
			return false;
		if (diagnosisDate == null) {
			if (other.diagnosisDate != null)
				return false;
		} else if (!diagnosisDate.equals(other.diagnosisDate))
			return false;
		if (incubationPeriod != other.incubationPeriod)
			return false;
		if (lastUpdated == null) {
			if (other.lastUpdated != null)
				return false;
		} else if (!lastUpdated.equals(other.lastUpdated))
			return false;
		if (Double.doubleToLongBits(mortalityRate) != Double.doubleToLongBits(other.mortalityRate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(recoveryRate) != Float.floatToIntBits(other.recoveryRate))
			return false;
		if (severity != other.severity)
			return false;
		if (transmissionRisk != other.transmissionRisk)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public double getMortalityRate() {
		return mortalityRate;
	}

	public void setMortalityRate(double mortalityRate) {
		this.mortalityRate = mortalityRate;
	}

	public boolean isContagious() {
		return contagious;
	}

	public void setContagious(boolean contagious) {
		this.contagious = contagious;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public long getCases() {
		return cases;
	}

	public void setCases(long cases) {
		this.cases = cases;
	}

	public short getIncubationPeriod() {
		return incubationPeriod;
	}

	public void setIncubationPeriod(short incubationPeriod) {
		this.incubationPeriod = incubationPeriod;
	}

	public byte getTransmissionRisk() {
		return transmissionRisk;
	}

	public void setTransmissionRisk(byte transmissionRisk) {
		this.transmissionRisk = transmissionRisk;
	}

	public float getRecoveryRate() {
		return recoveryRate;
	}

	public void setRecoveryRate(float recoveryRate) {
		this.recoveryRate = recoveryRate;
	}

	public LocalDate getDiagnosisDate() {
		return diagnosisDate;
	}

	public void setDiagnosisDate(LocalDate diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}