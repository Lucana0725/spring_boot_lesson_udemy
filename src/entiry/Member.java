package entiry;

public class Member {
  
  // フィールド
  private int id;
  private String name;
  private String email;

  // コンストラクタ  intには0, Stringにはnullが入る状態
  public Member() {

  }
  // コンストラクタ
  public Member(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  // getter
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }

  // setter
  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void  setEmail(String email) {
    this.email = email;
  }


}