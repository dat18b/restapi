package api.clbo.controller;

import api.clbo.model.Post;
import api.clbo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    PostRepository postRepository;
    @CrossOrigin()
    @GetMapping("/posts")
    public @ResponseBody Iterable<Post> getAll(){
        return postRepository.findAll();
    }

    @CrossOrigin()
    @GetMapping("/posts/{id}")
    public @ResponseBody Optional<Post> get(@PathVariable("id") String id){
        return postRepository.findById(Long.valueOf(id));
    }

    @CrossOrigin()
    @PostMapping("/posts")
    public @ResponseBody String add(@ModelAttribute Post p){

        postRepository.save(p);

        return "{msg : Resource added }";
    }

    @PutMapping("/posts")
    public @ResponseBody String update(@ModelAttribute Post p){

        postRepository.save(p);

        return "{msg : Resource updated or added }";
    }

    @DeleteMapping("/posts/{id}")
    public @ResponseBody String delete(@PathVariable("id") String id){

        postRepository.deleteById(Long.valueOf(id));

        return "{msg : Resource deleted }";
    }

}
