package api.clbo.model;


import javax.persistence.*;
import javax.swing.text.AbstractDocument;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

   @OneToMany(cascade = CascadeType.ALL)
   private Set<Comment> comment;


}
