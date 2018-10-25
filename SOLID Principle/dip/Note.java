package com.mukit.dip;

import java.time.LocalDateTime;

public class Note {

	private static long idGen = 0;
	
	private Long id;
	private String note;
	private LocalDateTime createdDate = LocalDateTime.now();
	
	public Note(String note) {

		this.note = note;
		this.id = idGen++;
	}

	public long getId() { return id; }

	public void setId(long id) { this.id = id; }

	public String getNote() { return note; }

	public void setNote(String note) { this.note = note; }

	public LocalDateTime getCreatedDate() { return createdDate; }

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate; 
	}
	
}