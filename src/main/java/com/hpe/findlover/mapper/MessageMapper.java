package com.hpe.findlover.mapper;

import com.hpe.findlover.model.Message;
import com.hpe.util.BaseTkMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper extends BaseTkMapper<Message> {
	List<Message> selectList();
}