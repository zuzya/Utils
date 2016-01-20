package ru.hostco.utils.bytes.test;

import java.io.Serializable;

public class DataBlock implements Serializable{

	/*
	 * Битовые поля
	 */
	private boolean DBX00;
	private boolean DBX01;
	private boolean DBX02;
	private boolean DBX03;
	private boolean DBX04;
	private boolean DBX05;
	private boolean DBX06;
	private boolean DBX07;
	private boolean DBX08;
	private boolean DBX09;
	private boolean DBX10;
	private boolean DBX11;
	private boolean DBX12;
	private boolean DBX13;
	private boolean DBX14;
	private boolean DBX15;
	
	/**
	 * 	INT
	 */
	private int DBI01;	
	private int DBI02;
	
	//значение веса
	private double DBW10;
	
	
	private float DBR01;
	
	
	public void resetAll(){
		
		//TODO: resetAll
		
	}	


	public boolean isDBX00() {
		return DBX00;
	}

	public void setDBX00(boolean dBX00) {
		DBX00 = dBX00;
	}

	public boolean isDBX01() {
		return DBX01;
	}

	public void setDBX01(boolean dBX01) {
		DBX01 = dBX01;
	}

	public boolean isDBX02() {
		return DBX02;
	}

	public void setDBX02(boolean dBX02) {
		DBX02 = dBX02;
	}

	public boolean isDBX03() {
		return DBX03;
	}

	public void setDBX03(boolean dBX03) {
		DBX03 = dBX03;
	}

	public boolean isDBX04() {
		return DBX04;
	}

	public void setDBX04(boolean dBX04) {
		DBX04 = dBX04;
	}

	public boolean isDBX05() {
		return DBX05;
	}

	public void setDBX05(boolean dBX05) {
		DBX05 = dBX05;
	}

	public boolean isDBX06() {
		return DBX06;
	}

	public void setDBX06(boolean dBX06) {
		DBX06 = dBX06;
	}

	public boolean isDBX07() {
		return DBX07;
	}

	public void setDBX07(boolean dBX07) {
		DBX07 = dBX07;
	}

	public boolean isDBX08() {
		return DBX08;
	}

	public void setDBX08(boolean dBX08) {
		DBX08 = dBX08;
	}

	public boolean isDBX09() {
		return DBX09;
	}

	public void setDBX09(boolean dBX09) {
		DBX09 = dBX09;
	}

	public boolean isDBX10() {
		return DBX10;
	}

	public void setDBX10(boolean dBX10) {
		DBX10 = dBX10;
	}

	public boolean isDBX11() {
		return DBX11;
	}

	public void setDBX11(boolean dBX11) {
		DBX11 = dBX11;
	}

	public boolean isDBX12() {
		return DBX12;
	}

	public void setDBX12(boolean dBX12) {
		DBX12 = dBX12;
	}

	public boolean isDBX13() {
		return DBX13;
	}

	public void setDBX13(boolean dBX13) {
		DBX13 = dBX13;
	}

	public boolean isDBX14() {
		return DBX14;
	}

	public void setDBX14(boolean dBX14) {
		DBX14 = dBX14;
	}

	public boolean isDBX15() {
		return DBX15;
	}

	public void setDBX15(boolean dBX15) {
		DBX15 = dBX15;
	}

	public int getDBI01() {
		return DBI01;
	}

	public void setDBI01(int dBI01) {
		DBI01 = dBI01;
	}

	public float getDBR01() {
		return DBR01;
	}

	public void setDBR01(float dBR01) {
		DBR01 = dBR01;
	}

	public int getDBI02() {
		return DBI02;
	}

	public void setDBI02(int dBI02) {
		DBI02 = dBI02;
	}

	public double getDBW10() {
		return DBW10;
	}

	public void setDBW10(double dBW10) {
		DBW10 = dBW10;
	}


	@Override
	public String toString() {
		return "DataBlock [DBX00=" + DBX00 + ", DBX01=" + DBX01 + ", DBX02=" + DBX02 + ", DBX03=" + DBX03 + ", DBX04="
				+ DBX04 + ", DBX05=" + DBX05 + ", DBX06=" + DBX06 + ", DBX07=" + DBX07 + ", DBX08=" + DBX08 + ", DBX09="
				+ DBX09 + ", DBX10=" + DBX10 + ", DBX11=" + DBX11 + ", DBX12=" + DBX12 + ", DBX13=" + DBX13 + ", DBX14="
				+ DBX14 + ", DBX15=" + DBX15 + ", DBI01=" + DBI01 + ", DBR01=" + DBR01 + ", DBI02=" + DBI02 + ", DBW10="
				+ DBW10 + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DBI01;
		result = prime * result + DBI02;
		result = prime * result + Float.floatToIntBits(DBR01);
		long temp;
		temp = Double.doubleToLongBits(DBW10);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (DBX00 ? 1231 : 1237);
		result = prime * result + (DBX01 ? 1231 : 1237);
		result = prime * result + (DBX02 ? 1231 : 1237);
		result = prime * result + (DBX03 ? 1231 : 1237);
		result = prime * result + (DBX04 ? 1231 : 1237);
		result = prime * result + (DBX05 ? 1231 : 1237);
		result = prime * result + (DBX06 ? 1231 : 1237);
		result = prime * result + (DBX07 ? 1231 : 1237);
		result = prime * result + (DBX08 ? 1231 : 1237);
		result = prime * result + (DBX09 ? 1231 : 1237);
		result = prime * result + (DBX10 ? 1231 : 1237);
		result = prime * result + (DBX11 ? 1231 : 1237);
		result = prime * result + (DBX12 ? 1231 : 1237);
		result = prime * result + (DBX13 ? 1231 : 1237);
		result = prime * result + (DBX14 ? 1231 : 1237);
		result = prime * result + (DBX15 ? 1231 : 1237);
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
		DataBlock other = (DataBlock) obj;
		if (DBI01 != other.DBI01)
			return false;
		if (DBI02 != other.DBI02)
			return false;
		if (Float.floatToIntBits(DBR01) != Float.floatToIntBits(other.DBR01))
			return false;
		if (Double.doubleToLongBits(DBW10) != Double.doubleToLongBits(other.DBW10))
			return false;
		if (DBX00 != other.DBX00)
			return false;
		if (DBX01 != other.DBX01)
			return false;
		if (DBX02 != other.DBX02)
			return false;
		if (DBX03 != other.DBX03)
			return false;
		if (DBX04 != other.DBX04)
			return false;
		if (DBX05 != other.DBX05)
			return false;
		if (DBX06 != other.DBX06)
			return false;
		if (DBX07 != other.DBX07)
			return false;
		if (DBX08 != other.DBX08)
			return false;
		if (DBX09 != other.DBX09)
			return false;
		if (DBX10 != other.DBX10)
			return false;
		if (DBX11 != other.DBX11)
			return false;
		if (DBX12 != other.DBX12)
			return false;
		if (DBX13 != other.DBX13)
			return false;
		if (DBX14 != other.DBX14)
			return false;
		if (DBX15 != other.DBX15)
			return false;
		return true;
	}
	
	

}
