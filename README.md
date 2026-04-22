<img width="779" height="88" alt="image" src="https://github.com/user-attachments/assets/88852b20-028d-4562-8381-f7caba693f81" /><img width="602" height="88" alt="image" src="https://github.com/user-attachments/assets/2cc74ae2-377d-414f-bef3-31e3e468b5b9" /># collectionProject

## 알아야하는 개념들

객체지향 프로그래밍 

클래스 정의와 객체 생성 Class / Apple apple = new Apple()

상속 구현 = extends 

객체지향프로그래밍 1차원 배열 2차원 배열 = / 1차원 [] / 2차원 [][]
 
추상클래스와 인터페이스 = abstract class
 
Vector, ArrayList 클래스와 사용법

Vector 또는 HashMap 

Thread 와Runnable 인터페이스

## 바이트 스트림
InputStream/OutputStream

FileInputStream/FileOutputStream

DataInputStream/DataOutputStream

## 문자 스트림

Reader/Writer

InputStreamReader/OutputStreamWriter

FileReader/FileWriter

## 
import java.util.*;

// ArrayList 사용
ArrayList<String> list = new ArrayList<>();
list.add("A");      // 요소 추가
list.add("B");
System.out.println(list.get(0)); // A 출력

// Vector 사용
Vector<String> v = new Vector<>();
v.add("A");
v.add("B");
System.out.println(v.get(1)); // B 출력

// hashmap 사용
HashMap<String, Integer> map = new HashMap<>();

map.put("apple", 1);   // key-value 저장
map.put("banana", 2);

System.out.println(map.get("apple")); // 1 출력
