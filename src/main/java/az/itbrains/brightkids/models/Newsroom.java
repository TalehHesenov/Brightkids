package az.itbrains.brightkids.models;
import az.itbrains.brightkids.models.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Newsroom extends BaseEntity {

    private String title;
    private String imageUrl;
    private String category;

    @Column(nullable = false)
    private LocalDateTime publishedAt;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    private String actionText;
    private String actionUrl;
    private String buttonText;
    private String buttonUrl;
}