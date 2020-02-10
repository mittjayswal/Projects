package com.mitt.creational.builder;

public class Game {

	private String homeTeam;
	private String awayTeam;
	private int currentYardLine;
	private String stadium;
	private String weather;
	
	public String getHomeTeam() {
		return homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public int getCurrentYardLine() {
		return currentYardLine;
	}
	public String getStadium() {
		return stadium;
	}
	public String getWeather() {
		return weather;
	}
	
	
	private  Game(GameBuilder gameBuilder) {
		this.homeTeam = gameBuilder.homeTeam;
		this.awayTeam = gameBuilder.awayTeam;
		this.currentYardLine = gameBuilder.currentYardLine;
		this.stadium = gameBuilder.stadium;
		this.weather = gameBuilder.weather;
	}
	public static class GameBuilder{
		private String homeTeam;
		private String awayTeam;
		private int currentYardLine;
		private String stadium;
		private String weather;
		
		
		public GameBuilder homeTeam(String homeTeam) {
			this.homeTeam = homeTeam;
			return this;
		}
		public GameBuilder awayTeam(String awayTeam) {
			this.awayTeam = awayTeam;
			return this;
		}
		public GameBuilder currentYardLine(int currentYardLine) {
			this.currentYardLine = currentYardLine;
			return this;
		}
		public GameBuilder stadium(String stadium) {
			this.stadium = stadium;
			return this;
		}
		public GameBuilder weather(String weather) {
			this.weather = weather;
			return this;
		}
		
		public Game build() {
			if (this.homeTeam == null) {
				throw new IllegalStateException("MISSING HOME TEAM");
			}
			if (this.awayTeam == null) {
				throw new IllegalStateException("MISSING AWAY TEAM");
			}
			if (this.currentYardLine == 0) {
				throw new IllegalStateException("MISSING CURRENT YARD LINE");
			}
			if (this.stadium == null) {
				throw new IllegalStateException("MISSING STADIUM");
			}
			if (this.weather == null) {
				throw new IllegalStateException("MISSING WEATHER");
			}
			return new Game(this);
		}
		
	}
}
