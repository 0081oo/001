package com.kh.exam4;

import java.io.*;

public class Sample4 {

	public static void main(String[] args) {
		// FileInputStream + InputStreamReader
		// 	바이트 기반	   +   문자 보조
		try {
			File f =new File ("/Users/heeminchun/Desktop/SAMPLE.txt");
//			f.createNewFile();
			FileInputStream fis = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis);
			String s = "";
			int read;
//			byte[] bArr = new byte[1024];
//			while((read = isr.read(bArr)) != -1) {
//				if(read == bArr.length) s += new String(bArr);
//				else s += new String(bArr, 0, read);
//			}
			while(true) {
				read = isr.read();
				if(read == -1) break;
				System.out.print((char)read);
			}
//			System.out.println(s);
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// FileOutputStream + OutputSTreamWriter
		try {
			File f =new File ("/Users/heeminchun/Desktop/SAMPLE.txt");
			FileOutputStream fos = new FileOutputStream(f, true); // 그냥(f);하면 기존내용 삭제되고 적어짐
			// 위처럼 f, true 넣어주면 기존내용 이후로 적어짐
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			osw.write("Wow!");
			osw.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// FileReader + BufferedReader
		// 문자기반 + 버퍼보조
		try {
			File f =new File ("/Users/heeminchun/Desktop/SAMPLE.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder();
//			String s = "";
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
//				s += br.readLine();
//				System.out.print(br.readLine()); //알아서 line별로 가져옴
			}
			System.out.print(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// FileWriter + BufferedWriter
		try {
			File f =new File ("/Users/heeminchun/Desktop/SAMPLE.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			StringBuilder sb = new StringBuilder();
			bw.write("String");
			bw.newLine();
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
