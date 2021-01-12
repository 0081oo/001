package com.kh.exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {

	public static int wordCount(String filename, String word) {
		/*
		 *  지정한 파일의 문자열에서 word에 해당하는 단어가 몇 개 있는지 반환 
		 */
		try {
			// 읽어오기
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			
			String str = "";
			int read;
			char[] cArr = new char[512];
			while((read = fr.read(cArr)) != -1) {
				str += new String(cArr, 0, read);
			}
//			System.out.println(str);
			
			// 문자열 찾기
			// indexOf는 0번 인덱스부터 찾는다. 
			// 만약 str.indexOf(word) 를 실행하면 2가 결과값으로 나온다.
			// 두번째 인자로 어떠 인덱스를 넘겨주면 그 인덱스이후부터 다시 word를 찾는다
			// 그래서 str.indexOf(word, 2 + 1)이렇게 해주면 2 이후인 3부터 다시 word 찾는다.
			// 이후에 없다면 -1 반환한다.
			// 이걸 이용해서 반복문으로 만들면 됨! 
			int stIdx = 0;
			int count = 0;
			while(true) {
				stIdx = str.indexOf(word, stIdx);
				if(stIdx == -1) break;
				count++;
				stIdx += 1;
			}
			fr.close();
			return count;
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일 존재하지 않습니다");
		} catch (IOException e) {
			System.out.println("파일 입출력에 문제가 발생했습니다.");
		}
		// try 안에서 원하는 값 리턴해주고 밖에도 리턴 하나 해줘야함
		return 0;
	}
	
	public static void saveDirFileList(String dir) {
		/*
		 *  지정한 디렉토리 안의 폴더와 파일의 목록을 파일로 만들어 출력
		 *  숨김 파일/폴더, 일반 파일/폴더를 구분하여 저장한다.
		 */
		File f = new File(dir);
		
		if(!f.exists()) {
			System.out.println(dir + "에 해당하는 디렉토리나 파일이 없습니다");
		}
		
		File[] fList = f.listFiles();
		String nFile ="", nFolder="", dFile="", dFolder="";
		
		for(int i = 0; i < fList.length; i++) {
			// 파일이라면
			if(fList[i].isFile()) {
				if(fList[i].isHidden()) {
					dFile += fList[i].getName() + ", ";
				} else {
					nFile += fList[i].getName() + ", ";
				}
			// 디렉토리라면
			} else if(fList[i].isDirectory()){
				if(fList[i].isHidden()) {
					dFolder += fList[i].getName() + ", ";
				} else {
					nFolder += fList[i].getName() + ", "; 
				}
			}
		}
		
		try {
			FileWriter fw = new FileWriter("/Users/heeminchun/Desktop/list.txt");
			fw.write(dir + "의 파일 목록\n");
			fw.write("\t숨김 파일 목록\n");
			fw.write("\t\t" + dFile + "\n");
			fw.write("\t일반 파일 목록\n");
			fw.write("\t\t" + nFile +"\n");
			fw.write("\t숨김 폴더 목록\n");
			fw.write("\t\t" + dFolder +"\n");
			fw.write("\t일반 폴더 목록\n");
			fw.write("\t\t" + nFolder+"\n");
			
			fw.close();
			System.out.println(dir + "/list.txt 위치에 파일쓰기가 완료되었습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("입출력 오류 발생");
		} 
		
	}
	
	public static void main(String[] args) {
		/*
		 *  FileReader / FileWriter
		 *  	- 파일로부터 문자 단위의 데이터 읽기 / 쓰기
		 *  	- 주로 텍스트 파일에 대한 처리를 담당
		 */
		String filename = "/Users/heeminchun/Desktop/무제.txt";
		System.out.println(wordCount(filename, "script"));
		saveDirFileList("/Users/heeminchun/Desktop");
//		try {
//			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
//			FileReader fr = new FileReader(f);
//			int read;
//			char[] cArr = new char[4];
			// 한번에 cArr의 크기만큼 읽어온다.
			// 4바이트씩 끊어서 -1이 들어오지 않을때까지 계속 돌리기 때문에
			// abc def ab 라는 문자열이 있다면
			// "abc " 이렇게 공백포함 4글자니까 한번 이렇게 출력되고 
			// 그다음이 "def " 이렇게 그다음이 "ab"인데 4개가 되려면 2글자가 남는다. 
			// 따라서 앞에있던 문자들까지 해서 4글자 즉 "f ab"이렇게 출력된다.
//			while((read = fr.read(cArr)) != -1) {
//				System.out.print(cArr);
//			}
//			String str = "";
//			StringBuffer sb = new StringBuffer();
			// 한번에 내가 지정한 cArr의 크기만큼 읽어오기 때문에 (데이터가 그만큼 있다는 가정하에)
			// read에는 cArr의 길이가 저장된다. 4만큼 읽으면 4, 2만큼 읽으면 2 이렇게
//			while((read = fr.read(cArr)) != -1) {
//				str += new String(cArr, 0, read);
//				sb.append(cArr, 0, read);
//				if(cArr.length == read) {
//					str += new String(cArr); // String은 char[] 자료형을 String으로 만들어주는생성자가 있다
//					sb.append(cArr);
//				} else {
//					for(int i = 0; i < read; i++) {
//						str += cArr[i];
//						sb.append(cArr[i]);
//					}
//				}
				
//			}
//			System.out.println(str);
//			System.out.println(sb.toString());
//			fr.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("FileNotFound Error");
//		} catch (IOException e) {
//			System.out.println("IOException Error");
//		} 
		
		// 파일 쓰기
//		try {
//			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
//			FileWriter fw = new FileWriter(f);
//			fw.write("파일에 문자열 쓰기");
//			fw.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("FileNotFound Error");
//		} catch (IOException e) {
//			System.out.println("IOException Error");
//		} 
		
	}

}
