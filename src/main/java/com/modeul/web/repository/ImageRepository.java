package com.modeul.web.repository;

import org.apache.ibatis.annotations.Mapper;

import com.modeul.web.entity.Image;

@Mapper
public interface ImageRepository {
	
	// 데이터를 가져오는 것이라서 Image로 받기!!
	Image findById(Long stuffId);	
}
