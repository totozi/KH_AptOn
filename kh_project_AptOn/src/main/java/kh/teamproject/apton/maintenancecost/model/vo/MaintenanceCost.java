package kh.teamproject.apton.maintenancecost.model.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

//HOUSE_NUM             NOT NULL NUMBER 관리비
//common_cost_num      NOT NULL NUMBER 공동 관리비
//M_COST                NOT NULL NUMBER 일반관리비
//CLEAN_COST            NOT NULL NUMBER 청소비
//SECU_COST             NOT NULL NUMBER 경비비
//ELEVATOR_COST         NOT NULL NUMBER 승강기유지비
//DISIN_COST            NOT NULL NUMBER 소독비
//ELEC_COST             NOT NULL NUMBER 전기료
//HOUSE_WATER_COST      NOT NULL NUMBER 세대수도료
//MAINTENANCE_COST_DATE NOT NULL DATE  날짜

public class MaintenanceCost {
	private long houseNum;
	private int commonCostNum;
	private int mCost;
	private int cleanCost;
	private int secuCost;
	private int elevatorCost;
	private int disinCost;
	private int elecCost;
	private int houseWaterCost;
	private String maintenanceCostDate;
	private int price;
	
	public MaintenanceCost() {}
	public MaintenanceCost(long houseNum, int commonCostNum, int mCost, int cleanCost, int secuCost, int elevatorCost,
			int disinCost, int elecCost, int houseWaterCost, String maintenanceCostDate, int price) {
		super();
		this.houseNum = houseNum;
		this.commonCostNum = commonCostNum;
		this.mCost = mCost;
		this.cleanCost = cleanCost;
		this.secuCost = secuCost;
		this.elevatorCost = elevatorCost;
		this.disinCost = disinCost;
		this.elecCost = elecCost;
		this.houseWaterCost = houseWaterCost;
		this.maintenanceCostDate = maintenanceCostDate;
		this.price = price;
	}

	public long getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(long houseNum) {
		this.houseNum = houseNum;
	}

	public int getCommonCostNum() {
		return commonCostNum;
	}

	public void setCommonCostNum(int commonCostNum) {
		this.commonCostNum = commonCostNum;
	}

	public int getmCost() {
		return mCost;
	}

	public void setmCost(int mCost) {
		this.mCost = mCost;
	}

	public int getCleanCost() {
		return cleanCost;
	}

	public void setCleanCost(int cleanCost) {
		this.cleanCost = cleanCost;
	}

	public int getSecuCost() {
		return secuCost;
	}

	public void setSecuCost(int secuCost) {
		this.secuCost = secuCost;
	}

	public int getElevatorCost() {
		return elevatorCost;
	}

	public void setElevatorCost(int elevatorCost) {
		this.elevatorCost = elevatorCost;
	}

	public int getDisinCost() {
		return disinCost;
	}

	public void setDisinCost(int disinCost) {
		this.disinCost = disinCost;
	}

	public int getElecCost() {
		return elecCost;
	}

	public void setElecCost(int elecCost) {
		this.elecCost = elecCost;
	}

	public int getHouseWaterCost() {
		return houseWaterCost;
	}

	public void setHouseWaterCost(int houseWaterCost) {
		this.houseWaterCost = houseWaterCost;
	}

	public String getMaintenanceCostDate() {
		return maintenanceCostDate;
	}

	public void setMaintenanceCostDate(String maintenanceCostDate) {
		this.maintenanceCostDate = maintenanceCostDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MaintenanceCost [houseNum=" + houseNum + ", commonCostNum=" + commonCostNum + ", mCost=" + mCost
				+ ", cleanCost=" + cleanCost + ", secuCost=" + secuCost + ", elevatorCost=" + elevatorCost
				+ ", disinCost=" + disinCost + ", elecCost=" + elecCost + ", houseWaterCost=" + houseWaterCost
				+ ", maintenanceCostDate=" + maintenanceCostDate + ", price=" + price + "]";
	}

	
	
	
	
	
	
}
