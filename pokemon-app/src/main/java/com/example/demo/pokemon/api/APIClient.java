package com.example.demo.pokemon.api;

import com.example.demo.util.Constant;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

	private static Retrofit retrofit=null;
	
	public static Retrofit getClient() {
		System.out.println(Constant.PATH_API_POKEMON);
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		retrofit=new Retrofit.Builder()
				.baseUrl(Constant.PATH_API_POKEMON)
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();
		return retrofit;
	}
}
