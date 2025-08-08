package com.example.testMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkTestController {
    @GetMapping("/articles/main")
    public String main() {
        return "articles/main";
    }

    @GetMapping("/articles/list")
    public String listAll(){
    return "/articles/list_all";
    }

    @GetMapping("/articles/{id}")
    public String listOne(@PathVariable("id") int id, Model model){
        String msg = id + "번 게시글 읽어오기 성공";
        model.addAttribute("msg", msg);
        return "/articles/list_one";
    }

    @GetMapping("/articles/create")
    public String create(@RequestParam("name") String name,@RequestParam("weight") int weight,
                         @RequestParam("height") int height, Model model){
        model.addAttribute("info",
                name + "의 키는" + height + "이고, 몸무게는" + weight + "입니다.");
        return "/articles/new";
    }

    @GetMapping("/articles/update")
    public String updateOk(){
        return "/articles/update_ok";
    }


    @GetMapping("/articles/{id}/update")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("num", id + "번 게시글 수정 폼 로딩 완료");
        return "/articles/update";
    }

    @GetMapping("/articles/{id}/delete")
    public String deleteOK(@PathVariable("id") int id, Model model){
        model.addAttribute("num1",id + "번 글 삭제 완료");
        return "/articles/delete_ok";
    }

    @GetMapping("/articles/{id}/articleComment")
    public String commentView(@PathVariable("id") int id, Model model){
        model.addAttribute("num", id + "번 게시글의 모든 댓글보기 성공");
        return "/articles/comment_view";
    }

    @GetMapping("/articles/{id}/articleComments/{article-comment-id}/delete")
    public String delete(@PathVariable("id") int id,
                         @PathVariable("article-comment-id") int commentId, Model model) {
        model.addAttribute("num2", id + "번 게시글의" + commentId + "번째 답글 삭제 완료");
        return "/articles/delete_ok";
    }

}
