<h1><b>IOStream with Java examples</b></h1>
<hr/>

1. InputStream으로 하나의 글자를 입력받음
<pre><code>

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;

public class IO_Ex01 {
	// 키보드 입력받기
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		InputStream is = System.in;
		
		System.out.print("단일 문자 입력 요망 : ");
		try {
            int num = is.read();  is.read(); is.read();
			int num2 = is.read(); // read는 1byte를 읽어들임 -> char형을 기본으로 받게 되므로 만일 엔터를 입력에 안들어가게 하려면 is.read()를 두번 호출해줘야함
			
			System.out.println((char)num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}
}

</code></pre>

<hr/>

2. 문자를 연속적으로 받고 출력
<pre><code>

package io_examples1;

import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		System.out.print("input = ");
		
		int su;
		
		try {
			while((su=System.in.read())!=-1) {
				if(su==10 || su==13||su==32) continue;
				if(su==113||su==81) break; // 소문자q, 대문자 Q
				
				System.out.println((char)su);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
}

</code></pre>

<hr/>

3. 문자열 입력받기 (Scanner 없이)
<pre><code>

package io_examples1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import java.io.IOException;

public class BufferedReaderEx01 {
	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(reader);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // .. 코드 길이 줄이려 한다면
		
		System.out.println("character input = ");
		String str = br.readLine();
		
		int su = Integer.parseInt(str); // 입력받은 문자열을 숫자로 변환하는 과정
		System.out.println(su);
		//System.out.println(str);
	}
}

</code></pre>

<hr/>




