<<<<<<< HEAD
package com.modeul.web.entity;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stuff {
	private int id;
	private String title;
	private String place;
	private Date regDate;
	private int numPeople;
	private String url;
	private LocalDateTime deadline;
	private String price;
	private String content;
	private int memberId;
	private long catecoryId;
}
=======
package com.modeul.web.entity;

import java.util.Date;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stuff {
	
	private Long id;
	private String title;
	private String place;
	private Date regDate;
	private String numPeople;
	private String url;
	private Date deadline;
	private String price;
	private String content;
	private Long memberId;
	private long categoryId;

}
>>>>>>> branch 'dev2' of https://github.com/Modeul/Modeul.git