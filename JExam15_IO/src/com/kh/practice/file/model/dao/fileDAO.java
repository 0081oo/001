package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.IOException;

public class fileDAO {
	/*
	 *  파일 읽기 / 쓰기 작업을 직접적으로 행하는 클래스
	 */
	
	private File f = new File("/Users/heeminchun/Desktop/mywork");
	
	public fileDAO() {
		if(!this.f.exists()) f.mkdir();
	}
	
	public String[] listFile() {
		/*
		 *  현재 위치에 존재하는 모든 파일 및 디렉토리 목록을 return
		 */
		String[] list = f.list();
		return list;
	}

	public void addFile(String name) {
		File nf = new File("/Users/heeminchun/Desktop/mywork" + "/" + name);
		try {
			nf.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성중 IOException 발생");
		}
		
	}
}
