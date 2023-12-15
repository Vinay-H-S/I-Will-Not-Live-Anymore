package com.xworkz.dto.constants;

public enum GstAndSerialNo {

	WHOLESALE("HDGHF4523HJ", 256315), TRANSPORTATION("GDYHFHS145263SFF", 36351), SOFTWARE("TSHGJ78565LL", 785412),
	SHIPPING("YHFHF78545L1",98545), MARKETING("SASU78455KK",785466);

	private String gstNo;
	private int serialNo;

	private GstAndSerialNo(String gstNo, int serialNo) {
		this.gstNo = gstNo;
		this.serialNo = serialNo;
	}

	public String getGstNo() {
		return gstNo;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
}
