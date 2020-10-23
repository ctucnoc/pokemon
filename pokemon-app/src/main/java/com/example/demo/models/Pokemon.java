package com.example.demo.models;

public class Pokemon {
	private String urlImg;
	private int number;
	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNumber() {
		String [] urlPartes=url.split("/");
		return Integer.parseInt(urlPartes[urlPartes.length-1]);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUrlImg() {
		return "https://pokeres.bastionbot.org/images/pokemon/"+getNumber()+".png";
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	

}
