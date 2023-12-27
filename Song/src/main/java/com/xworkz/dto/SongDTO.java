package com.xworkz.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SongDTO {

	@NotEmpty(message = "Song name cannot be empty")
	@Size(min = 4,max = 15,message = "Song name should be min 4 or max 15")
	private String songName;
	
	@NotEmpty(message = "Singer name cannot be empty")
	@Size(min = 5,max = 15,message = "Singer name should be min 4 or max 15")
	private String singerName;
	
	@NotEmpty(message = "Composer name cannot be empty")
	private String composer;
	
	@NotEmpty(message = "Song name cannot be empty")
	@Size(min = 4,max = 15,message = "Song name should be min 4 or max 15")
	private String duration;
	
	@NotEmpty(message = "Album name should be mandatory")
	@Size(min = 3,max = 15,message = "Album name should be min 4 or max 10")
	private String album;
	
	@NotEmpty(message = "Song name cannot be empty")
	@Size(min = 4,max = 15,message = "Song name should be min 4 or max 15")
	private String language;
	
	@NotEmpty(message = "Release Date cannot be empty")
	private String releaseDate;
	
	@NotEmpty(message = "Lyricist name cannot be empty")
	private String lyricist;
	
	@NotEmpty(message = "Producer name cannot be empty")
	@Size(min = 4,max = 10,message = "Producer name should be min 4 or max 10")
	private String producer;
	
	@NotEmpty(message = "Director name cannot be empty")
	@Size(min = 4,max = 15,message = "Director name should be min 4 or max 10")
	private String director;
}
