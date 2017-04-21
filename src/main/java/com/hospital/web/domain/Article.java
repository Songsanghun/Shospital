package com.hospital.web.domain;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Component	@Data
public class Article {
	@Getter @Setter
	private	String art_seq,writerId,name,title,content,regDate,readCount;
	
	@Override
	public String toString() {
		return String.format("[%s | %s | %s | %s | %s]", art_seq,writerId,title,regDate,"0"); //String.format("%s",""); 일단 이런 틀을 만들고 해라. seq : 일련번호
	}
}
