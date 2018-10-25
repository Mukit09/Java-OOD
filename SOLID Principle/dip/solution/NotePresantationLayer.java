package com.mukit.dip.solution;

public class NotePresantationLayer {

	private NoteDataSource dataSource1;
	private NoteDataSource dataSource2;
	
	private NotePresantationLayer(NoteDataSource noteDataSource1, NoteDataSource noteDataSource2) {
		
		this.dataSource1 = noteDataSource1;
		this.dataSource2 = noteDataSource2;
	}
	
	public void save(String note) {
		
		dataSource1.save(new Note(note));
		dataSource2.save(new Note(note));
	}
}
