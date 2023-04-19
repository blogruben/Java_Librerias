package org.ruben.java.excel.simple;

public class Main {

	public static void main(String[] args) {
		
		//libreria poi
		Excel excel = new Excel("src/main/resources/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();
	}

}
