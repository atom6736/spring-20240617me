package com.chihwancompany.blog.dto;

public class MemberDto {

	//테이블당 DTO하나씩 만들게 된다. 게터세터를 쓰게 되는데 private로 감춰놨기 때문.
	//다섯개의 정보를 포함하고 있는 정보를 백개 전달해야 회원마다 DTO가 하나씩 끊어질 것.
	//그러므로 테이블당 DTO하나씩. 무조건 만들 수 있어야 한다. 프라이빗으로 무조건 선언.
	private String memberid; //파라미터 이름과 똑 같이 작명하는게 좋다. 
	private String memberpw;
	private String membername;
	private String memberage;
	private String memberemail;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(String memberid, String memberpw, String membername, String memberage, String memberemail) {
		super();
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberage = memberage;
		this.memberemail = memberemail;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpw() {
		return memberpw;
	}
	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberage() {
		return memberage;
	}
	public void setMemberage(String memberage) {
		this.memberage = memberage;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	
	
	
	
	
	
}
