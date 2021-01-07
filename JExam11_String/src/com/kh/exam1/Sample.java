package com.kh.exam1;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("문자열 관련 메소드");
		
		// .charAt(int index)
		// 문자열에서 index 위치에 해당하는 문자 반환(반환타입 char)
		char c = s.charAt(2);
		System.out.println("s.charAt(2) : " + c);
		
		// .equals(Object anObject)
		// 문자열과 onObject의 문자열이 동일한지 비교하여 결과 반환
		boolean b1 = s.equals("문자열 관련 메소드");
		boolean b2 = s.equals("String 관련 메소드");
		System.out.println("s.equals(\"문자열 관련 메소드\" : " + b1);
		System.out.println("s.equals(\"String 관련 메소드\" : " + b2);
		
		// .length()
		// 문자열의 길이 반환(int)
		int len = s.length();
		System.out.println("s,length() : " + len);
		
		//.compartTo(String anotherString)
		// 문자열과 anotherString의 문자열을 비교하여
		// 사전순으로 기존문자열이 앞이면 음수, 같으면 0, 뒤면 양수값 반환
		String comp = new String("ABCD");
		int dif1 = comp.compareTo("CCDE");
		int dif2 = comp.compareTo("AACD");
		System.out.println("comp.compareTo(\"BCDE\") : " + dif1);
		System.out.println("comp.compareTo(\"AACD\") : " + dif2);
		
		// concat(String str)
		// 존 문자열에 str의 문자열을 이어 붙여서 새로운 문자열 반환
		String s2 = s.concat(" 입니다.");
		System.out.println("s.concat(\" 입니다.\") : " + s2);
		
		// .equalsIgnoreCase(String anotherString)
		// .equals와 동일한 기능. 단 대소문자 구분 안한다
		String str1 = new String("abcd");
		boolean b3 = str1.equalsIgnoreCase("ABCD");
		System.out.println("str1.equalsIgnoreCase(\"ABCD\") : " + b3);
		
		// .replace(CharSequence target, CharSequence replacement)
		// 문자열에서 target에 해당하는 부분을 replacement로 변경
		String rep = new String("문자열 변경 테스트");
		String repRes = rep.replace("테스트", "TEST");
		System.out.println("rep.replace(\"테스트\", \"Test\") : " + repRes);
		
		// .toLowerCase()
		// 문자열의 알파벳 대문자를 소문자로 변경하여 반환 (String)
		String str2 = new String("abcdEFGh");
		String lowStrRes = str2.toLowerCase();
		System.out.println("str2.toLowerCase() : " + lowStrRes);
		
		// .toUpperCase()
		// 문자열의 알파벳 소문자를 대문자로 변경하여 반환 (String)
		String upStrRes = str2.toUpperCase();
		System.out.println("str2.toUpperCase() : " + upStrRes);
		
		// .split(String Regex)
		// 문자열에서 Regex에 해당하는 문자열을 기준으로 분리. 반환타입 (String[])
		String str3 = new String("2021-01-07");
		String[] date = str3.split("-");
		
		for(int i = 0; i < date.length; i++) {
			System.out.println("date[" + i + "] : " + date[i]); 
		}
		
		// .trim()
		// 문자열에서 공백을 제거하여 반환. 단 문자열의 앞/뒤 공백만 제거. 반환타입 (String[])
		String str4 = new String("    공백이 있는 문자열    ");
		String trimStr = str4.trim();
		System.out.println("str4.trim() : " + trimStr);
		
		// String.format(String format, Object... args)
		// format 문자열 형식에 해당하는 문자열을 반환
		String formatStr = String.format("%d %.2f %s", 10, 12.3456, "abcd");
		String formatStr1 = String.format("%s-%s-%s", date[0], date[1], date[2]);
		// 여기서 1$는 객체의 인덱스0, 2$는 객체의 인덱스1 ... 이런식
		String formatStr2 = String.format("%1$s-%2$s-%3$s", date);
		System.out.println(formatStr);
		System.out.println(formatStr1);
		System.out.println(formatStr2);
		
		// String.join(CharSequence delimiter, CharSquence... elements)
		// 클래스 메소드로 delimiter 문자열 구분자를 기본으로 하는 문자열 결합 반환
		String joinStr = String.join("-", date[0], date[1], date[2]);
		String joinStr2 = String.join("-", date);
		System.out.println(joinStr);
		System.out.println(joinStr2);
	}

}
