package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.DiseaseDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DiseaseRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in DiseaseRunner...");
		Collection<DiseaseDTO> disease = new ArrayList<>();

		DiseaseDTO neurofibromatosis = new DiseaseDTO("Neurofibromatosis", 4, 0.04, false, 'N', 12000, (short) 14,
				(byte) 3, 0.78, LocalDate.of(2005, 5, 12), LocalDateTime.of(2005, 5, 12, 10, 30));
		DiseaseDTO vonHippelLindauDisease = new DiseaseDTO("Von Hippel-Lindau Disease", 5, 0.05, false, 'V', 8500,
				(short) 20, (byte) 4, 0.74, LocalDate.of(2008, 8, 23), LocalDateTime.of(2008, 8, 23, 14, 45));
		DiseaseDTO restlessLegsSyndrome = new DiseaseDTO("Restless Legs Syndrome", 3, 0.02, true, 'R', 25000, (short) 8,
				(byte) 2, 0.85, LocalDate.of(2010, 6, 7), LocalDateTime.of(2010, 6, 7, 9, 15));
		DiseaseDTO lichenPlanus = new DiseaseDTO("Lichen Planus", 2, 0.01, false, 'L', 5000, (short) 6, (byte) 1, 0.92,
				LocalDate.of(2013, 2, 14), LocalDateTime.of(2013, 2, 14, 18, 20));
		DiseaseDTO raynaudsDisease = new DiseaseDTO("Raynaud's Disease", 2, 0.01, false, 'R', 7500, (short) 10,
				(byte) 2, 0.88, LocalDate.of(2016, 11, 30), LocalDateTime.of(2016, 11, 30, 11, 50));
		DiseaseDTO kaposiSarcoma = new DiseaseDTO("Kaposi's Sarcoma", 5, 0.06, false, 'K', 4500, (short) 8, (byte) 3,
				0.71, LocalDate.of(2019, 3, 19), LocalDateTime.of(2019, 3, 19, 15, 40));
		DiseaseDTO polymyalgiaRheumatica = new DiseaseDTO("Polymyalgia Rheumatica", 3, 0.03, false, 'P', 6800,
				(short) 12, (byte) 2, 0.80, LocalDate.of(2017, 9, 2), LocalDateTime.of(2017, 9, 2, 12, 10));
		DiseaseDTO behcetsDisease = new DiseaseDTO("Behçet's Disease", 4, 0.04, true, 'B', 3400, (short) 15, (byte) 3,
				0.76, LocalDate.of(2020, 7, 10), LocalDateTime.of(2020, 7, 10, 8, 30));
		DiseaseDTO alkaptonuria = new DiseaseDTO("Alkaptonuria", 3, 0.02, false, 'A', 150, (short) 20, (byte) 1, 0.95,
				LocalDate.of(2015, 12, 5), LocalDateTime.of(2015, 12, 5, 17, 15));
		DiseaseDTO alpha1AntitrypsinDeficiency = new DiseaseDTO("Alpha-1 Antitrypsin Deficiency", 4, 0.05, false, 'A',
				2000, (short) 18, (byte) 3, 0.73, LocalDate.of(2018, 4, 28), LocalDateTime.of(2018, 4, 28, 14, 55));
		DiseaseDTO stevensJohnsonSyndrome = new DiseaseDTO("Stevens-Johnson Syndrome", 4, 0.03, true, 'S', 620,
				(short) 7, (byte) 2, 0.82, LocalDate.of(2017, 1, 15), LocalDateTime.of(2017, 1, 15, 19, 20));
		DiseaseDTO sjogrensSyndrome = new DiseaseDTO("Sjögren's Syndrome", 3, 0.01, true, 'S', 8500, (short) 12,
				(byte) 2, 0.89, LocalDate.of(2016, 6, 30), LocalDateTime.of(2016, 6, 30, 11, 30));
		DiseaseDTO creutzfeldtJakobDisease = new DiseaseDTO("Creutzfeldt-Jakob Disease", 5, 0.07, false, 'C', 220,
				(short) 4, (byte) 2, 0.67, LocalDate.of(2014, 3, 8), LocalDateTime.of(2014, 3, 8, 8, 40));
		DiseaseDTO huntingtonsDisease = new DiseaseDTO("Huntington's Disease", 4, 0.06, false, 'H', 1800, (short) 16,
				(byte) 3, 0.70, LocalDate.of(2013, 10, 1), LocalDateTime.of(2013, 10, 1, 16, 25));
		DiseaseDTO taySachsDisease = new DiseaseDTO("Tay-Sachs Disease", 5, 0.08, false, 'T', 120, (short) 6, (byte) 1,
				0.63, LocalDate.of(2010, 11, 12), LocalDateTime.of(2010, 11, 12, 10, 10));
		DiseaseDTO niemannPickDisease = new DiseaseDTO("Niemann-Pick Disease", 5, 0.09, false, 'N', 320, (short) 8,
				(byte) 2, 0.66, LocalDate.of(2012, 5, 22), LocalDateTime.of(2012, 5, 22, 15, 50));
		DiseaseDTO gaucherDisease = new DiseaseDTO("Gaucher Disease", 4, 0.06, false, 'G', 480, (short) 10, (byte) 2,
				0.68, LocalDate.of(2011, 8, 3), LocalDateTime.of(2011, 8, 3, 17, 35));
		DiseaseDTO krabbeDisease = new DiseaseDTO("Krabbe Disease", 5, 0.07, false, 'K', 110, (short) 6, (byte) 1, 0.62,
				LocalDate.of(2009, 7, 10), LocalDateTime.of(2009, 7, 10, 12, 15));
		DiseaseDTO fabryDisease = new DiseaseDTO("Fabry Disease", 4, 0.05, false, 'F', 420, (short) 8, (byte) 2, 0.65,
				LocalDate.of(2018, 9, 15), LocalDateTime.of(2018, 9, 15, 14, 45));
		DiseaseDTO sandhoffDisease = new DiseaseDTO("Sandhoff Disease", 5, 0.06, false, 'S', 95, (short) 4, (byte) 1,
				0.61, LocalDate.of(2017, 2, 19), LocalDateTime.of(2017, 2, 19, 9, 20));

		DiseaseDTO wilsonDisease = new DiseaseDTO("Wilson Disease", 5, 0.05, true, 'W', 1000, (short) 7, (byte) 3, 0.9f,
				LocalDate.of(2000, 5, 15), LocalDateTime.of(2001, 3, 10, 8, 30));
		DiseaseDTO hirschsprungDisease = new DiseaseDTO("Hirschsprung's Disease", 4, 0.04, true, 'H', 800, (short) 10,
				(byte) 2, 0.85f, LocalDate.of(2002, 8, 20), LocalDateTime.of(2003, 6, 5, 14, 45));
		DiseaseDTO vonWillebrandDisease = new DiseaseDTO("Von Willebrand Disease", 3, 0.03, true, 'V', 700, (short) 8,
				(byte) 1, 0.8f, LocalDate.of(2004, 11, 5), LocalDateTime.of(2005, 9, 15, 6, 10));
		DiseaseDTO factorVLeiden = new DiseaseDTO("Factor V Leiden", 2, 0.02, true, 'F', 600, (short) 12, (byte) 2,
				0.75f, LocalDate.of(2006, 2, 10), LocalDateTime.of(2007, 1, 25, 9, 20));
		DiseaseDTO hemochromatosis = new DiseaseDTO("Hemochromatosis", 4, 0.06, true, 'H', 550, (short) 10, (byte) 3,
				0.7f, LocalDate.of(2008, 4, 5), LocalDateTime.of(2009, 3, 20, 7, 45));
		DiseaseDTO pompeDisease = new DiseaseDTO("Pompe Disease", 5, 0.07, true, 'P', 400, (short) 15, (byte) 4, 0.65f,
				LocalDate.of(2010, 7, 15), LocalDateTime.of(2011, 6, 30, 5, 15));
		DiseaseDTO achondroplasia = new DiseaseDTO("Achondroplasia", 2, 0.03, true, 'A', 300, (short) 14, (byte) 2,
				0.6f, LocalDate.of(2012, 9, 20), LocalDateTime.of(2013, 8, 10, 11, 30));
		DiseaseDTO turnerSyndrome = new DiseaseDTO("Turner Syndrome", 3, 0.04, true, 'T', 250, (short) 9, (byte) 1,
				0.55f, LocalDate.of(2014, 12, 5), LocalDateTime.of(2015, 11, 25, 10, 20));
		DiseaseDTO klinefelterSyndrome = new DiseaseDTO("Klinefelter Syndrome", 3, 0.03, true, 'K', 150, (short) 11,
				(byte) 2, 0.5f, LocalDate.of(2016, 3, 20), LocalDateTime.of(2017, 2, 15, 4, 40));
		DiseaseDTO diGeorgeSyndrome = new DiseaseDTO("DiGeorge Syndrome", 4, 0.05, true, 'D', 350, (short) 12, (byte) 3,
				0.45f, LocalDate.of(2018, 5, 15), LocalDateTime.of(2019, 4, 5, 12, 25));
		DiseaseDTO fragileXSyndrome = new DiseaseDTO("Fragile X Syndrome", 3, 0.04, true, 'F', 450, (short) 10,
				(byte) 2, 0.4f, LocalDate.of(2020, 8, 25), LocalDateTime.of(2021, 7, 30, 9, 15));
		DiseaseDTO praderWilliSyndrome = new DiseaseDTO("Prader-Willi Syndrome", 2, 0.03, true, 'P', 550, (short) 13,
				(byte) 3, 0.35f, LocalDate.of(2022, 10, 5), LocalDateTime.of(2023, 9, 20, 10, 10));
		DiseaseDTO rettSyndrome = new DiseaseDTO("Rett Syndrome", 4, 0.05, true, 'R', 650, (short) 8, (byte) 1, 0.3f,
				LocalDate.of(2024, 11, 30), LocalDateTime.of(2025, 10, 10, 8, 5));
		DiseaseDTO crouzonSyndrome = new DiseaseDTO("Crouzon Syndrome", 3, 0.04, true, 'C', 750, (short) 7, (byte) 2,
				0.25f, LocalDate.of(2026, 1, 15), LocalDateTime.of(2027, 12, 25, 7, 55));
		DiseaseDTO marfanSyndrome = new DiseaseDTO("Marfan Syndrome", 2, 0.03, true, 'M', 850, (short) 9, (byte) 3,
				0.2f, LocalDate.of(2028, 3, 10), LocalDateTime.of(2029, 2, 5, 6, 30));
		DiseaseDTO williamsSyndrome = new DiseaseDTO("Williams Syndrome", 5, 0.05, true, 'W', 950, (short) 10, (byte) 4,
				0.15f, LocalDate.of(2030, 6, 20), LocalDateTime.of(2031, 5, 15, 5, 50));
		DiseaseDTO africanSleepingSickness = new DiseaseDTO("African Sleeping Sickness", 8, 0.02, true, 'A', 1000,
				(short) 14, (byte) 4, 0.9, LocalDate.of(1990, 1, 15), LocalDateTime.now());
		DiseaseDTO trachoma = new DiseaseDTO("Trachoma", 6, 0.03, true, 'T', 2500, (short) 10, (byte) 2, 0.8,
				LocalDate.of(1995, 3, 20), LocalDateTime.now());
		DiseaseDTO dengueFever = new DiseaseDTO("Dengue Fever", 7, 0.04, true, 'D', 15000, (short) 7, (byte) 3, 0.85,
				LocalDate.of(2000, 5, 10), LocalDateTime.now());
		DiseaseDTO yellowFever = new DiseaseDTO("Yellow Fever", 9, 0.1, true, 'Y', 3000, (short) 12, (byte) 5, 0.7,
				LocalDate.of(1998, 2, 5), LocalDateTime.now());
		DiseaseDTO zikaVirus = new DiseaseDTO("Zika Virus", 5, 0.02, true, 'Z', 5000, (short) 5, (byte) 1, 0.92,
				LocalDate.of(2016, 6, 30), LocalDateTime.now());
		DiseaseDTO japaneseEncephalitis = new DiseaseDTO("Japanese Encephalitis", 8, 0.05, true, 'J', 7500, (short) 14,
				(byte) 4, 0.8, LocalDate.of(2005, 7, 12), LocalDateTime.now());
		DiseaseDTO westNileVirus = new DiseaseDTO("West Nile Virus", 6, 0.03, true, 'W', 6500, (short) 8, (byte) 2,
				0.86, LocalDate.of(2002, 8, 25), LocalDateTime.now());
		DiseaseDTO lymeDisease = new DiseaseDTO("Lyme Disease", 7, 0.03, true, 'L', 8500, (short) 12, (byte) 3, 0.9,
				LocalDate.of(1997, 10, 5), LocalDateTime.now());
		DiseaseDTO rockyMountainSpottedFever = new DiseaseDTO("Rocky Mountain Spotted Fever", 8, 0.05, true, 'R', 4000,
				(short) 10, (byte) 2, 0.84, LocalDate.of(2001, 4, 20), LocalDateTime.now());
		DiseaseDTO qFever = new DiseaseDTO("Q Fever", 7, 0.02, true, 'Q', 2000, (short) 8, (byte) 2, 0.88,
				LocalDate.of(2007, 9, 15), LocalDateTime.now());
		DiseaseDTO tularemia = new DiseaseDTO("Tularemia", 6, 0.01, true, 'T', 2500, (short) 9, (byte) 3, 0.87,
				LocalDate.of(2003, 11, 3), LocalDateTime.now());
		DiseaseDTO hantavirusPulmonarySyndrome = new DiseaseDTO("Hantavirus Pulmonary Syndrome", 9, 0.06, true, 'H',
				1000, (short) 15, (byte) 4, 0.78, LocalDate.of(2006, 12, 31), LocalDateTime.now());
		DiseaseDTO riftValleyFever = new DiseaseDTO("Rift Valley Fever", 7, 0.04, true, 'R', 3000, (short) 11, (byte) 3,
				0.86, LocalDate.of(2010, 8, 18), LocalDateTime.now());
		DiseaseDTO crimeanCongoHemorrhagicFever = new DiseaseDTO("Crimean-Congo Hemorrhagic Fever", 8, 0.07, true, 'C',
				1200, (short) 12, (byte) 4, 0.76, LocalDate.of(2014, 7, 20), LocalDateTime.now());
		DiseaseDTO anthrax = new DiseaseDTO("Anthrax", 7, 0.03, true, 'A', 4500, (short) 9, (byte) 2, 0.9,
				LocalDate.of(1996, 6, 5), LocalDateTime.now());
		DiseaseDTO botulism = new DiseaseDTO("Botulism", 8, 0.05, true, 'B', 800, (short) 10, (byte) 3, 0.74,
				LocalDate.of(2008, 3, 15), LocalDateTime.now());
		DiseaseDTO tetanus = new DiseaseDTO("Tetanus", 6, 0.02, true, 'T', 3500, (short) 8, (byte) 1, 0.92,
				LocalDate.of(2000, 2, 11), LocalDateTime.now());
		DiseaseDTO smallpox = new DiseaseDTO("Smallpox", 9, 0.1, true, 'S', 15000, (short) 15, (byte) 4, 0.7,
				LocalDate.of(1980, 12, 31), LocalDateTime.now());
		DiseaseDTO bubonicPlague = new DiseaseDTO("Bubonic Plague", 8, 0.08, true, 'B', 6000, (short) 14, (byte) 3,
				0.75, LocalDate.of(2003, 9, 4), LocalDateTime.now());
		DiseaseDTO mumps = new DiseaseDTO("Mumps", 6, 0.02, true, 'M', 2000, (short) 10, (byte) 2, 0.88,
				LocalDate.of(1995, 5, 10), LocalDateTime.now());
		DiseaseDTO diphtheria = new DiseaseDTO("Diphtheria", 7, 0.03, true, 'D', 3500, (short) 12, (byte) 3, 0.86,
				LocalDate.of(2001, 6, 30), LocalDateTime.now());
		DiseaseDTO whoopingCough = new DiseaseDTO("Whooping Cough (Pertussis)", 8, 0.04, true, 'W', 4500, (short) 8,
				(byte) 1, 0.9, LocalDate.of(2006, 7, 12), LocalDateTime.now());
		DiseaseDTO tuberculosis = new DiseaseDTO("Tuberculosis", 7, 0.03, true, 'T', 6000, (short) 10, (byte) 2, 0.86,
				LocalDate.of(2010, 8, 25), LocalDateTime.now());
		DiseaseDTO pneumocystisPneumonia = new DiseaseDTO("Pneumocystis Pneumonia", 6, 0.02, true, 'P', 2500, (short) 5,
				(byte) 1, 0.92, LocalDate.of(2007, 4, 20), LocalDateTime.now());
		DiseaseDTO histoplasmosis = new DiseaseDTO("Histoplasmosis", 8, 0.03, true, 'H', 3000, (short) 9, (byte) 3,
				0.87, LocalDate.of(2013, 9, 15), LocalDateTime.now());
		DiseaseDTO blastomycosis = new DiseaseDTO("Blastomycosis", 7, 0.02, true, 'B', 2000, (short) 12, (byte) 4, 0.85,
				LocalDate.of(2011, 11, 3), LocalDateTime.now());
		DiseaseDTO coccidioidomycosis = new DiseaseDTO("Coccidioidomycosis", 9, 0.05, true, 'C', 1000, (short) 14,
				(byte) 4, 0.78, LocalDate.of(2008, 12, 31), LocalDateTime.now());
		DiseaseDTO cryptococcosis = new DiseaseDTO("Cryptococcosis", 6, 0.03, true, 'C', 5000, (short) 15, (byte) 5,
				0.74, LocalDate.of(2012, 7, 20), LocalDateTime.now());
		DiseaseDTO aspergillosis = new DiseaseDTO("Aspergillosis", 7, 0.04, true, 'A', 3000, (short) 14, (byte) 3, 0.8,
				LocalDate.of(2017, 3, 15), LocalDateTime.now());
		DiseaseDTO candidiasis = new DiseaseDTO("Candidiasis", 8, 0.03, true, 'C', 1500, (short) 10, (byte) 2, 0.86,
				LocalDate.of(2014, 4, 11), LocalDateTime.now());
		DiseaseDTO pneumonia = new DiseaseDTO("Pneumonia", 7, 0.1, true, 'R', 10000, (short) 14, (byte) 3, 0.92,
				LocalDate.of(2022, 5, 10), LocalDateTime.now());
		DiseaseDTO bronchitis = new DiseaseDTO("Bronchitis", 5, 0.05, true, 'R', 5000, (short) 10, (byte) 2, 0.95,
				LocalDate.of(2022, 4, 15), LocalDateTime.now());
		DiseaseDTO emphysema = new DiseaseDTO("Emphysema", 6, 0.08, true, 'R', 7500, (short) 12, (byte) 2, 0.91,
				LocalDate.of(2022, 3, 20), LocalDateTime.now());
		DiseaseDTO pulmonaryFib = new DiseaseDTO("Pulmonary fibrosis", 8, 0.15, true, 'R', 10000, (short) 18, (byte) 3,
				0.88, LocalDate.of(2022, 2, 5), LocalDateTime.now());
		DiseaseDTO pneumothorax = new DiseaseDTO("Pneumothorax", 6, 0.07, true, 'R', 6000, (short) 16, (byte) 2, 0.93,
				LocalDate.of(2022, 1, 2), LocalDateTime.now());
		DiseaseDTO sarcoidosis = new DiseaseDTO("Sarcoidosis", 4, 0.02, true, 'R', 2500, (short) 20, (byte) 1, 0.97,
				LocalDate.of(2022, 11, 10), LocalDateTime.now());
		DiseaseDTO myocarditis = new DiseaseDTO("Myocarditis", 8, 0.18, true, 'C', 2000, (short) 14, (byte) 3, 0.85,
				LocalDate.of(2022, 10, 25), LocalDateTime.now());
		DiseaseDTO pericarditis = new DiseaseDTO("Pericarditis", 5, 0.04, true, 'C', 1800, (short) 12, (byte) 2, 0.94,
				LocalDate.of(2022, 8, 10), LocalDateTime.now());
		DiseaseDTO endocarditis = new DiseaseDTO("Endocarditis", 6, 0.06, true, 'C', 2200, (short) 14, (byte) 2, 0.92,
				LocalDate.of(2022, 7, 15), LocalDateTime.now());
		DiseaseDTO atherosclerosis = new DiseaseDTO("Atherosclerosis", 7, 0.1, true, 'C', 3500, (short) 18, (byte) 3,
				0.88, LocalDate.of(2022, 6, 20), LocalDateTime.now());
		DiseaseDTO aorticAneurysm = new DiseaseDTO("Aortic Aneurysm", 8, 0.12, true, 'C', 2600, (short) 20, (byte) 3,
				0.87, LocalDate.of(2022, 5, 5), LocalDateTime.now());
		DiseaseDTO peripheralArteryDisease = new DiseaseDTO("Peripheral Artery Disease", 6, 0.1, true, 'V', 2900,
				(short) 16, (byte) 2, 0.93, LocalDate.of(2022, 4, 2), LocalDateTime.now());
		DiseaseDTO varicoseVeins = new DiseaseDTO("Varicose Veins", 4, 0.03, true, 'V', 1700, (short) 12, (byte) 2,
				0.95, LocalDate.of(2022, 2, 15), LocalDateTime.now());
		DiseaseDTO deepVeinThrombosis = new DiseaseDTO("Deep Vein Thrombosis", 6, 0.07, true, 'V', 2200, (short) 16,
				(byte) 3, 0.91, LocalDate.of(2022, 1, 10), LocalDateTime.now());
		DiseaseDTO pulmonaryEmb = new DiseaseDTO("Pulmonary Embolism", 7, 0.08, true, 'V', 2500, (short) 14, (byte) 3,
				0.92, LocalDate.of(2022, 11, 20), LocalDateTime.now());
		DiseaseDTO hirschsprungsDisease = new DiseaseDTO("Hirschsprung's Disease", 5, 0.02, true, 'I', 1500, (short) 18,
				(byte) 2, 0.94, LocalDate.of(2022, 10, 5), LocalDateTime.now());
		DiseaseDTO diverticulitis = new DiseaseDTO("Diverticulitis", 6, 0.04, true, 'I', 1800, (short) 12, (byte) 2,
				0.95, LocalDate.of(2022, 8, 25), LocalDateTime.now());
		DiseaseDTO gerd = new DiseaseDTO("Gastroesophageal Reflux Disease (GERD)", 7, 0.05, true, 'I', 2300, (short) 16,
				(byte) 3, 0.93, LocalDate.of(2022, 7, 15), LocalDateTime.now());
		DiseaseDTO pepticUlcers = new DiseaseDTO("Peptic Ulcers", 4, 0.03, true, 'I', 1700, (short) 14, (byte) 2, 0.96,
				LocalDate.of(2022, 6, 1), LocalDateTime.now());
		DiseaseDTO pancreatitis = new DiseaseDTO("Pancreatitis", 6, 0.06, true, 'I', 2100, (short) 20, (byte) 3, 0.92,
				LocalDate.of(2022, 4, 10), LocalDateTime.now());
		DiseaseDTO gallstones = new DiseaseDTO("Gallstones", 3, 0.02, false, 'G', 5000, (short) 7, (byte) 2, 0.92,
				LocalDate.of(2022, 3, 15), LocalDateTime.now());
		DiseaseDTO cirrhosis = new DiseaseDTO("Cirrhosis", 7, 0.1, false, 'C', 10000, (short) 10, (byte) 3, 0.85,
				LocalDate.of(2022, 4, 20), LocalDateTime.now());
		DiseaseDTO hepaticSteatosis = new DiseaseDTO("Hepatic steatosis", 2, 0.01, false, 'H', 2500, (short) 5,
				(byte) 1, 0.94, LocalDate.of(2022, 5, 10), LocalDateTime.now());
		DiseaseDTO hemorrhoids = new DiseaseDTO("Hemorrhoids", 1, 0.005, false, 'H', 8000, (short) 2, (byte) 1, 0.98,
				LocalDate.of(2022, 6, 7), LocalDateTime.now());
		DiseaseDTO crohnsDisease = new DiseaseDTO("Crohn's Disease", 6, 0.07, true, 'C', 15000, (short) 14, (byte) 3,
				0.88, LocalDate.of(2022, 7, 19), LocalDateTime.now());
		DiseaseDTO ulcerativeColitis = new DiseaseDTO("Ulcerative colitis", 5, 0.06, true, 'U', 12000, (short) 11,
				(byte) 2, 0.91, LocalDate.of(2022, 8, 3), LocalDateTime.now());
		DiseaseDTO gastricCancer = new DiseaseDTO("Gastric Cancer", 8, 0.12, false, 'G', 3000, (short) 8, (byte) 4,
				0.80, LocalDate.of(2022, 9, 14), LocalDateTime.now());
		DiseaseDTO liverCancer = new DiseaseDTO("Liver Cancer", 9, 0.15, false, 'L', 5000, (short) 9, (byte) 4, 0.79,
				LocalDate.of(2022, 10, 22), LocalDateTime.now());
		DiseaseDTO esophagealCancer = new DiseaseDTO("Esophageal Cancer", 9, 0.14, false, 'E', 3500, (short) 7,
				(byte) 3, 0.82, LocalDate.of(2022, 11, 9), LocalDateTime.now());
		DiseaseDTO colonCancer = new DiseaseDTO("Colon Cancer", 8, 0.11, false, 'C', 5500, (short) 8, (byte) 4, 0.84,
				LocalDate.of(2022, 12, 7), LocalDateTime.now());
		DiseaseDTO rectalCancer = new DiseaseDTO("Rectal Cancer", 7, 0.1, false, 'R', 4500, (short) 7, (byte) 3, 0.86,
				LocalDate.of(2023, 1, 4), LocalDateTime.now());
		DiseaseDTO analCancer = new DiseaseDTO("Anal Cancer", 7, 0.09, false, 'A', 3000, (short) 6, (byte) 2, 0.89,
				LocalDate.of(2023, 2, 15), LocalDateTime.now());
		DiseaseDTO ovarianCancer = new DiseaseDTO("Ovarian Cancer", 9, 0.13, false, 'O', 9000, (short) 9, (byte) 4,
				0.81, LocalDate.of(2023, 3, 22), LocalDateTime.now());
		DiseaseDTO uterineCancer = new DiseaseDTO("Uterine Cancer", 8, 0.12, false, 'U', 6500, (short) 8, (byte) 3,
				0.83, LocalDate.of(2023, 4, 7), LocalDateTime.now());
		DiseaseDTO cervicalCancer = new DiseaseDTO("Cervical Cancer", 7, 0.1, false, 'C', 4000, (short) 7, (byte) 2,
				0.87, LocalDate.of(2023, 5, 14), LocalDateTime.now());
		DiseaseDTO vaginalCancer = new DiseaseDTO("Vaginal Cancer", 6, 0.09, false, 'V', 2000, (short) 6, (byte) 1, 0.9,
				LocalDate.of(2023, 6, 9), LocalDateTime.now());
		DiseaseDTO vulvarCancer = new DiseaseDTO("Vulvar Cancer", 5, 0.08, false, 'V', 1500, (short) 5, (byte) 1, 0.93,
				LocalDate.of(2023, 7, 18), LocalDateTime.now());
		DiseaseDTO testicularCancer = new DiseaseDTO("Testicular Cancer", 8, 0.11, false, 'T', 2500, (short) 6,
				(byte) 2, 0.89, LocalDate.of(2023, 8, 25), LocalDateTime.now());
		DiseaseDTO penileCancer = new DiseaseDTO("Penile Cancer", 7, 0.1, false, 'P', 1000, (short) 5, (byte) 1, 0.92,
				LocalDate.of(2023, 9, 12), LocalDateTime.now());
		DiseaseDTO prostateCancer = new DiseaseDTO("Prostate Cancer", 8, 0.12, false, 'P', 8000, (short) 7, (byte) 3,
				0.85, LocalDate.of(2023, 10, 6), LocalDateTime.now());
		DiseaseDTO bladderCancer = new DiseaseDTO("Bladder Cancer", 8, 0.3, true, 'C', 10000, (short) 14, (byte) 3,
				0.7f, LocalDate.of(2022, 5, 15), LocalDateTime.of(2022, 5, 15, 10, 30));
		DiseaseDTO renalCellCarcinoma = new DiseaseDTO("Renal Cell Carcinoma", 7, 0.2, true, 'C', 7500, (short) 12,
				(byte) 2, 0.65f, LocalDate.of(2022, 6, 20), LocalDateTime.of(2022, 6, 20, 9, 45));
		DiseaseDTO wilmsTumor = new DiseaseDTO("Wilms Tumor", 6, 0.15, true, 'C', 2500, (short) 10, (byte) 2, 0.6f,
				LocalDate.of(2022, 7, 10), LocalDateTime.of(2022, 7, 10, 15, 20));
		DiseaseDTO adrenalGlandTumors = new DiseaseDTO("Adrenal Gland Tumors", 5, 0.1, true, 'C', 3500, (short) 8,
				(byte) 1, 0.55f, LocalDate.of(2022, 8, 5), LocalDateTime.of(2022, 8, 5, 11, 15));
		DiseaseDTO neuroblastoma = new DiseaseDTO("Neuroblastoma", 6, 0.12, true, 'C', 5000, (short) 9, (byte) 2, 0.58f,
				LocalDate.of(2022, 9, 30), LocalDateTime.of(2022, 9, 30, 8, 50));
		DiseaseDTO retinoblastoma = new DiseaseDTO("Retinoblastoma", 4, 0.05, true, 'C', 2000, (short) 6, (byte) 1,
				0.5f, LocalDate.of(2022, 10, 12), LocalDateTime.of(2022, 10, 12, 13, 10));
		DiseaseDTO osteosarcoma = new DiseaseDTO("Osteosarcoma", 7, 0.2, true, 'C', 4500, (short) 11, (byte) 2, 0.65f,
				LocalDate.of(2022, 11, 25), LocalDateTime.of(2022, 11, 25, 17, 30));
		DiseaseDTO ewingSarcoma = new DiseaseDTO("Ewing Sarcoma", 6, 0.18, true, 'C', 3000, (short) 9, (byte) 2, 0.6f,
				LocalDate.of(2023, 1, 5), LocalDateTime.of(2023, 1, 5, 10, 15));
		DiseaseDTO synovialSarcoma = new DiseaseDTO("Synovial Sarcoma", 6, 0.15, true, 'C', 2700, (short) 8, (byte) 2,
				0.58f, LocalDate.of(2023, 2, 14), LocalDateTime.of(2023, 2, 14, 12, 40));
		DiseaseDTO kaposiSarcoma1 = new DiseaseDTO("Kaposi's Sarcoma", 7, 0.2, true, 'C', 3200, (short) 10, (byte) 2,
				0.63f, LocalDate.of(2023, 3, 22), LocalDateTime.of(2023, 3, 22, 14, 55));
		DiseaseDTO osteogenesisImperfecta = new DiseaseDTO("Osteogenesis Imperfecta", 4, 0.05, true, 'B', 1500,
				(short) 5, (byte) 1, 0.5f, LocalDate.of(2023, 4, 8), LocalDateTime.of(2023, 4, 8, 9, 30));
		DiseaseDTO pkandisease = new DiseaseDTO("Pantothenate Kinase-associated Neurodegeneration (PKAN)", 9, 0.4, true,
				'N', 12500, (short) 18, (byte) 3, 0.8f, LocalDate.of(2023, 5, 17),
				LocalDateTime.of(2023, 5, 17, 16, 20));
		DiseaseDTO sanfilippoSyndrome = new DiseaseDTO("Sanfilippo Syndrome", 7, 0.2, true, 'N', 8500, (short) 14,
				(byte) 2, 0.7f, LocalDate.of(2023, 6, 3), LocalDateTime.of(2023, 6, 3, 10, 45));
		DiseaseDTO hunterSyndrome = new DiseaseDTO("Hunter Syndrome", 8, 0.25, true, 'N', 9200, (short) 15, (byte) 2,
				0.75f, LocalDate.of(2023, 7, 19), LocalDateTime.of(2023, 7, 19, 11, 55));
		DiseaseDTO fabryDisease1 = new DiseaseDTO("Fabry Disease", 7, 0.2, true, 'N', 7800, (short) 13, (byte) 2, 0.7f,
				LocalDate.of(2023, 8, 21), LocalDateTime.of(2023, 8, 21, 14, 30));
		DiseaseDTO gaucherDisease1 = new DiseaseDTO("Gaucher Disease", 7, 0.18, true, 'N', 8600, (short) 14, (byte) 2,
				0.68f, LocalDate.of(2023, 9, 7), LocalDateTime.of(2023, 9, 7, 9, 10));
		DiseaseDTO taySachsDisease1 = new DiseaseDTO("Tay-Sachs Disease", 8, 0.22, true, 'N', 9500, (short) 15,
				(byte) 3, 0.72f, LocalDate.of(2023, 10, 14), LocalDateTime.of(2023, 10, 14, 13, 50));
		DiseaseDTO canavanDisease = new DiseaseDTO("Canavan Disease", 7, 0.2, true, 'N', 8000, (short) 12, (byte) 2,
				0.7f, LocalDate.of(2023, 11, 30), LocalDateTime.of(2023, 11, 30, 10, 35));
		DiseaseDTO pompeDisease1 = new DiseaseDTO("Pompe Disease", 7, 0.18, true, 'N', 8700, (short) 14, (byte) 2,
				0.68f, LocalDate.of(2023, 12, 6), LocalDateTime.of(2023, 12, 6, 15, 15));
		DiseaseDTO krabbeDisease1 = new DiseaseDTO("Krabbe Disease", 6, 0.16, true, 'N', 7200, (short) 11, (byte) 2,
				0.65f, LocalDate.of(2024, 1, 12), LocalDateTime.of(2024, 1, 12, 11, 45));
		DiseaseDTO niemannPickDisease1 = new DiseaseDTO("Niemann-Pick Disease", 7, 0.2, true, 'N', 8300, (short) 13,
				(byte) 2, 0.68f, LocalDate.of(2024, 2, 18), LocalDateTime.of(2024, 2, 18, 9, 25));
		DiseaseDTO myelodysplasticSyndromes = new DiseaseDTO("Myelodysplastic Syndromes", 8, 0.25, true, 'N', 9200,
				(short) 15, (byte) 3, 0.73f, LocalDate.of(2024, 3, 25), LocalDateTime.of(2024, 3, 25, 14, 55));
		DiseaseDTO aplasticAnemia = new DiseaseDTO("Aplastic Anemia", 7, 0.2, true, 'N', 7900, (short) 14, (byte) 2,
				0.7f, LocalDate.of(2024, 4, 3), LocalDateTime.of(2024, 4, 3, 10, 30));
		DiseaseDTO hemolyticAnemia = new DiseaseDTO("Hemolytic Anemia", 6, 0.18, true, 'N', 8600, (short) 13, (byte) 2,
				0.68f, LocalDate.of(2024, 5, 9), LocalDateTime.of(2024, 5, 9, 16, 20));
		DiseaseDTO g6pdDeficiency = new DiseaseDTO("G6PD Deficiency", 5, 0.15, true, 'N', 7300, (short) 10, (byte) 2,
				0.63f, LocalDate.of(2024, 6, 15), LocalDateTime.of(2024, 6, 15, 10, 45));
		DiseaseDTO thalassemia = new DiseaseDTO("Thalassemia", 6, 0.18, true, 'N', 8000, (short) 12, (byte) 2, 0.68f,
				LocalDate.of(2024, 7, 22), LocalDateTime.of(2024, 7, 22, 11, 55));
		DiseaseDTO hemolyticDiseaseOfTheNewborn = new DiseaseDTO("Hemolytic Disease of the Newborn", 7, 0.2, true, 'N',
				8700, (short) 13, (byte) 2, 0.7f, LocalDate.of(2024, 8, 28), LocalDateTime.of(2024, 8, 28, 14, 30));
		DiseaseDTO antiphospholipidSyndrome = new DiseaseDTO("Antiphospholipid Syndrome", 8, 0.22, true, 'N', 9200,
				(short) 14, (byte) 3, 0.72f, LocalDate.of(2024, 9, 6), LocalDateTime.of(2024, 9, 6, 9, 10));
		DiseaseDTO mixedConnectiveTissueDisease = new DiseaseDTO("Mixed Connective Tissue Disease", 9, 0.25, true, 'N',
				9800, (short) 15, (byte) 3, 0.73f, LocalDate.of(2024, 10, 13), LocalDateTime.of(2024, 10, 13, 13, 50));
		DiseaseDTO copd = new DiseaseDTO("Chronic obstructive pulmonary disease (COPD)", 6, 0.1, true, 'L', 1000000,
				(short) 5, (byte) 3, 0.3f, LocalDate.of(2010, 5, 15), LocalDateTime.now());
		DiseaseDTO alzheimer = new DiseaseDTO("Alzheimer's disease", 8, 0.7, false, 'N', 5000000, (short) 10, (byte) 2,
				0.05f, LocalDate.of(2000, 2, 10), LocalDateTime.now());
		DiseaseDTO parkinson = new DiseaseDTO("Parkinson's disease", 7, 0.3, false, 'N', 2000000, (short) 8, (byte) 2,
				0.08f, LocalDate.of(2005, 8, 20), LocalDateTime.now());
		DiseaseDTO cancer = new DiseaseDTO("Cancer", 9, 0.6, true, 'M', 6000000, (short) 5, (byte) 4, 0.2f,
				LocalDate.of(2003, 3, 8), LocalDateTime.now());
		DiseaseDTO diabetes = new DiseaseDTO("Diabetes", 5, 0.05, true, 'M', 8000000, (short) 4, (byte) 3, 0.15f,
				LocalDate.of(2007, 6, 12), LocalDateTime.now());
		DiseaseDTO hypertension = new DiseaseDTO("Hypertension", 4, 0.08, true, 'H', 7000000, (short) 3, (byte) 2,
				0.12f, LocalDate.of(2008, 9, 25), LocalDateTime.now());
		DiseaseDTO influenza = new DiseaseDTO("Influenza", 4, 0.02, true, 'L', 15000000, (short) 2, (byte) 2, 0.2f,
				LocalDate.of(2015, 12, 1), LocalDateTime.now());
		DiseaseDTO hivAids = new DiseaseDTO("HIV/AIDS", 10, 0.9, true, 'H', 4000000, (short) 6, (byte) 4, 0.05f,
				LocalDate.of(1995, 3, 20), LocalDateTime.now());
		DiseaseDTO tuberculosis1 = new DiseaseDTO("Tuberculosis", 7, 0.4, true, 'L', 3000000, (short) 7, (byte) 3, 0.1f,
				LocalDate.of(2001, 4, 5), LocalDateTime.now());
		DiseaseDTO malaria = new DiseaseDTO("Malaria", 6, 0.2, true, 'L', 12000000, (short) 10, (byte) 3, 0.18f,
				LocalDate.of(2009, 7, 15), LocalDateTime.now());
		DiseaseDTO heartDisease = new DiseaseDTO("Heart disease", 8, 0.6, true, 'M', 7500000, (short) 5, (byte) 4,
				0.15f, LocalDate.of(2002, 1, 30), LocalDateTime.now());
		DiseaseDTO stroke = new DiseaseDTO("Stroke", 8, 0.5, true, 'M', 3000000, (short) 7, (byte) 4, 0.12f,
				LocalDate.of(2003, 9, 18), LocalDateTime.now());
		DiseaseDTO arthritis = new DiseaseDTO("Arthritis", 5, 0.03, true, 'L', 10000000, (short) 4, (byte) 2, 0.25f,
				LocalDate.of(2010, 6, 2), LocalDateTime.now());
		DiseaseDTO osteoporosis = new DiseaseDTO("Osteoporosis", 4, 0.02, true, 'L', 4500000, (short) 9, (byte) 2,
				0.22f, LocalDate.of(2012, 11, 7), LocalDateTime.now());
		DiseaseDTO asthma = new DiseaseDTO("Asthma", 4, 0.03, true, 'L', 5500000, (short) 3, (byte) 3, 0.2f,
				LocalDate.of(2011, 8, 14), LocalDateTime.now());
		DiseaseDTO autism = new DiseaseDTO("Autism", 6, 0.01, false, 'N', 1500000, (short) 2, (byte) 1, 0.03f,
				LocalDate.of(2006, 4, 20), LocalDateTime.now());
		DiseaseDTO downSyndrome = new DiseaseDTO("Down syndrome", 3, 0.01, false, 'N', 900000, (short) 1, (byte) 1,
				0.02f, LocalDate.of(2007, 2, 8), LocalDateTime.now());
		DiseaseDTO cysticFibrosis = new DiseaseDTO("Cystic fibrosis", 7, 0.1, true, 'L', 200000, (short) 10, (byte) 3,
				0.06f, LocalDate.of(2013, 10, 15), LocalDateTime.now());
		DiseaseDTO multipleSclerosis = new DiseaseDTO("Multiple sclerosis", 8, 0.2, false, 'N', 350000, (short) 6,
				(byte) 2, 0.07f, LocalDate.of(2008, 5, 25), LocalDateTime.now());
		DiseaseDTO sickleCellAnemia = new DiseaseDTO("Sickle cell anemia", 7, 0.1, false, 'N', 180000, (short) 8,
				(byte) 1, 0.05f, LocalDate.of(2014, 3, 30), LocalDateTime.now());
		DiseaseDTO leukemia = new DiseaseDTO("Leukemia", 9, 0.4, true, 'M', 800000, (short) 5, (byte) 4, 0.2f,
				LocalDate.of(2005, 11, 10), LocalDateTime.now());
		DiseaseDTO schizophrenia = new DiseaseDTO("Schizophrenia", 7, 0.05, false, 'N', 550000, (short) 7, (byte) 3,
				0.04f, LocalDate.of(2010, 7, 7), LocalDateTime.now());
		DiseaseDTO bipolarDisorder = new DiseaseDTO("Bipolar disorder", 6, 0.06, false, 'N', 700000, (short) 8,
				(byte) 2, 0.07f, LocalDate.of(2009, 2, 14), LocalDateTime.now());
		DiseaseDTO depression = new DiseaseDTO("Depression", 5, 0.04, false, 'N', 1000000, (short) 9, (byte) 1, 0.08f,
				LocalDate.of(2012, 8, 3), LocalDateTime.now());
		DiseaseDTO anxietyDisorders = new DiseaseDTO("Anxiety disorders", 4, 0.03, false, 'N', 1200000, (short) 7,
				(byte) 1, 0.1f, LocalDate.of(2011, 6, 6), LocalDateTime.now());
		DiseaseDTO ocd = new DiseaseDTO("Obsessive-compulsive disorder (OCD)", 6, 0.05, false, 'N', 900000, (short) 6,
				(byte) 2, 0.09f, LocalDate.of(2015, 4, 28), LocalDateTime.now());
		DiseaseDTO ptsd = new DiseaseDTO("Post-traumatic stress disorder (PTSD)", 7, 0.08, false, 'N', 850000,
				(short) 4, (byte) 1, 0.07f, LocalDate.of(2014, 9, 22), LocalDateTime.now());
		DiseaseDTO touretteSyndrome = new DiseaseDTO("Tourette syndrome", 4, 0.01, false, 'N', 150000, (short) 3,
				(byte) 1, 0.02f, LocalDate.of(2016, 7, 15), LocalDateTime.now());
		DiseaseDTO crohnsDisease1 = new DiseaseDTO("Crohn's disease", 6, 0.08, false, 'L', 650000, (short) 8, (byte) 3,
				0.1f, LocalDate.of(2013, 12, 17), LocalDateTime.now());
		DiseaseDTO ulcerativeColitis1 = new DiseaseDTO("Ulcerative colitis", 5, 0.06, false, 'L', 550000, (short) 7,
				(byte) 2, 0.09f, LocalDate.of(2013, 11, 28), LocalDateTime.now());
		DiseaseDTO cervicalCancer1 = new DiseaseDTO("Cervical cancer", 6, 0.015, true, 'C', 75000, (short) 14, (byte) 4,
				0.5f, LocalDate.of(2006, 10, 15), LocalDateTime.of(2021, 9, 28, 9, 15));
		DiseaseDTO vaginalCancer1 = new DiseaseDTO("Vaginal cancer", 7, 0.02, true, 'V', 80000, (short) 16, (byte) 5,
				0.45f, LocalDate.of(2007, 11, 5), LocalDateTime.of(2021, 9, 27, 15, 30));
		DiseaseDTO vulvarCancer1 = new DiseaseDTO("Vulvar cancer", 8, 0.03, true, 'V', 85000, (short) 18, (byte) 1,
				0.7f, LocalDate.of(2008, 12, 18), LocalDateTime.of(2021, 9, 26, 14, 30));
		DiseaseDTO testicularCancer1 = new DiseaseDTO("Testicular cancer", 4, 0.008, true, 'T', 65000, (short) 10,
				(byte) 3, 0.55f, LocalDate.of(2004, 1, 20), LocalDateTime.of(2021, 9, 25, 12, 45));
		DiseaseDTO penileCancer1 = new DiseaseDTO("Penile cancer", 5, 0.01, true, 'P', 70000, (short) 12, (byte) 2,
				0.6f, LocalDate.of(2005, 2, 8), LocalDateTime.of(2021, 9, 24, 9, 15));
		DiseaseDTO prostateCancer1 = new DiseaseDTO("Prostate cancer", 6, 0.015, true, 'P', 75000, (short) 14, (byte) 4,
				0.5f, LocalDate.of(2006, 3, 10), LocalDateTime.of(2021, 9, 23, 15, 30));
		DiseaseDTO bladderCancer1 = new DiseaseDTO("Bladder cancer", 7, 0.02, true, 'B', 80000, (short) 16, (byte) 5,
				0.45f, LocalDate.of(2007, 4, 5), LocalDateTime.of(2021, 9, 22, 14, 30));
		DiseaseDTO colorectalCancer = new DiseaseDTO("Colorectal cancer", 8, 0.03, true, 'C', 85000, (short) 18,
				(byte) 1, 0.7f, LocalDate.of(2008, 5, 12), LocalDateTime.of(2021, 9, 21, 12, 45));
		DiseaseDTO skinCancer = new DiseaseDTO("Skin cancer", 5, 0.01, true, 'S', 70000, (short) 12, (byte) 2, 0.6f,
				LocalDate.of(2005, 6, 18), LocalDateTime.of(2021, 9, 20, 9, 15));
		DiseaseDTO pancreaticCancer = new DiseaseDTO("Pancreatic cancer", 4, 0.008, true, 'P', 65000, (short) 10,
				(byte) 3, 0.55f, LocalDate.of(2004, 7, 25), LocalDateTime.of(2021, 9, 19, 15, 30));
		DiseaseDTO endometriosis = new DiseaseDTO("Endometriosis", 5, 0.02, false, 'G', 100000, (short) 10, (byte) 3,
				0.85, LocalDate.of(2000, 1, 15), LocalDateTime.now());
		DiseaseDTO menstrualDisorders = new DiseaseDTO("Menstrual disorders", 3, 0.01, false, 'G', 50000, (short) 7,
				(byte) 2, 0.90, LocalDate.of(2005, 5, 20), LocalDateTime.now());
		DiseaseDTO ovarianCancer1 = new DiseaseDTO("Ovarian cancer", 8, 0.15, true, 'C', 75000, (short) 14, (byte) 4,
				0.70, LocalDate.of(2002, 3, 10), LocalDateTime.now());
		DiseaseDTO testicularCancer11 = new DiseaseDTO("Testicular cancer", 7, 0.10, true, 'C', 30000, (short) 12,
				(byte) 3, 0.75, LocalDate.of(2004, 8, 5), LocalDateTime.now());
		DiseaseDTO prostateCancer11 = new DiseaseDTO("Prostate cancer", 6, 0.08, true, 'C', 80000, (short) 15, (byte) 4,
				0.80, LocalDate.of(2001, 11, 30), LocalDateTime.now());
		DiseaseDTO bladderCancer11 = new DiseaseDTO("Bladder cancer", 7, 0.09, true, 'C', 55000, (short) 14, (byte) 4,
				0.76, LocalDate.of(2006, 2, 25), LocalDateTime.now());
		DiseaseDTO colorectalCancer1 = new DiseaseDTO("Colorectal cancer", 8, 0.11, true, 'C', 65000, (short) 16,
				(byte) 5, 0.73, LocalDate.of(2003, 6, 8), LocalDateTime.now());
		DiseaseDTO skinCancer1 = new DiseaseDTO("Skin cancer", 3, 0.02, false, 'D', 120000, (short) 8, (byte) 1, 0.92,
				LocalDate.of(2007, 4, 12), LocalDateTime.now());
		DiseaseDTO pancreaticCancer1 = new DiseaseDTO("Pancreatic cancer", 9, 0.18, true, 'C', 45000, (short) 17,
				(byte) 5, 0.68, LocalDate.of(1998, 9, 15), LocalDateTime.now());
		DiseaseDTO brainCancer = new DiseaseDTO("Brain cancer", 8, 0.4, true, 'C', 10000, (short) 30, (byte) 4, 0.2f,
				LocalDate.of(2020, 3, 15), LocalDateTime.now());
		DiseaseDTO lymphoma = new DiseaseDTO("Lymphoma", 6, 0.3, false, 'L', 5000, (short) 25, (byte) 2, 0.4f,
				LocalDate.of(2021, 6, 10), LocalDateTime.now());
		DiseaseDTO esophagealCancer1 = new DiseaseDTO("Esophageal cancer", 7, 0.35, true, 'E', 8000, (short) 20,
				(byte) 3, 0.25f, LocalDate.of(2019, 5, 20), LocalDateTime.now());
		DiseaseDTO stomachCancer = new DiseaseDTO("Stomach cancer", 7, 0.35, true, 'S', 9000, (short) 18, (byte) 2,
				0.3f, LocalDate.of(2022, 2, 8), LocalDateTime.now());
		DiseaseDTO lungCancer = new DiseaseDTO("Lung cancer", 9, 0.45, true, 'L', 15000, (short) 22, (byte) 5, 0.15f,
				LocalDate.of(2023, 1, 5), LocalDateTime.now());
		DiseaseDTO liverCancer1 = new DiseaseDTO("Liver cancer", 7, 0.4, true, 'L', 7000, (short) 21, (byte) 3, 0.2f,
				LocalDate.of(2018, 11, 30), LocalDateTime.now());
		DiseaseDTO kidneyCancer = new DiseaseDTO("Kidney cancer", 6, 0.3, true, 'K', 6500, (short) 24, (byte) 2, 0.35f,
				LocalDate.of(2021, 7, 12), LocalDateTime.now());
		DiseaseDTO boneCancer = new DiseaseDTO("Bone cancer", 5, 0.25, false, 'B', 5500, (short) 23, (byte) 1, 0.4f,
				LocalDate.of(2020, 8, 17), LocalDateTime.now());
		DiseaseDTO thyroidCancer = new DiseaseDTO("Thyroid cancer", 4, 0.2, false, 'T', 4500, (short) 27, (byte) 1,
				0.45f, LocalDate.of(2019, 4, 25), LocalDateTime.now());
		DiseaseDTO cervicalCancer11 = new DiseaseDTO("Cervical cancer", 6, 0.35, true, 'C', 6000, (short) 29, (byte) 2,
				0.3f, LocalDate.of(2021, 10, 3), LocalDateTime.now());
		DiseaseDTO oralCancer = new DiseaseDTO("Oral cancer", 8, 0.3, true, 'C', 50000, (short) 14, (byte) 3, 0.45f,
				LocalDate.of(2021, 5, 15), LocalDateTime.of(2021, 5, 15, 10, 30));
		DiseaseDTO breastCancer = new DiseaseDTO("Breast cancer", 7, 0.25, true, 'C', 150000, (short) 21, (byte) 2,
				0.55f, LocalDate.of(2021, 4, 10), LocalDateTime.of(2021, 4, 10, 15, 45));
		DiseaseDTO cerebralPalsy = new DiseaseDTO("Cerebral palsy", 6, 0.1, false, 'N', 750000, (short) 0, (byte) 1,
				0.75f, LocalDate.of(2021, 3, 5), LocalDateTime.of(2021, 3, 5, 5, 20));
		DiseaseDTO polio = new DiseaseDTO("Polio", 9, 0.05, true, 'I', 200000, (short) 7, (byte) 2, 0.9f,
				LocalDate.of(2021, 8, 20), LocalDateTime.of(2021, 8, 20, 20, 15));
		DiseaseDTO sepsis = new DiseaseDTO("Sepsis", 9, 0.3, true, 'I', 300000, (short) 3, (byte) 4, 0.6f,
				LocalDate.of(2021, 2, 10), LocalDateTime.of(2021, 2, 10, 12, 0));
		DiseaseDTO pneumonia1 = new DiseaseDTO("Pneumonia", 7, 0.15, true, 'I', 400000, (short) 7, (byte) 2, 0.7f,
				LocalDate.of(2021, 6, 30), LocalDateTime.of(2021, 6, 30, 18, 10));
		DiseaseDTO cholera = new DiseaseDTO("Cholera", 8, 0.2, true, 'I', 100000, (short) 2, (byte) 3, 0.65f,
				LocalDate.of(2021, 7, 25), LocalDateTime.of(2021, 7, 25, 8, 30));
		DiseaseDTO typhoidFever = new DiseaseDTO("Typhoid fever", 6, 0.1, true, 'I', 150000, (short) 14, (byte) 2, 0.8f,
				LocalDate.of(2021, 9, 10), LocalDateTime.of(2021, 9, 10, 14, 55));
		DiseaseDTO chlamydia = new DiseaseDTO("Chlamydia", 4, 0.03, true, 'S', 500000, (short) 10, (byte) 1, 0.9f,
				LocalDate.of(2021, 11, 12), LocalDateTime.of(2021, 11, 12, 23, 45));
		DiseaseDTO gonorrhea = new DiseaseDTO("Gonorrhea", 5, 0.04, true, 'S', 200000, (short) 7, (byte) 2, 0.85f,
				LocalDate.of(2021, 10, 5), LocalDateTime.of(2021, 10, 5, 11, 15));
		DiseaseDTO syphilis = new DiseaseDTO("Syphilis", 3, 0.05, true, 'S', 25000, (short) 21, (byte) 3, 0.92f,
				LocalDate.of(2000, 2, 10), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO herpes = new DiseaseDTO("Herpes", 2, 0.02, true, 'H', 15000, (short) 14, (byte) 2, 0.88f,
				LocalDate.of(1995, 7, 5), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO hepatitisA = new DiseaseDTO("Hepatitis A", 4, 0.1, true, 'H', 7500, (short) 28, (byte) 4, 0.85f,
				LocalDate.of(2005, 4, 15), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO hepatitisB = new DiseaseDTO("Hepatitis B", 5, 0.15, true, 'H', 10000, (short) 35, (byte) 5, 0.80f,
				LocalDate.of(2007, 8, 20), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO hepatitisC = new DiseaseDTO("Hepatitis C", 6, 0.2, true, 'H', 8500, (short) 42, (byte) 6, 0.75f,
				LocalDate.of(2010, 12, 3), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO rabies = new DiseaseDTO("Rabies", 4, 0.18, true, 'R', 5000, (short) 14, (byte) 4, 0.88f,
				LocalDate.of(2003, 5, 7), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO dengueFever1 = new DiseaseDTO("Dengue fever", 6, 0.2, true, 'D', 12000, (short) 7, (byte) 6, 0.7f,
				LocalDate.of(2008, 9, 11), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO yellowFever1 = new DiseaseDTO("Yellow fever", 5, 0.15, true, 'Y', 3500, (short) 28, (byte) 5, 0.75f,
				LocalDate.of(2006, 11, 22), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO westNileVirus1 = new DiseaseDTO("West Nile virus", 4, 0.12, true, 'W', 9000, (short) 21, (byte) 4,
				0.85f, LocalDate.of(2009, 6, 18), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO ebola = new DiseaseDTO("Ebola", 7, 0.25, true, 'E', 3500, (short) 7, (byte) 7, 0.65f,
				LocalDate.of(2014, 3, 26), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO zikaVirus1 = new DiseaseDTO("Zika virus", 3, 0.07, true, 'Z', 4500, (short) 14, (byte) 3, 0.9f,
				LocalDate.of(2016, 1, 12), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO measles = new DiseaseDTO("Measles", 4, 0.1, true, 'M', 32000, (short) 14, (byte) 4, 0.88f,
				LocalDate.of(2001, 8, 5), LocalDateTime.of(2023, 10, 29, 15, 30));
		DiseaseDTO mumps1 = new DiseaseDTO("Mumps", 5, 0.001, true, 'C', 5000, (short) 10, (byte) 3, 0.9,
				LocalDate.of(2000, 5, 15), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO diphtheria1 = new DiseaseDTO("Diphtheria", 7, 0.02, true, 'C', 7500, (short) 14, (byte) 4, 0.85,
				LocalDate.of(2001, 6, 20), LocalDateTime.of(2023, 10, 29, 13, 0));
		DiseaseDTO pertussis = new DiseaseDTO("Whooping cough (Pertussis)", 6, 0.015, true, 'C', 8000, (short) 12,
				(byte) 3, 0.88, LocalDate.of(2002, 7, 25), LocalDateTime.of(2023, 10, 29, 14, 0));
		DiseaseDTO tuberculosis11 = new DiseaseDTO("Tuberculosis", 8, 0.05, true, 'C', 10000, (short) 20, (byte) 5, 0.8,
				LocalDate.of(2003, 8, 30), LocalDateTime.of(2023, 10, 29, 15, 0));
		DiseaseDTO pneumonia11 = new DiseaseDTO("Pneumocystis pneumonia", 9, 0.1, true, 'F', 500, (short) 7, (byte) 2,
				0.7, LocalDate.of(2004, 9, 5), LocalDateTime.of(2023, 10, 29, 16, 0));
		DiseaseDTO histoplasmosis1 = new DiseaseDTO("Histoplasmosis", 6, 0.015, true, 'F', 600, (short) 9, (byte) 3,
				0.75, LocalDate.of(2005, 10, 10), LocalDateTime.of(2023, 10, 29, 17, 0));
		DiseaseDTO blastomycosis1 = new DiseaseDTO("Blastomycosis", 7, 0.02, true, 'F', 700, (short) 10, (byte) 3, 0.72,
				LocalDate.of(2006, 11, 15), LocalDateTime.of(2023, 10, 29, 18, 0));
		DiseaseDTO coccidioidomycosis1 = new DiseaseDTO("Coccidioidomycosis", 8, 0.03, true, 'F', 800, (short) 12,
				(byte) 4, 0.69, LocalDate.of(2007, 12, 20), LocalDateTime.of(2023, 10, 29, 19, 0));
		DiseaseDTO cryptococcosis1 = new DiseaseDTO("Cryptococcosis", 6, 0.01, true, 'F', 900, (short) 8, (byte) 2,
				0.73, LocalDate.of(2008, 1, 25), LocalDateTime.of(2023, 10, 29, 20, 0));
		DiseaseDTO aspergillosis1 = new DiseaseDTO("Aspergillosis", 7, 0.015, true, 'F', 1000, (short) 10, (byte) 3,
				0.68, LocalDate.of(2009, 2, 1), LocalDateTime.of(2023, 10, 29, 21, 0));
		DiseaseDTO candidiasis1 = new DiseaseDTO("Candidiasis", 5, 0.05, true, 'I', 10000, (short) 10, (byte) 2, 0.90,
				LocalDate.of(2020, 5, 15), LocalDateTime.now());
		DiseaseDTO pneumonia111 = new DiseaseDTO("Pneumonia", 8, 0.15, true, 'R', 50000, (short) 14, (byte) 3, 0.85,
				LocalDate.of(2019, 8, 10), LocalDateTime.now());
		DiseaseDTO bronchitis1 = new DiseaseDTO("Bronchitis", 6, 0.10, true, 'R', 30000, (short) 7, (byte) 2, 0.88,
				LocalDate.of(2021, 3, 25), LocalDateTime.now());
		DiseaseDTO emphysema1 = new DiseaseDTO("Emphysema", 7, 0.20, true, 'R', 25000, (short) 10, (byte) 3, 0.75,
				LocalDate.of(2020, 9, 2), LocalDateTime.now());
		DiseaseDTO pulmonaryFibrosis = new DiseaseDTO("Pulmonary fibrosis", 9, 0.25, true, 'R', 20000, (short) 12,
				(byte) 2, 0.70, LocalDate.of(2018, 11, 11), LocalDateTime.now());
		DiseaseDTO pneumothorax1 = new DiseaseDTO("Pneumothorax", 8, 0.15, true, 'R', 15000, (short) 5, (byte) 2, 0.80,
				LocalDate.of(2022, 1, 7), LocalDateTime.now());
		DiseaseDTO sarcoidosis1 = new DiseaseDTO("Sarcoidosis", 6, 0.10, false, 'I', 12000, (short) 8, (byte) 2, 0.92,
				LocalDate.of(2021, 7, 30), LocalDateTime.now());
		DiseaseDTO myocarditis1 = new DiseaseDTO("Myocarditis", 7, 0.20, false, 'I', 8000, (short) 14, (byte) 3, 0.78,
				LocalDate.of(2019, 4, 18), LocalDateTime.now());
		DiseaseDTO pericarditis1 = new DiseaseDTO("Pericarditis", 6, 0.15, false, 'I', 9000, (short) 10, (byte) 2, 0.86,
				LocalDate.of(2020, 2, 15), LocalDateTime.now());
		DiseaseDTO endocarditis1 = new DiseaseDTO("Endocarditis", 7, 0.12, false, 'I', 7000, (short) 12, (byte) 2, 0.84,
				LocalDate.of(2021, 11, 5), LocalDateTime.now());
		DiseaseDTO atherosclerosis1 = new DiseaseDTO("Atherosclerosis", 5, 0.2, false, 'C', 100000, (short) 14,
				(byte) 2, 0.6f, LocalDate.of(2000, 5, 15), LocalDateTime.of(2022, 7, 10, 14, 30));

		DiseaseDTO aorticAneurysm1 = new DiseaseDTO("Aortic aneurysm", 6, 0.15, false, 'C', 75000, (short) 10, (byte) 3,
				0.65f, LocalDate.of(2001, 3, 20), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO peripheralArteryDisease1 = new DiseaseDTO("Peripheral artery disease", 4, 0.18, false, 'C', 85000,
				(short) 12, (byte) 2, 0.6f, LocalDate.of(2002, 8, 5), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO varicoseVeins1 = new DiseaseDTO("Varicose veins", 2, 0.1, false, 'V', 45000, (short) 6, (byte) 1,
				0.7f, LocalDate.of(2003, 2, 10), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO deepVeinThrombosis1 = new DiseaseDTO("Deep vein thrombosis", 3, 0.2, false, 'V', 60000, (short) 8,
				(byte) 2, 0.65f, LocalDate.of(2004, 6, 30), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO pulmonaryEmbolism = new DiseaseDTO("Pulmonary embolism", 4, 0.25, false, 'P', 80000, (short) 10,
				(byte) 3, 0.6f, LocalDate.of(2005, 4, 18), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO hirschsprungsDisease1 = new DiseaseDTO("Hirschsprung's disease", 7, 0.3, false, 'H', 110000,
				(short) 14, (byte) 3, 0.55f, LocalDate.of(2006, 9, 24), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO diverticulitis1 = new DiseaseDTO("Diverticulitis", 4, 0.15, false, 'D', 70000, (short) 12, (byte) 2,
				0.65f, LocalDate.of(2007, 7, 2), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO gerd1 = new DiseaseDTO("Gastroesophageal reflux disease (GERD)", 5, 0.2, false, 'G', 90000,
				(short) 10, (byte) 3, 0.6f, LocalDate.of(2008, 11, 11), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO pepticUlcers1 = new DiseaseDTO("Peptic ulcers", 4, 0.18, false, 'P', 78000, (short) 8, (byte) 2,
				0.65f, LocalDate.of(2009, 6, 9), LocalDateTime.of(2022, 7, 10, 14, 30));
		DiseaseDTO prostateCancer111 = new DiseaseDTO("Prostate cancer", 8, 0.2, true, 'C', 10000, (short) 20, (byte) 4,
				0.6f, LocalDate.of(2005, 3, 15), LocalDateTime.of(2022, 10, 10, 14, 30));
		DiseaseDTO bladderCancer111 = new DiseaseDTO("Bladder cancer", 7, 0.15, true, 'C', 8000, (short) 15, (byte) 3,
				0.65f, LocalDate.of(2008, 5, 20), LocalDateTime.of(2022, 10, 9, 10, 45));
		DiseaseDTO renalCellCarcinoma1 = new DiseaseDTO("Renal cell carcinoma", 8, 0.18, true, 'C', 8500, (short) 18,
				(byte) 3, 0.67f, LocalDate.of(2010, 7, 10), LocalDateTime.of(2022, 10, 8, 12, 15));
		DiseaseDTO wilmsTumor1 = new DiseaseDTO("Wilms tumor", 5, 0.05, true, 'C', 300, (short) 10, (byte) 2, 0.75f,
				LocalDate.of(2012, 1, 5), LocalDateTime.of(2022, 10, 7, 9, 20));
		DiseaseDTO adrenalGlandTumors1 = new DiseaseDTO("Adrenal gland tumors", 6, 0.07, true, 'C', 450, (short) 12,
				(byte) 3, 0.7f, LocalDate.of(2014, 4, 12), LocalDateTime.of(2022, 10, 6, 11, 40));
		DiseaseDTO neuroblastoma1 = new DiseaseDTO("Neuroblastoma", 7, 0.1, true, 'C', 550, (short) 11, (byte) 2, 0.68f,
				LocalDate.of(2016, 2, 28), LocalDateTime.of(2022, 10, 5, 16, 55));
		DiseaseDTO retinoblastoma1 = new DiseaseDTO("Retinoblastoma", 4, 0.03, true, 'C', 150, (short) 8, (byte) 1,
				0.8f, LocalDate.of(2018, 9, 3), LocalDateTime.of(2022, 10, 4, 8, 30));
		DiseaseDTO osteosarcoma1 = new DiseaseDTO("Osteosarcoma", 7, 0.08, true, 'C', 600, (short) 16, (byte) 3, 0.72f,
				LocalDate.of(2017, 11, 22), LocalDateTime.of(2022, 10, 3, 13, 10));
		DiseaseDTO ewingSarcoma1 = new DiseaseDTO("Ewing sarcoma", 6, 0.07, true, 'C', 480, (short) 14, (byte) 2, 0.75f,
				LocalDate.of(2019, 6, 15), LocalDateTime.of(2022, 10, 2, 18, 50));
		DiseaseDTO synovialSarcoma1 = new DiseaseDTO("Synovial sarcoma", 8, 0.1, true, 'C', 720, (short) 12, (byte) 3,
				0.68f, LocalDate.of(2020, 4, 5), LocalDateTime.of(2022, 10, 1, 15, 25));
		DiseaseDTO kaposiSarcoma11 = new DiseaseDTO("Kaposi's sarcoma", 5, 0.03, true, 'C', 350, (short) 11, (byte) 2,
				0.78f, LocalDate.of(2021, 8, 10), LocalDateTime.of(2022, 10, 1, 9, 15));
		DiseaseDTO leiomyosarcoma = new DiseaseDTO("Leiomyosarcoma", 7, 0.06, true, 'C', 580, (short) 15, (byte) 3,
				0.73f, LocalDate.of(2015, 3, 28), LocalDateTime.of(2022, 9, 30, 16, 40));
		DiseaseDTO liposarcoma = new DiseaseDTO("Liposarcoma", 6, 0.05, true, 'C', 480, (short) 14, (byte) 2, 0.76f,
				LocalDate.of(2013, 7, 22), LocalDateTime.of(2022, 9, 29, 11, 30));
		DiseaseDTO rhabdomyosarcoma = new DiseaseDTO("Rhabdomyosarcoma", 5, 0.04, true, 'C', 300, (short) 12, (byte) 1,
				0.79f, LocalDate.of(2012, 12, 10), LocalDateTime.of(2022, 9, 28, 8, 10));
		DiseaseDTO chondrosarcoma = new DiseaseDTO("Chondrosarcoma", 6, 0.07, true, 'C', 520, (short) 13, (byte) 3,
				0.71f, LocalDate.of(2014, 2, 15), LocalDateTime.of(2022, 9, 27, 10, 45));
		DiseaseDTO glioblastoma = new DiseaseDTO("Glioblastoma", 8, 0.15, true, 'C', 890, (short) 17, (byte) 4, 0.67f,
				LocalDate.of(2016, 5, 25), LocalDateTime.of(2022, 9, 26, 13, 20));
		DiseaseDTO meningioma = new DiseaseDTO("Meningioma", 5, 0.03, true, 'C', 340, (short) 9, (byte) 2, 0.77f,
				LocalDate.of(2018, 1, 8), LocalDateTime.of(2022, 9, 25, 16, 5));
		DiseaseDTO medulloblastoma = new DiseaseDTO("Medulloblastoma", 7, 0.08, true, 'C', 660, (short) 14, (byte) 3,
				0.72f, LocalDate.of(2017, 9, 20), LocalDateTime.of(2022, 9, 24, 18, 40));
		DiseaseDTO pituitaryAdenoma = new DiseaseDTO("Pituitary adenoma", 6, 0.05, true, 'C', 500, (short) 11, (byte) 2,
				0.75f, LocalDate.of(2019, 11, 3), LocalDateTime.of(2022, 9, 23, 10, 15));
		DiseaseDTO acousticNeuroma = new DiseaseDTO("Acoustic neuroma", 5, 0.03, true, 'C', 320, (short) 9, (byte) 2,
				0.76f, LocalDate.of(2020, 10, 5), LocalDateTime.of(2022, 9, 22, 9, 10));
		DiseaseDTO pituitaryAdenoma1 = new DiseaseDTO("Pituitary adenoma", 6, 0.05, true, 'C', 500, (short) 11,
				(byte) 2, 0.75f, LocalDate.of(2019, 11, 3), LocalDateTime.of(2022, 9, 23, 10, 15));
		DiseaseDTO acousticNeuroma1 = new DiseaseDTO("Acoustic neuroma", 5, 0.03, true, 'C', 320, (short) 9, (byte) 2,
				0.76f, LocalDate.of(2020, 10, 5), LocalDateTime.of(2022, 9, 22, 9, 10));
		DiseaseDTO neurofibroma = new DiseaseDTO("Neurofibroma", 5, 0.05, true, 'N', 10000, (short) 7, (byte) 3, 0.9,
				LocalDate.of(2005, 5, 15), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO osteogenesisImperfecta1 = new DiseaseDTO("Osteogenesis imperfecta", 6, 0.03, false, 'O', 5000,
				(short) 10, (byte) 2, 0.8, LocalDate.of(2010, 8, 20), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO pkan = new DiseaseDTO("Pantothenate kinase-associated neurodegeneration (PKAN)", 9, 0.01, true, 'P',
				1000, (short) 5, (byte) 1, 0.85, LocalDate.of(2015, 4, 5), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO sanfilippo = new DiseaseDTO("Sanfilippo syndrome", 8, 0.02, true, 'S', 2000, (short) 6, (byte) 2,
				0.87, LocalDate.of(2012, 7, 10), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO hunter = new DiseaseDTO("Hunter syndrome", 7, 0.03, true, 'H', 1500, (short) 8, (byte) 3, 0.88,
				LocalDate.of(2014, 6, 8), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO fabry = new DiseaseDTO("Fabry disease", 5, 0.04, false, 'F', 800, (short) 9, (byte) 2, 0.84,
				LocalDate.of(2011, 9, 15), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO gaucher = new DiseaseDTO("Gaucher disease", 6, 0.03, false, 'G', 600, (short) 10, (byte) 1, 0.81,
				LocalDate.of(2018, 3, 12), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO taySachs = new DiseaseDTO("Tay-Sachs disease", 7, 0.02, true, 'T', 700, (short) 7, (byte) 2, 0.86,
				LocalDate.of(2013, 10, 25), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO canavan = new DiseaseDTO("Canavan disease", 8, 0.02, true, 'C', 1200, (short) 6, (byte) 3, 0.89,
				LocalDate.of(2016, 4, 29), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO pompe = new DiseaseDTO("Pompe disease", 5, 0.04, false, 'P', 900, (short) 8, (byte) 1, 0.83,
				LocalDate.of(2017, 11, 18), LocalDateTime.of(2023, 10, 29, 12, 0));
		DiseaseDTO krabbeDisease11 = new DiseaseDTO("Krabbe disease", 8, 0.8, false, 'K', 1000, (short) 30, (byte) 2,
				0.6f, LocalDate.of(2000, 5, 10), LocalDateTime.of(2000, 5, 10, 8, 30));
		DiseaseDTO niemannPickDisease11 = new DiseaseDTO("Niemann-Pick disease", 7, 0.75, true, 'N', 500, (short) 25,
				(byte) 3, 0.55f, LocalDate.of(2001, 6, 15), LocalDateTime.of(2001, 6, 15, 10, 15));
		DiseaseDTO mucopolysaccharidosis = new DiseaseDTO("Mucopolysaccharidosis", 6, 0.7, false, 'M', 800, (short) 35,
				(byte) 4, 0.5f, LocalDate.of(2002, 7, 20), LocalDateTime.of(2002, 7, 20, 12, 45));
		DiseaseDTO porphyria = new DiseaseDTO("Porphyria", 5, 0.65, true, 'P', 300, (short) 20, (byte) 5, 0.45f,
				LocalDate.of(2003, 8, 25), LocalDateTime.of(2003, 8, 25, 15, 30));
		DiseaseDTO hemochromatosis1 = new DiseaseDTO("Hemochromatosis", 4, 0.6, false, 'H', 250, (short) 15, (byte) 6,
				0.4f, LocalDate.of(2004, 9, 30), LocalDateTime.of(2004, 9, 30, 18, 20));
		DiseaseDTO hemophilia = new DiseaseDTO("Hemophilia", 3, 0.55, true, 'H', 150, (short) 10, (byte) 7, 0.35f,
				LocalDate.of(2005, 11, 5), LocalDateTime.of(2005, 11, 5, 20, 45));
		DiseaseDTO thrombocytopenia = new DiseaseDTO("Thrombocytopenia", 2, 0.5, false, 'T', 200, (short) 12, (byte) 8,
				0.3f, LocalDate.of(2006, 12, 10), LocalDateTime.of(2006, 12, 10, 22, 10));
		DiseaseDTO leukemia1 = new DiseaseDTO("Leukemia", 1, 0.45, true, 'L', 180, (short) 8, (byte) 9, 0.25f,
				LocalDate.of(2007, 2, 15), LocalDateTime.of(2007, 2, 15, 0, 25));
		DiseaseDTO lymphoma1 = new DiseaseDTO("Lymphoma", 2, 0.4, false, 'L', 280, (short) 14, (byte) 7, 0.2f,
				LocalDate.of(2008, 3, 20), LocalDateTime.of(2008, 3, 20, 2, 35));
		DiseaseDTO multipleMyeloma = new DiseaseDTO("Multiple myeloma", 3, 0.35, true, 'M', 320, (short) 16, (byte) 6,
				0.15f, LocalDate.of(2009, 4, 25), LocalDateTime.of(2009, 4, 25, 4, 50));
		DiseaseDTO hashimotosThyroiditis = new DiseaseDTO("Hashimoto's thyroiditis", 3, 0.02, true, 'A', 1000,
				(short) 14, (byte) 2, 0.85, LocalDate.of(2005, 5, 15), LocalDateTime.of(2022, 3, 7, 8, 30));

		DiseaseDTO myastheniaGravis = new DiseaseDTO("Myasthenia gravis", 2, 0.03, false, 'B', 500, (short) 10,
				(byte) 1, 0.92, LocalDate.of(2010, 7, 21), LocalDateTime.of(2022, 2, 14, 16, 45));

		DiseaseDTO addisonsDisease = new DiseaseDTO("Addison's disease", 1, 0.01, true, 'A', 300, (short) 7, (byte) 3,
				0.95, LocalDate.of(2015, 12, 3), LocalDateTime.of(2022, 6, 18, 12, 15));
		DiseaseDTO marfanSyndrome1 = new DiseaseDTO("Marfan syndrome", 5, 0.05, false, 'M', 100, (short) 10, (byte) 2,
				0.8f, LocalDate.of(2000, 1, 15), LocalDateTime.now());
		DiseaseDTO williamsSyndrome1 = new DiseaseDTO("Williams syndrome", 3, 0.02, false, 'W', 50, (short) 8, (byte) 1,
				0.9f, LocalDate.of(2005, 5, 10), LocalDateTime.now());
		DiseaseDTO ehlersDanlosSyndrome = new DiseaseDTO("Ehlers-Danlos syndrome", 4, 0.03, false, 'E', 75, (short) 12,
				(byte) 2, 0.85f, LocalDate.of(2010, 3, 20), LocalDateTime.now());
		DiseaseDTO oslerWeberRenduSyndrome = new DiseaseDTO("Osler-Weber-Rendu syndrome", 2, 0.01, false, 'O', 30,
				(short) 6, (byte) 3, 0.95f, LocalDate.of(2012, 7, 18), LocalDateTime.now());
		DiseaseDTO albinism = new DiseaseDTO("Albinism", 1, 0.005, false, 'A', 10, (short) 4, (byte) 1, 0.98f,
				LocalDate.of(2015, 12, 5), LocalDateTime.now());
		DiseaseDTO ichthyosis = new DiseaseDTO("Ichthyosis", 3, 0.02, false, 'I', 25, (short) 8, (byte) 2, 0.88f,
				LocalDate.of(2018, 2, 14), LocalDateTime.now());
		DiseaseDTO epidermolysisBullosa = new DiseaseDTO("Epidermolysis bullosa", 4, 0.03, false, 'E', 35, (short) 10,
				(byte) 1, 0.87f, LocalDate.of(2020, 9, 30), LocalDateTime.now());
		DiseaseDTO hidradenitisSuppurativa = new DiseaseDTO("Hidradenitis suppurativa", 2, 0.01, false, 'H', 15,
				(short) 6, (byte) 3, 0.94f, LocalDate.of(2021, 6, 25), LocalDateTime.now());
		DiseaseDTO pemphigus = new DiseaseDTO("Pemphigus", 4, 0.03, false, 'P', 40, (short) 10, (byte) 2, 0.86f,
				LocalDate.of(2019, 11, 10), LocalDateTime.now());
		DiseaseDTO thalassemia1 = new DiseaseDTO("Thalassemia", 2, 0.1, true, 'T', 500000, (short) 10, (byte) 2, 0.75f,
				LocalDate.of(2000, 5, 15), LocalDateTime.of(2000, 5, 15, 8, 30));
		DiseaseDTO bullousPemphigoid = new DiseaseDTO("Bullous pemphigoid", 3, 0.02, false, 'B', 20, (short) 8,
				(byte) 1, 0.92f, LocalDate.of(2017, 4, 7), LocalDateTime.now());

		disease.add(marfanSyndrome);
		disease.add(pneumonia11);
		disease.add(acousticNeuroma);
		disease.add(neurofibromatosis);
		disease.add(vonHippelLindauDisease);
		disease.add(restlessLegsSyndrome);
		disease.add(lichenPlanus);
		disease.add(raynaudsDisease);
		disease.add(kaposiSarcoma11);
		disease.add(polymyalgiaRheumatica);
		disease.add(behcetsDisease);
		disease.add(alkaptonuria);
		disease.add(alpha1AntitrypsinDeficiency);
		disease.add(stevensJohnsonSyndrome);
		disease.add(sjogrensSyndrome);
		disease.add(creutzfeldtJakobDisease);
		disease.add(huntingtonsDisease);
		disease.add(taySachsDisease1);
		disease.add(niemannPickDisease11);
		disease.add(gaucherDisease1);
		disease.add(krabbeDisease11);
		disease.add(fabryDisease1);
		disease.add(sandhoffDisease);
		disease.add(wilsonDisease);
		disease.add(hirschsprungDisease);
		disease.add(vonWillebrandDisease);
		disease.add(factorVLeiden);
		disease.add(hemochromatosis1);
		disease.add(pompeDisease1);
		disease.add(achondroplasia);
		disease.add(turnerSyndrome);
		disease.add(klinefelterSyndrome);
		disease.add(diGeorgeSyndrome);
		disease.add(fragileXSyndrome);
		disease.add(praderWilliSyndrome);
		disease.add(rettSyndrome);
		disease.add(crouzonSyndrome);
		disease.add(marfanSyndrome1);
		disease.add(williamsSyndrome1);
		disease.add(africanSleepingSickness);
		disease.add(trachoma);
		disease.add(dengueFever1);
		disease.add(kaposiSarcoma);
		disease.add(pneumonia1);
		disease.add(yellowFever1);
		disease.add(zikaVirus1);
		disease.add(japaneseEncephalitis);
		disease.add(westNileVirus1);
		disease.add(lymeDisease);
		disease.add(rockyMountainSpottedFever);
		disease.add(qFever);
		disease.add(tularemia);
		disease.add(hantavirusPulmonarySyndrome);
		disease.add(riftValleyFever);
		disease.add(crimeanCongoHemorrhagicFever);
		disease.add(anthrax);
		disease.add(botulism);
		disease.add(tetanus);
		disease.add(smallpox);
		disease.add(bubonicPlague);
		disease.add(mumps1);
		disease.add(diphtheria1);
		disease.add(whoopingCough);
		disease.add(tuberculosis11);
		disease.add(pneumocystisPneumonia);
		disease.add(histoplasmosis1);
		disease.add(blastomycosis1);
		disease.add(coccidioidomycosis1);
		disease.add(cryptococcosis1);
		disease.add(aspergillosis1);
		disease.add(candidiasis1);
		disease.add(pneumonia111);
		disease.add(bronchitis1);
		disease.add(emphysema1);
		disease.add(pulmonaryFib);
		disease.add(pneumothorax1);
		disease.add(sarcoidosis1);
		disease.add(myocarditis1);
		disease.add(pericarditis1);
		disease.add(endocarditis1);
		disease.add(tuberculosis1);
		disease.add(atherosclerosis1);
		disease.add(aorticAneurysm1);
		disease.add(peripheralArteryDisease1);
		disease.add(varicoseVeins1);
		disease.add(deepVeinThrombosis1);
		disease.add(pulmonaryEmb);
		disease.add(hirschsprungsDisease1);
		disease.add(diverticulitis1);
		disease.add(gerd1);
		disease.add(pepticUlcers1);
		disease.add(pancreatitis);
		disease.add(gallstones);
		disease.add(cirrhosis);
		disease.add(hepaticSteatosis);
		disease.add(hemorrhoids);
		disease.add(crohnsDisease1);
		disease.add(ulcerativeColitis1);
		disease.add(gastricCancer);
		disease.add(liverCancer1);
		disease.add(esophagealCancer1);
		disease.add(colonCancer);
		disease.add(rectalCancer);
		disease.add(analCancer);
		disease.add(ovarianCancer1);
		disease.add(uterineCancer);
		disease.add(cervicalCancer11);
		disease.add(vaginalCancer1);
		disease.add(vulvarCancer1);
		disease.add(testicularCancer11);
		disease.add(penileCancer1);
		disease.add(prostateCancer111);
		disease.add(bladderCancer111);
		disease.add(renalCellCarcinoma1);
		disease.add(wilmsTumor1);
		disease.add(adrenalGlandTumors1);
		disease.add(neuroblastoma1);
		disease.add(retinoblastoma1);
		disease.add(osteosarcoma1);
		disease.add(ewingSarcoma1);
		disease.add(synovialSarcoma1);
		disease.add(kaposiSarcoma11);
		disease.add(osteogenesisImperfecta1);
		disease.add(pkandisease);
		disease.add(sanfilippoSyndrome);
		disease.add(hunterSyndrome);
		disease.add(fabryDisease1);
		disease.add(gaucherDisease1);
		disease.add(taySachsDisease1);
		disease.add(canavanDisease);
		disease.add(pompeDisease1);
		disease.add(krabbeDisease11);
		disease.add(niemannPickDisease11);
		disease.add(myelodysplasticSyndromes);
		disease.add(aplasticAnemia);
		disease.add(hemolyticAnemia);
		disease.add(g6pdDeficiency);
		disease.add(thalassemia1);
		disease.add(hemolyticDiseaseOfTheNewborn);
		disease.add(antiphospholipidSyndrome);
		disease.add(mixedConnectiveTissueDisease);
		disease.add(copd);
		disease.add(alzheimer);
		disease.add(parkinson);
		disease.add(cancer);
		disease.add(diabetes);
		disease.add(hypertension);
		disease.add(influenza);
		disease.add(hivAids);
		disease.add(tuberculosis11);
		disease.add(malaria);
		disease.add(heartDisease);
		disease.add(stroke);
		disease.add(arthritis);
		disease.add(osteoporosis);
		disease.add(asthma);
		disease.add(autism);
		disease.add(downSyndrome);
		disease.add(cysticFibrosis);
		disease.add(multipleSclerosis);
		disease.add(sickleCellAnemia);
		disease.add(leukemia1);
		disease.add(schizophrenia);
		disease.add(bipolarDisorder);
		disease.add(depression);
		disease.add(anxietyDisorders);
		disease.add(ocd);
		disease.add(ptsd);
		disease.add(touretteSyndrome);
		disease.add(crohnsDisease1);
		disease.add(ulcerativeColitis1);
		disease.add(cervicalCancer11);
		disease.add(vaginalCancer1);
		disease.add(vulvarCancer1);
		disease.add(testicularCancer11);
		disease.add(penileCancer1);
		disease.add(prostateCancer111);
		disease.add(bladderCancer111);
		disease.add(colorectalCancer1);
		disease.add(skinCancer1);
		disease.add(niemannPickDisease1);
		disease.add(pancreaticCancer1);
		disease.add(endometriosis);
		disease.add(menstrualDisorders);
		disease.add(ovarianCancer1);
		disease.add(testicularCancer11);
		disease.add(prostateCancer111);
		disease.add(bladderCancer111);
		disease.add(colorectalCancer1);
		disease.add(skinCancer1);
		disease.add(pancreaticCancer1);
		disease.add(brainCancer);
		disease.add(lymphoma1);
		disease.add(esophagealCancer1);
		disease.add(stomachCancer);
		disease.add(lungCancer);
		disease.add(liverCancer1);
		disease.add(kidneyCancer);
		disease.add(boneCancer);
		disease.add(thyroidCancer);
		disease.add(cervicalCancer11);
		disease.add(oralCancer);
		disease.add(breastCancer);
		disease.add(cerebralPalsy);
		disease.add(polio);
		disease.add(sepsis);
		disease.add(pneumonia111);
		disease.add(cholera);
		disease.add(typhoidFever);
		disease.add(chlamydia);
		disease.add(gonorrhea);
		disease.add(syphilis);
		disease.add(herpes);
		disease.add(hepatitisA);
		disease.add(hepatitisB);
		disease.add(hepatitisC);
		disease.add(rabies);
		disease.add(dengueFever1);
		disease.add(yellowFever1);
		disease.add(westNileVirus1);
		disease.add(ebola);
		disease.add(zikaVirus1);
		disease.add(measles);
		disease.add(mumps1);
		disease.add(diphtheria1);
		disease.add(pertussis);
		disease.add(tuberculosis11);
		disease.add(pneumonia111);
		disease.add(histoplasmosis1);
		disease.add(blastomycosis1);
		disease.add(coccidioidomycosis1);
		disease.add(cryptococcosis1);
		disease.add(aspergillosis1);
		disease.add(candidiasis1);
		disease.add(pneumonia111);
		disease.add(bronchitis1);
		disease.add(emphysema1);
		disease.add(pulmonaryFibrosis);
		disease.add(pneumothorax1);
		disease.add(sarcoidosis1);
		disease.add(myocarditis1);
		disease.add(pericarditis1);
		disease.add(endocarditis1);
		disease.add(atherosclerosis1);
		disease.add(aorticAneurysm1);
		disease.add(peripheralArteryDisease1);
		disease.add(varicoseVeins1);
		disease.add(deepVeinThrombosis1);
		disease.add(pulmonaryEmbolism);
		disease.add(hirschsprungsDisease1);
		disease.add(diverticulitis1);
		disease.add(gerd1);
		disease.add(pepticUlcers1);
		disease.add(prostateCancer111);
		disease.add(bladderCancer111);
		disease.add(renalCellCarcinoma1);
		disease.add(wilmsTumor1);
		disease.add(adrenalGlandTumors1);
		disease.add(neuroblastoma1);
		disease.add(retinoblastoma1);
		disease.add(osteosarcoma1);
		disease.add(ewingSarcoma1);
		disease.add(synovialSarcoma1);
		disease.add(kaposiSarcoma11);
		disease.add(leiomyosarcoma);
		disease.add(liposarcoma);
		disease.add(rhabdomyosarcoma);
		disease.add(chondrosarcoma);
		disease.add(glioblastoma);
		disease.add(meningioma);
		disease.add(medulloblastoma);
		disease.add(pituitaryAdenoma1);
		disease.add(acousticNeuroma1);
		disease.add(neurofibroma);
		disease.add(osteogenesisImperfecta1);
		disease.add(pkan);
		disease.add(sanfilippo);
		disease.add(hunter);
		disease.add(fabry);
		disease.add(gaucher);
		disease.add(taySachs);
		disease.add(canavan);
		disease.add(pompe);
		disease.add(krabbeDisease11);
		disease.add(niemannPickDisease11);
		disease.add(mucopolysaccharidosis);
		disease.add(porphyria);
		disease.add(crohnsDisease);
		disease.add(hemochromatosis1);
		disease.add(hemophilia);
		disease.add(thrombocytopenia);
		disease.add(leukemia1);
		disease.add(pituitaryAdenoma);
		disease.add(lymphoma1);
		disease.add(hashimotosThyroiditis);
		disease.add(myastheniaGravis);
		disease.add(addisonsDisease);
		disease.add(ulcerativeColitis);
		disease.add(multipleMyeloma);
		disease.add(marfanSyndrome1);
		disease.add(williamsSyndrome1);
		disease.add(ehlersDanlosSyndrome);
		disease.add(oslerWeberRenduSyndrome);
		disease.add(albinism);
		disease.add(ichthyosis);
		
		Collection<DiseaseDTO> disease1=new ArrayList<DiseaseDTO>();
		
		disease1.add(epidermolysisBullosa);
		disease1.add(hidradenitisSuppurativa);
		disease1.add(pemphigus);
		disease1.add(thalassemia1);
		disease1.add(bullousPemphigoid);
		disease1.add(lymphoma);
		disease1.add(pancreaticCancer);

		int count = 0;
		for (DiseaseDTO cure : disease) {
			if(cure.getName().contains("Z"));
			System.out.println(cure.getName());
			count++;
		}

		System.out.println("Total: " + count);

	}
}