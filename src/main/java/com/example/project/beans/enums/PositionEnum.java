package com.example.project.beans.enums;

public enum PositionEnum {
	
	PRESIDENT("1", "사장"),
	VICE_PRESIDENT("6", "부사장"),
	EXECUTIVE_MANAGER("11", "부장"),
	SENIOR_MANAGER("16", "차장"),
	MANAGER("21", "과장"),
	ASSOCIATE_MANAGER("26", "대리"),
	ASSOCIATE("31", "주임"),
	STAFF("36", "사원"),
	INTERN("41", "인턴");
	
	private String positionCode;
	private String positionName;
	
	private PositionEnum(String positionCode, String positionName){
		this.positionCode = positionCode;
		this.positionName = positionName;
	}
	
	public String getPositionCode() {
		return positionCode;
	}

	public String getPositionName() {
		return positionName;
	}

	public static String getPositionCode(String positionName){
		for (PositionEnum position : PositionEnum.values()) {
            if (position.getPositionName().equals(positionName)) {
                return position.getPositionCode();
            }
        }
        return null;
	}
}
