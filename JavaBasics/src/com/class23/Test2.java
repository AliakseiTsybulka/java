package com.class23;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("---Creating Front End object---");
		FrontEnd fe = new FrontEnd();
		fe.salary=119000;
		fe.getPaid();
		fe.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		fe.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fe.attendScrumMeetings();
		fe.workOnArtifacts();
		fe.doHtml();
		
		System.out.println("---Creating Back End object---");
		BackEnd be = new BackEnd();
		be.salary=121000;
		be.getPaid();
		be.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		be.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		be.attendScrumMeetings();
		be.workOnArtifacts();
		be.doSql();
	}

}
