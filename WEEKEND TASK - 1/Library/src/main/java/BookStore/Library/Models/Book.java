package BookStore.Library.Models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="BookDetails")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String authorName;
    @Column(nullable = false)
    private String bookName;
    @Column(nullable = false)
    private int price;

}