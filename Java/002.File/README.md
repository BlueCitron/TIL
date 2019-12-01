# 입출력 스트림

java.io 패키지에서 제공하는 여러 종류의 스트림은 다음과 같이 두 종류의 스트림으로 구분된다.
* 바이트 기반 스트림
    * 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
    * 최상위 클래스로는 InputStream / OutputStream 등이 있다.
* 문자 기반 스트림
    * 문자 데이터를 읽고 출력할 때 사용
    * 최상위 클래스로는 Reader / Writer 등이 있다.

## 바이트 출력 스트림(OutputStream)
바이트 기반 출력 스트림은 최상위 클래스인 OutputStream를 상속받아 만들어지며 종류는 다음과 같다.
* FileOutputStream
* PrintStream
* BufferedOutputStream
* DataOutputStream

## 바이트 입력 스트림(InputStream)
바이트 기반 입력 스트림은 마찬가지로 InputStream 클래스를 상속받아 만들어지며 종류는 다음과 같다.
* FileInputStream
* BufferedInputStream
* DataInputStream

 