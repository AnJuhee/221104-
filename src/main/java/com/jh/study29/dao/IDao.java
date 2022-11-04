package com.jh.study29.dao;

import java.util.ArrayList;

import com.jh.study29.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();
	public void writeDao(String mwriter,String mcontent);
	public void deleteDao(String mid);
	public ContentDto mviewDao(String mid);
	public void modifyDao(String mid,String mwriter, String mcontent);
}
