package com.dr.chap01_beforVSafter.after.model.vo;

//				자식	 ------>  부모
//				하위			  상위
//				후손			  조상
public class Desktop extends Product {

	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand~price 네개의 전달값들은 부모클래스(Product)의 필드에 대입
		//this.brand = brand; // 부모필드가 private -> 접근불가
		
		// 해결방법1. 부모클래스에 있는 필드를 protected(상속 접근 가능) 접근제한자로 수정
		/*super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모필드가 무조건 private 일 경우
		// 		   public 접근제한자의 setter메소드를 호출시켜서 대입
		/*super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모 클래스에 있는 생성자 호출하기
		super(brand, pCode, pName, price);
		
		// allInOne 전달값은 현재클래스(Desktop의 필드에 바로 대입
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는 것
	public String information() {
		//return super.getBrand() + ", " + super.getpCode() + ", " + super.getpName() + ", " + super.getPrice() + ", " + allInOne;
		
		return super.information() + ", allInOne=" + (allInOne ? "일체" : "일체x");
	}
	
	
}
