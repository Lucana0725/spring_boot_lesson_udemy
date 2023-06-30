package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
  
  String greet(int i);

  ArrayList<Member> getAll();

  // ミニ課題1
  int sumOf(int x, int y);

}
