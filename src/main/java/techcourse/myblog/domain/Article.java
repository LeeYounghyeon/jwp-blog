package techcourse.myblog.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 500, nullable = false)
    private String title;

    @Column(name = "contents", length = 6000, nullable = false, columnDefinition = "TEXT")
    private String contents;

    @Column(name = "coverUrl", length = 1000, nullable = false)
    private String coverUrl;

    public Article(int id, String title, String contents, String coverUrl) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.coverUrl = coverUrl;
    }

    public void updateArticle(String title, String coverUrl, String contents) {
        this.title = title;
        this.coverUrl = coverUrl;
        this.contents = contents;
    }
}
