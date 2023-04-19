package org.ruben.java.excel.bucle;

import org.ruben.java.excel.simple.Excel;

public class Main {

	public static void main(String[] args) {
		Excel excel = new Excel("src/main/resources/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();
	}

}
