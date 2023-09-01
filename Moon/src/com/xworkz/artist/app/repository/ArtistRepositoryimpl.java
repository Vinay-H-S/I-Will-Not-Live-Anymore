package com.xworkz.artist.app.repository;

public class ArtistRepositoryimpl implements ArtistRepository {
	
	String[] names=new String[TOTAL_NAMES];
	int article;
	
	@Override
	public void list(String names) {
		System.out.println("invoking list in ArtistRepositoryimpl... ");
		if(article<TOTAL_NAMES)
		{
		this.names[article]=names;
		System.out.println("Stroed "+names +" in position "+this.article);
		this.article++;
		}
		else
		{
			System.err.println("Strored names is more than total names...");
		}
	}

}
