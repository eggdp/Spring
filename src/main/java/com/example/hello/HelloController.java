package com.example.hello;

import com.example.hello.dto.TbMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //레스트 콘트롤로가 아니므로 템틀리츠에 index. 를찾아서 부른다.
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/insert")
    public String insert() {
        return "insert";
    }

    @PostMapping ("/insert_proc")
    @ResponseBody
    public String insert_proc(@ModelAttribute TbMenu tbmenu) {
        System.out.println(tbmenu.getMenu());
        System.out.println(tbmenu.getPrice());
        System.out.println(tbmenu.getImg());
        return "데이터 전달";
    }
}
