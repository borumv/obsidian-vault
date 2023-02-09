---
tags: [java, hibernate] 
date: 06-04-2022
---
Для операциями над дочерними сущностями в рамках [Hibernate](_Hibernate.md)

```java
@Data
@NoArgsConstructor
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String title;

    public Topic(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment){
        this.comments.add(comment);
        comment.setTopic(this);
    }
    public void removeComment(Comment comment){
        this.comments.remove(comment);
        comment.setTopic(null);
    }
}

```


>как видно из примера, каскадный тип можно указывать внутри аннотации отношения, в данном случае это [[OneToMany]]

