package com.xworkz.boot;

import com.xworkz.dto.VendorDTO;
import com.xworkz.dto.constants.GstAndSerialNo;

public class VendorRunner {

	public static void main(String[] args) {

		VendorDTO dto = new VendorDTO();
		dto.setNames(GstAndSerialNo.SOFTWARE);
		System.out.println(dto);
		System.out.println("GST No :" + GstAndSerialNo.SOFTWARE.getGstNo() +"\nSerial No :"
				+ GstAndSerialNo.SOFTWARE.getSerialNo());

	}

}
