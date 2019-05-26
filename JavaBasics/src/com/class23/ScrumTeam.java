package com.class23;

public class ScrumTeam extends Employee{

	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifacts() {
		System.out.println("Scrum team work on "+artifacts);
	}
	
	public void attendScrumMeetings() {
		System.out.println("Scrum Team attends "+ceremonies);
	}
}