package model;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class TempConverter {
	
	private String tempSelection;
	private double temp;
	
	
	public TempConverter() {
		super();
	}
	
	public TempConverter(double temp) {
		super();
		this.temp = temp;
	}
	public String getTempSelection() {
		return tempSelection;
	}

	public void setTempSelection(String tempSelection) {
		this.tempSelection = tempSelection;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public void convertToFahrenheit(double temp) {
		this.temp = ((temp * 9/5) + 32);
	}
	
	public void convertToCelsius(double temp) {
		this.temp = ((temp - 32) * 5/9);
	}
	
	@Override
	public String toString() {
		return "Temp: " + temp + " " + tempSelection;
	}
	
}
