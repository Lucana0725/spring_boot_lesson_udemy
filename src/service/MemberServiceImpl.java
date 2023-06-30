package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {
  
  @Override
  // iの値によって挨拶を変更する
  public String greet(int i) {
    String[] greetings = {"Good morning", "Hello", "Good evening"};
    return greetings[i];
  }

  @Override
  // listというリストにメンバーを入れていく
  public ArrayList<Member> getAll() {
    // 空のリスト(list)を作成
    ArrayList<Member> list = new ArrayList<>();

    // Memberのインスタンスを作成
    Member mem1 = new Member(1, "Linda", "linda@example.com");
    Member mem2 = new Member(2, "James", "james@example.com");

    // listにメンバーを入れる
    list.add(mem1);
    list.add(mem2);

    // listを返す
    return list;
  }

  // ミニ課題1
  @Override
  public int sumOf(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

}
