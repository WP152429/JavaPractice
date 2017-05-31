/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Movie.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 31.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	public String getTitle() {
		return title;
	}
	public int getLimitAge() {
		return limitAge;
	}
	public void buyTicket(int age) throws Exception{
		if(age<limitAge)
			throw new Exception(title+"은/는 "+limitAge+"세 이상 관람가입니다.");
		System.out.println(title+" 즐감하세요.");
	}
}
