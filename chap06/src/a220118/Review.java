﻿package a220118;

public class Review {
// 복습
	
	/*
	 * 변수의 종류 세가지
	 * 인스턴스변수 : 클래스의 인스턴스 생성할 때 만들어짐 (서로 다른 값 가넝)
	 * 클래스변수   : 인스턴스 변수 앞에 static (전역변수, 공통된 저장공간(변수)공유)
	 * 지역변수     : 메서드 내에 선언되어 메서드 안에서만 사용가능.
	 * 				  메서드가 종료되면 소멸되어 사용불가
	 */
	
//	변수는 값만저장하지만 메서드는 기능을 수행하기 때모네 
	
	/*
	 * 메서드 선언부 : 이름 , 반환타입, 선언(입력)
	 * 메서드 구현부 : 실제 메서드가 수행할 일들 
	 * 				   맨 마지막에 return result;
	 * 
	 * return result; void인경우 리턴 안써도 됨.
	 * 값의 타입은 반환타입과 일치하거나 적어도 자동형변환 가능해야함
	 * 
	 * 변수 result에 저장된 값을 호출한 메서드로 반환
	 * 
	 * JVM의 호출스택 에서 확인가능
	 * 현재 실행중 프로그램 내 몇개의 메서드가 있는지 
	 * 
	 * 메서드 : 선언, 호출파트로 나뉘어져있음
	 * 
	 * 메서드에리어 : 설계도관리(클래스 데이터 그자체 관리) ==> 메서드 선언하는 부분 (통째로 메서드 다)
	 * 호출 스택 = 지역변수관리, 현재 실행중인 인스턴스, 메서드를 호출하는 부분들만 관리
	 * 힙 = 인스턴스 관리
	 * 
	 */
	
	/*
	 * 클래스 메서드(static 메서드)와 인스턴스 메서드
	 * 클래스 메서드는 클래스변수처럼 객체생성없이도 호출가능
	 * 클래스 메서드 : 인스턴스와 관계없는 메서드를 클래스 메서드로 정의
	 * 
	 * 
	 * 인스턴스 메서드는 반드시 객체를 생성해야만 호출 가능
	 * 인스턴스 메서드 : 인스턴스 변수와 관련된 작업을 하는, 
	 * 					 메서드의 작업을 수행하는데 인스턴스변수를 필요로 하는 메서드
	 * 
	 * 특별한 이유가 없는 한 클래스 메서드로 정의하는게 일반적
	 * 
	 * 멤버변수 : 클래스변수 + 인스턴스 변수
	 * 
	 */
	
	/*
	 * 3.12 p280
	 * 클래스 멤버와 인스턴스 멤버간의 참조와 호출
	 * 
	 * 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출 가능
	 * 단 클래스멤버가 인스턴스
	 * 
	 * 상호간 호출
	 * 
	 * 
	 * 
	 */
	

	/*
	 * 클래스 변수의 초기화 : 클래스 처음 로딩될 때 단 한번
	 * 인스턴스 변수 초기화 : 인스턴스 생성될 때마다 각 인스턴스 별로 초기화
	 */
	
	public static void main(String[] args) {
		Math.random(); //Math 가 클래스 이름
	}
	
	
	
	
}
