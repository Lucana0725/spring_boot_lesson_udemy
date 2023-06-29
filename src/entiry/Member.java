package entiry;

public class Member {
  
  // フィールド
  private int id;
  private String name;
  private String email;

  // コンストラクタ  intには0, Stringにはnullが入る状態
  // public Member() {

  // }
  // コンストラクタ
  public Member(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }




}