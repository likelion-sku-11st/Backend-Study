public class ex3 {
    private int width;
    private int height;
    //인자로 아래서 들어온 width , height가 저장이 된다

    //생성자
//	public Rectangle(int width, int height) {
//// System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입려해주세요.");
// this.width = width;
// this.height = height;
// }

    //가로의 길이만 받음
    public ex3 (int width) {
        this.width = width;
    }

    // 게터, 세터 함수
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    //메서드
    public int area() {
        return width * height;
    }
}
