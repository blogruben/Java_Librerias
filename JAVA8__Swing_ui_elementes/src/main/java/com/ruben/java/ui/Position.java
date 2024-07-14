package com.ruben.java.ui;

interface Linea {
    int getLinea();
    int getPositionX();
}


public enum Position implements Linea  {
    FIRST_COLUMN(0) {
        @Override
        public int getLinea() {
            return line_first_column++;
        }
    }, SECOND_COLUMN(1) {
        @Override
        public int getLinea() {
            return line_second_column++;
        }
    }, THIRD_COLUMN(2) {
        @Override
        public int getLinea() {
            return line_third_column++;
        }
    }, FOURTH_COLUMN(3) {
        @Override
        public int getLinea() {
            return line_third_column++;
        }
    };

    private final int COLUMN_WIDTH = 145;
    private final int COLUMN_HEIGHT = 25;
    private final int INITIAL_WIDTH = 30;
    private final int INITIAL_HEIGHT = 60;
    private int column;
    int line_first_column;
    int line_second_column;  
    int line_third_column; 
    
	private Position(int column) {
		this.column = column;
        this.line_first_column = 0;
        this.line_second_column = 0; 
	}

    public int getPositionY() {
        return INITIAL_WIDTH + (COLUMN_WIDTH * (column));
    }

    @Override
    public int getPositionX() {
        return INITIAL_HEIGHT + (COLUMN_HEIGHT * getLinea());
    }

}

