package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class YoutubeRunner {
	public static void main(String[] args) {
		
		Youtube channel = new Youtube();     
        channel.setChannelName("Forest king");
        channel.setOwnerName("Harshith Kumar N R");
        channel.setSubscribersCount(250000);
        channel.setVideosCount(563);
        channel.setVerified(true);
        channel.setAbout("Wildlife");
        channel.setCountry("India");
        channel.setJoinDate("2020-01-01");
        channel.setMonetized(true);
        channel.setWebsite("https://www.forestking.in");
        channel.setLiveStreamingEnabled(true);
        channel.setCommentsEnabled(true);
        channel.setNotificationsEnabled(true);
        channel.setSubtitlesEnabled(true);
        System.out.println("Channel Name: " + channel.getChannelName());
        System.out.println("Owner Name: " + channel.getOwnerName());
        System.out.println("Subscribers Count: " + channel.getSubscribersCount());
        System.out.println("Videos Count: " + channel.getVideosCount());
        System.out.println("Verified: " + channel.isVerified());
        System.out.println("About: " + channel.getAbout());
        System.out.println("Country: " + channel.getCountry());
        System.out.println("Join Date: " + channel.getJoinDate());
        System.out.println("Monetized: " + channel.isMonetized());
        System.out.println("Website: " + channel.getWebsite());
        System.out.println("Live Streaming Enabled: " + channel.isLiveStreamingEnabled());
        System.out.println("Comments Enabled: " + channel.isCommentsEnabled());
        System.out.println("Notifications Enabled: " + channel.isNotificationsEnabled());
        System.out.println("Subtitles Enabled: " + channel.isSubtitlesEnabled());
	}

}
