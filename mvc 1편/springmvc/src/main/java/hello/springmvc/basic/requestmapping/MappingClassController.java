package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    //목록조회
    @GetMapping
    public String users() {
        return "get users";
    }

    //등록
    @PostMapping
    public String addUser() {
        return "post user";
    }

    //조회
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
           return "get userId=" +userId;
    }

    //수정
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId=" + userId;
    }

    //삭제
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId=" + userId;
    }

}
