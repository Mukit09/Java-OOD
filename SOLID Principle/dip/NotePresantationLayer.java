package com.mukit.dip;

public class NotePresantationLayer {

	private NoteLocalDatabase noteLocalDataBase;
	private NoteRemoteDatabase noteRemoteDatabase;
	
	private NotePresantationLayer() {
		
		this.noteLocalDataBase = new NoteLocalDatabase();
		this.noteRemoteDatabase = new NoteRemoteDatabase();
	}
	
	public void save(String note) {
		
		noteLocalDataBase.save(new Note(note));
		noteRemoteDatabase.save(new Note(note));
	}
}
